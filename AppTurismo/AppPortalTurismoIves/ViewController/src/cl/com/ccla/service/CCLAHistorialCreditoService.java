package cl.com.ccla.service;

import cl.com.ccla.bean.CCLACuotaTurismo;
import cl.com.ccla.bean.CCLAHistorialTurismo;

import cl.com.ccla.mpe.bean.CCLAHistorialTurismoConsultar;
import cl.com.ccla.mpe.bean.MPEConsultarTurismoHistorialBean;


import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;

import java.util.List;

import java.util.Properties;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;
import oracle.adf.view.rich.component.rich.data.RichTreeTable;
import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;

public class CCLAHistorialCreditoService {
    private static final long serialVersionUID = 0L;
   
    private List<CCLAHistorialTurismo> listaHistorialTurismo = null;


    private BigInteger rut = null;
    private String digitoVerificador = "";
    private CCLACuotaTurismo popupDetalle;
    private String codReservaPopup = null;
    private static final ADFLogger logger =
        ADFLogger.createADFLogger(CCLAHistorialCreditoService.class);


    public CCLAHistorialCreditoService() {
        super();
      //  usuario = new CCLAUserBean();
      
        digitoVerificador = "";
   //    ExternalContext exctx =
   //      FacesContext.getCurrentInstance().getExternalContext();
   //    CCLAUserInfoService userInfo =
   //     (CCLAUserInfoService)exctx.getSessionMap().get("UserInfoMB");
   //  if (userInfo != null && userInfo.getUser() != null) {
   //         usuario = userInfo.getUser();
    // }
  //  usuario.setRut("12842218");
   rut =new BigInteger("12842218");
        llenarListaTurismo(rut);
     
  
        
    }
    //se obtienen listas de historial de turismo y credito

 

    //reemplazar cuando entregen EJB

    public void llenarListaTurismo(BigInteger rut) {
        System.out.println("llenarListaTurismo");
        MPEConsultarTurismoHistorialBean mpe = new MPEConsultarTurismoHistorialBean();
        ArrayList<CCLAHistorialTurismoConsultar> lista=mpe.turismo(rut);
            listaHistorialTurismo=new ArrayList<CCLAHistorialTurismo>();
        for( CCLAHistorialTurismoConsultar lista2: lista) {
            
            CCLAHistorialTurismo cclaHistoria=new CCLAHistorialTurismo();
            cclaHistoria.setCentroTuristico(lista2.getCentroTuristico());
            cclaHistoria.setCodReserva(lista2.getCodigoReserva());
           cclaHistoria.setNroBoleta(lista2.getNumeroBoleta().toString());
           cclaHistoria.setCheckIn(lista2.getCheckIn().toString());
            cclaHistoria.setCheckOut(lista2.getCheckOut().toString());
            cclaHistoria.setFechaVencimiento("28/08/2018");
           cclaHistoria.setNroCuota(lista2.getNumeroCuota());
            cclaHistoria.setEstadoPago("Disponible");
            cclaHistoria.setMonto(lista2.getMonto());
            cclaHistoria.setNumeroBoleta(lista2.getNumeroBoleta().toString());
            
           // cclaHistoria.setFechaPago("29-08-2018");
              listaHistorialTurismo.add(cclaHistoria);
   
        
               
         
            
        }
        
         
                
          
    
            
            
        }
       
    public void CargaPopUp(ActionEvent valueChangeEvent) {
        popupDetalle = new CCLACuotaTurismo();
       for (CCLAHistorialTurismo item: listaHistorialTurismo) {
         
            if (item.getCodReserva() == codReservaPopup) {
                
                popupDetalle.setNroReserva(item.getCodReserva());
                popupDetalle.setEstado(item.getEstadoPago());
                popupDetalle.setCheckIn(item.getCheckIn().toString());
                popupDetalle.setCheckOut(item.getCheckOut().toString());
                //popupDetalle.setEstadoCi(item.getEstadoPago());
                
                popupDetalle.setNumeroComprobante(item.getNumeroComprobante());
                
                popupDetalle.setCodigoReserva(item.getCodReserva());
               

               popupDetalle.setNumeroComprobante(item.getNumeroComprobante());
                popupDetalle.setNumeroComprobante(item.getNumeroComprobante());
           //    popupDetalle.setEstadoPa(new BigDecimal(.getEstadoPago().toString());
               popupDetalle.setFechaVencimiento(item.getFechaVencimiento());
                popupDetalle.setCentro(item.getCentroTuristico());
                popupDetalle.setIdCuota(Integer.parseInt(item.getNroCuota().toBigInteger().toString()));
               popupDetalle.setMontoCi(item.getMonto());
         
               popupDetalle.setNumeroComprobante(item.getNumeroComprobante());
     
            }
        }
    }

        

      //  listaHistorialTurismo.add(historial1);
     
      

  

    public void setRut(BigInteger rut) {
        this.rut = rut;
    }

    public BigInteger getRut() {
        return rut;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public static ADFLogger getLogger() {
        return logger;
    }

    public void setListaHistorialTurismo(List<CCLAHistorialTurismo> listaHistorialTurismo) {
        this.listaHistorialTurismo = listaHistorialTurismo;
    }

    public List<CCLAHistorialTurismo> getListaHistorialTurismo() {
        return listaHistorialTurismo;
    }

    public void setCodReservaPopup(String codReservaPopup) {
        this.codReservaPopup = codReservaPopup;
    }

    public String getCodReservaPopup() {
        return codReservaPopup;
    }

    public void setPopupDetalle(CCLACuotaTurismo popupDetalle) {
        this.popupDetalle = popupDetalle;
    }

    public CCLACuotaTurismo getPopupDetalle() {
        return popupDetalle;
    }
}
