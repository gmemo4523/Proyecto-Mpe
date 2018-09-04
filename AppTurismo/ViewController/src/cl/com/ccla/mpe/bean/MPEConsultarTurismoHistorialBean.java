package cl.com.ccla.mpe.bean;


import cl.com.ccla.mpe.type.consultarhistorialturismo.EntConsultarHistorialTurismoInReqType;
import cl.com.ccla.mpe.type.consultarhistorialturismo.EntConsultarHistorialTurismoOutResTYPE;
import cl.com.ccla.mpe.type.consultarhistorialturismo.CCLAMWClientsType;
import cl.com.ccla.mpe.type.consultarhistorialturismo.ObjectFactory;
import cl.com.ccla.mpe.type.consultarhistorialturismo.PersonaTYPE;


import cl.com.ccla.mpe.webservice.consultarhistorialturismo.ConsultarHistorialTurismoBindingQSService;

import cl.com.ccla.mpe.webservice.consultarhistorialturismo.ConsultarHistorialTurismoOperacionPortType;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.JAXBElement;

public class MPEConsultarTurismoHistorialBean {
    public MPEConsultarTurismoHistorialBean() {
        super();
    }

    EntConsultarHistorialTurismoInReqType reqOSB;
    EntConsultarHistorialTurismoOutResTYPE resOSB;

    public static void main(String[] args) {
        MPEConsultarTurismoHistorialBean mpe = new MPEConsultarTurismoHistorialBean();
        ArrayList<CCLAHistorialTurismoConsultar> respuesta = mpe.turismo(new BigInteger("259916011"));
        System.out.println(respuesta.size());
        System.out.println(respuesta.get(0).getFechaComprobante().toString());
    }


    public ArrayList<CCLAHistorialTurismoConsultar> turismo(BigInteger rut) {
        ArrayList<CCLAHistorialTurismoConsultar> historial;
        CCLAHistorialTurismoConsultar dato;
        Calendar checkIn = Calendar.getInstance();
        Calendar checkOut = Calendar.getInstance();
        Calendar fechaComprobante = Calendar.getInstance();
        Calendar fechaPago = Calendar.getInstance();
        Calendar fechaVencimiento = Calendar.getInstance();
        reqOSB = new EntConsultarHistorialTurismoInReqType();
        resOSB = new EntConsultarHistorialTurismoOutResTYPE();
        ConsultarHistorialTurismoBindingQSService callwebservice = new ConsultarHistorialTurismoBindingQSService();
        ConsultarHistorialTurismoOperacionPortType ejecutaOperacionOSB = callwebservice.getConsultarHistorialTurismoBindingQSPort();
        CCLAMWClientsType header = new CCLAMWClientsType();
        PersonaTYPE persona = new PersonaTYPE();
        ObjectFactory objectFactory = new ObjectFactory();
        BigDecimal _rut = new BigDecimal(rut);
        JAXBElement<BigDecimal> rut_ =
            objectFactory.createPersonaTYPERut(_rut);
        persona.setRut(rut_);
        header.setAplicacion("CCLA");
        header.setComponente("CCLA");
        header.setPlataforma("CCLA");
        reqOSB.setPersona(persona);
        resOSB = ejecutaOperacionOSB.consultarHistorialTurismo(reqOSB, header);
        historial = new ArrayList<CCLAHistorialTurismoConsultar>();

        for (int i = 0;
             i < resOSB.getListaHistorialTurismo().getHistorialTurismo().size();
             i++) { //respOSB.getListaTurismo().getTurismo().size();i++){

            dato = new CCLAHistorialTurismoConsultar();
            dato.setCentroTuristico(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCentroTuristico().getValue());
            checkIn.set(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getYear(),
                        resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getMonth(),
                        resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getDay(),
                        resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getHour(),
                        resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getMinute(),
                        resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckIn().getValue().getSecond());
            dato.setCheckIn(checkIn);
            checkOut.set(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getYear(),
                         resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getMonth(),
                         resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getDay(),
                         resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getHour(),
                         resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getMinute(),
                         resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCheckOut().getValue().getSecond());
            dato.setCheckOut(checkOut);
            dato.setCodigoReserva(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getCodigoReserva().getValue());
            fechaComprobante.set(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getYear(),
                                 resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getMonth(),
                                 resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getDay(),
                                 resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getHour(),
                                 resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getMinute(),
                                 resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaComprobante().getValue().getSecond());
            dato.setFechaComprobante(fechaComprobante);
            fechaPago.set(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getYear(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getMonth(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getDay(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getHour(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getMinute(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaPago().getValue().getSecond());
            dato.setFechaPago(fechaPago);
            
            fechaVencimiento.set(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getYear(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getMonth(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getDay(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getHour(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getMinute(),
                          resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getFechaVencimiento().getValue().getSecond());
            dato.setFechaVencimiento(fechaVencimiento);
            
            dato.setIdTransaccion(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getIdTransaccion().getValue());
            dato.setIdTransaccionCaja(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getIdTransaccionCaja().getValue());
            dato.setEstadoPago(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getEstadoPago().getValue());
            
            
            dato.setMonto(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getMonto().getValue());
            dato.setNumeroBoleta(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getNumeroBoleta().getValue());
            dato.setNumeroComprobante(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getNumeroComprobante().getValue());
            dato.setNumeroCuota(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getNumeroCuota().getValue());
            dato.setRutPersona(resOSB.getListaHistorialTurismo().getHistorialTurismo().get(i).getRutPersona().getValue());

            historial.add(dato);

        }
        return historial;
    }
}
