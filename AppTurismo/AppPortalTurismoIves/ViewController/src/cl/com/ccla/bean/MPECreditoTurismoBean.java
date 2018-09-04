package cl.com.ccla.bean;


import cl.com.ccla.type.consultadatosturismo.CCLAMWClientsType;
import cl.com.ccla.type.consultadatosturismo.EntConsultarDatosTurismoInReqType;
import cl.com.ccla.type.consultadatosturismo.EntConsultarDatosTurismoOutResTYPE;
import cl.com.ccla.type.consultadatosturismo.ObjectFactory;
import cl.com.ccla.type.consultadatosturismo.PersonaTYPE;
import cl.com.ccla.webservice.consultadatosturismo.ConsultarDatosTurismoBindingQSService;
import cl.com.ccla.webservice.consultadatosturismo.ConsultarDatosTurismoOperacionPortType;


import java.io.IOException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.JAXBElement;

//import org.codehaus.jackson.map.ObjectMapper;


public class MPECreditoTurismoBean {
    public MPECreditoTurismoBean() {
        super();
    }
    
    EntConsultarDatosTurismoInReqType reqOSB;
    EntConsultarDatosTurismoOutResTYPE respOSB;  
    
    public static void main(String[] args) throws IOException
                                                   {
            MPECreditoTurismoBean  mpe=new MPECreditoTurismoBean();
            Calendar  fechaGrab  = Calendar.getInstance();       
            List<CCLACuotaTurismo> list=     mpe.turismo(new BigInteger("9178468"));
                   
                  //  JsonObject jsonAccountInquiry;

        
          
         
          //Object to JSON in file
    //      mapper.writeValue(new File("c:\\file.json"), obj);

          //Object to JSON in String
      
            System.out.println(list.get(0).getFechaVencimiento());
            System.out.println(list.get(1).getFechaVencimiento());
            System.out.println(list.get(2).getFechaVencimiento());
            System.out.println(list.get(3).getFechaVencimiento());
         //   dato.setFechaGrab(fechaGrab);
      }
    
    
    public List<CCLACuotaTurismo> turismo(BigInteger rut){
            List<CCLACuotaTurismo> turismo = new ArrayList<CCLACuotaTurismo>();
            CCLACuotaTurismo dato;
            Calendar  checkIN    = Calendar.getInstance();
            Calendar  checkOut   =  Calendar.getInstance();
            Calendar  fechaGrabacion   =  Calendar.getInstance();                                                            
             reqOSB = new EntConsultarDatosTurismoInReqType();
             respOSB = new EntConsultarDatosTurismoOutResTYPE();
            ConsultarDatosTurismoBindingQSService callwebservice = new ConsultarDatosTurismoBindingQSService();
            ConsultarDatosTurismoOperacionPortType ejecutaOperacionOSB = callwebservice.getConsultarDatosTurismoBindingQSPort();
            CCLAMWClientsType header= new CCLAMWClientsType();
            PersonaTYPE persona= new PersonaTYPE ();
            ObjectFactory objectFactory= new ObjectFactory();
            BigDecimal _rut= new BigDecimal(rut);
            JAXBElement <BigDecimal> rut_ = objectFactory.createPersonaTYPERut(_rut);
            persona.setRut(rut_);
            header.setAplicacion("CCLA");
            header.setComponente("CCLA");
            header.setPlataforma("CCLA");
            reqOSB.setPersona(persona);
            respOSB=ejecutaOperacionOSB.consultarDatosTurismo(reqOSB, header);
            for(int i=0; i<ejecutaOperacionOSB.consultarDatosTurismo(reqOSB, header).getListaTurismo().getTurismo().size();i++){//respOSB.getListaTurismo().getTurismo().size();i++){
                dato =  new CCLACuotaTurismo();
                dato.setCapacidadHabitacion(respOSB.getListaTurismo().getTurismo().get(i).getCapacidadHabitacion().getValue().toBigInteger().intValue());
                dato.setCentro(respOSB.getListaTurismo().getTurismo().get(i).getCentro().getValue());
                checkIN.set(respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getYear(),respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getMonth(),respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getDay(), respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getHour(), respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getMinute(), respOSB.getListaTurismo().getTurismo().get(i).getCheckIn().getValue().getSecond());
                dato.setCheckIn("12/12/2018");
                checkOut.set(respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getYear(),respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getMonth(),respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getDay(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getHour(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getMinute(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getSecond());    
                dato.setCheckOut("12/12/2018");
                dato.setCodigoReserva(respOSB.getListaTurismo().getTurismo().get(i).getCodigoReserva().getValue());
                dato.setCodigoSucursal(respOSB.getListaTurismo().getTurismo().get(i).getCodigoSucursal().getValue());
                dato.setCorrelativoComprobante(respOSB.getListaTurismo().getTurismo().get(i).getCorrelativoComprobante().getValue());
                dato.setCuentaPeriodo(respOSB.getListaTurismo().getTurismo().get(i).getCuentaPeriodo().getValue());
                dato.setIdCuota(Integer.parseInt(respOSB.getListaTurismo().getTurismo().get(i).getIdCuota().getValue().toString()));
                dato.setEstado(respOSB.getListaTurismo().getTurismo().get(i).getEstado().getValue());
                dato.setEstadoCi(respOSB.getListaTurismo().getTurismo().get(i).getEstadoCi().getValue());
                String fechaGrab="";
                dato.setFechaVencimiento("12/12/2018");
                dato.setIdCuota(respOSB.getListaTurismo().getTurismo().get(i).getIdCuota().getValue().toBigInteger().intValue());
                dato.setMntPendiente(respOSB.getListaTurismo().getTurismo().get(i).getMntPendiente().getValue());
                dato.setMontoCi(respOSB.getListaTurismo().getTurismo().get(i).getMontoCi().getValue());
                dato.setNroHabitacion(respOSB.getListaTurismo().getTurismo().get(i).getNroHabitacion().getValue().toBigInteger().intValue());
//                dato.setNroReserva(new BigDecimal(respOSB.getListaTurismo().getTurismo().get(i).getCodigoReserva().getValue().toString()));
                
                dato.setNumeroComprobante(respOSB.getListaTurismo().getTurismo().get(i).getNumeroComprobante().getValue());
                dato.setRegion(respOSB.getListaTurismo().getTurismo().get(i).getRegion().getValue());
                dato.setTipoDocumento(respOSB.getListaTurismo().getTurismo().get(i).getTipoDocumento().getValue());
                dato.setTipoHabitacion(respOSB.getListaTurismo().getTurismo().get(i).getTipoHabitacion().getValue());
                checkOut.set(respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getYear(),respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getMonth(),respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getDay(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getHour(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getMinute(), respOSB.getListaTurismo().getTurismo().get(i).getCheckOut().getValue().getSecond());    
                    
                turismo.add(dato);
                
                }
            return turismo;
        }  

}

