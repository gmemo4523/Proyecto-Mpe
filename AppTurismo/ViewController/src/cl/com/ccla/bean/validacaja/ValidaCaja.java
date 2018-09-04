package cl.com.ccla.bean.validacaja;


import cl.com.ccla.mpe.type.validacaja.CCLAMWClientsType;
import cl.com.ccla.mpe.type.validacaja.CajaTYPE;
import cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaInReqType;
import cl.com.ccla.mpe.type.validacaja.EntValidarCajaAbiertaOutResTYPE;
import cl.com.ccla.mpe.type.validacaja.ObjectFactory;
import cl.com.ccla.mpe.webservices.validacaja.ValidarCajaAbiertaBindingQSService;

import cl.com.ccla.mpe.webservices.validacaja.ValidarCajaAbiertaOperacionPortType;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceRef;

public class ValidaCaja {
    public ValidaCaja() {
        super();
    }
    
    @WebServiceRef
    private static ValidarCajaAbiertaBindingQSService validarCajaAbiertaBindingQSService;
    
    public CajaBean validaCaja(String usuario) {
        
        CajaBean cajaBean = new CajaBean();
        validarCajaAbiertaBindingQSService = new ValidarCajaAbiertaBindingQSService();
        ValidarCajaAbiertaOperacionPortType validarCajaAbiertaOperacionPortType = validarCajaAbiertaBindingQSService.getValidarCajaAbiertaBindingQSPort();
        // Add your code to call the desired methods.
        
        EntValidarCajaAbiertaInReqType reqOSB = new EntValidarCajaAbiertaInReqType();
        EntValidarCajaAbiertaOutResTYPE resOSB = new EntValidarCajaAbiertaOutResTYPE();
        
        CCLAMWClientsType header = new CCLAMWClientsType();

        header.setAplicacion("CCLA");
        header.setComponente("CCLA");
        header.setPlataforma("CCLA");
        
        CajaTYPE cajaType=new CajaTYPE();
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<String> usuarioPago =
        objectFactory.createCajaTYPEPagoUsuario("WEBPAY1");
        cajaType.setPagoUsuario(usuarioPago);
        reqOSB.setCaja(cajaType);
        resOSB = validarCajaAbiertaOperacionPortType.validarCajaAbierta(reqOSB, header);
       // resOSB.setStatusCaja(1);
        cajaBean.setStatus(resOSB.getStatusCaja()==0?"OK":"NOOK");
        cajaBean.setHoraInicio(resOSB.getHorarioCajaInicio());
        cajaBean.setHoraFin(resOSB.getHorarioCajaFin());
     
        
        
        return cajaBean;
    }
}

