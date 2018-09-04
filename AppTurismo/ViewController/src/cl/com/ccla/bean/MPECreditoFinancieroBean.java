package cl.com.ccla.bean;

import cl.com.ccla.type.resumencredito.CCLAMWClientsType;
import cl.com.ccla.type.resumencredito.EntConsultarResumenCreditoInReqType;
import cl.com.ccla.type.resumencredito.EntConsultarResumenCreditoOutResTYPE;
import cl.com.ccla.type.resumencredito.ObjectFactory;
import cl.com.ccla.type.resumencredito.PersonaTYPE;
import cl.com.ccla.webservice.resumencredito.ConsultarResumenCreditoBindingQSService;
import cl.com.ccla.webservice.resumencredito.ConsultarResumenCreditoOperacionPortType;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;


public class MPECreditoFinancieroBean {
    public MPECreditoFinancieroBean() {
      
    }
    private static ConsultarResumenCreditoBindingQSService consultarResumenCreditoBindingQSService;
    
public void credito(String rut) {
    
   consultarResumenCreditoBindingQSService = new ConsultarResumenCreditoBindingQSService();
   ConsultarResumenCreditoOperacionPortType consultarResumenCreditoOperacionPortType = consultarResumenCreditoBindingQSService.getConsultarResumenCreditoBindingQSPort();
   EntConsultarResumenCreditoInReqType reqOSB=new EntConsultarResumenCreditoInReqType();
   EntConsultarResumenCreditoOutResTYPE respOSB=new EntConsultarResumenCreditoOutResTYPE();
      
   CCLAMWClientsType header= new CCLAMWClientsType();
   PersonaTYPE persona= new PersonaTYPE ();
   ObjectFactory objectFactory= new ObjectFactory();
   //BigDecimal _rut= new BigDecimal(rut);
   JAXBElement <String> rut_ = objectFactory.createPersonaTYPERut(rut);
   
   persona.setRut(rut_);
   header.setAplicacion("CCLA");
   header.setComponente("CCLA");
   header.setPlataforma("CCLA");
   reqOSB.setPersona(persona);
   respOSB=consultarResumenCreditoOperacionPortType.consultarResumenCredito(reqOSB, header);
   
    
      
   
  
        
    }
}
