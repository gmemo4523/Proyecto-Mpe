package cl.com.ccla.mpe.webservice.turismo;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

@WebServiceClient(wsdlLocation="http://qa-osbweb:8005/Financiero/PagoElectronico/ConsultaDatosTurismo?wsdl",
  targetNamespace="http://ccla.cl/enterprise/catalogo/ebs/region", name="ConsultarDatosTurismoBindingQSService")
public class ConsultarDatosTurismoBindingQSService
  extends Service
{
  private static URL wsdlLocationURL;
  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoBindingQSService");
      URL baseUrl =
        ConsultarDatosTurismoBindingQSService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            ConsultarDatosTurismoBindingQSService.class.getResource("http://qa-osbweb:8005/Financiero/PagoElectronico/ConsultaDatosTurismo?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://qa-osbweb:8005/Financiero/PagoElectronico/ConsultaDatosTurismo?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://qa-osbweb:8005/Financiero/PagoElectronico/ConsultaDatosTurismo?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://qa-osbweb:8005/Financiero/PagoElectronico/ConsultaDatosTurismo?wsdl",
          e);
    }
  }

  public ConsultarDatosTurismoBindingQSService()
  {
    super(wsdlLocationURL,
          new QName("http://ccla.cl/enterprise/catalogo/ebs/region",
                    "ConsultarDatosTurismoBindingQSService"));
  }

  public ConsultarDatosTurismoBindingQSService(URL wsdlLocation,
                                               QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="ConsultarDatosTurismoBindingQSPort")
  public cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType getConsultarDatosTurismoBindingQSPort()
  {
    return (cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType) super.getPort(new QName("http://ccla.cl/enterprise/catalogo/ebs/region",
                                                                                                               "ConsultarDatosTurismoBindingQSPort"),
                                                                                                     cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType.class);
  }

  @WebEndpoint(name="ConsultarDatosTurismoBindingQSPort")
  public cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType getConsultarDatosTurismoBindingQSPort(WebServiceFeature... features)
  {
    return (cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType) super.getPort(new QName("http://ccla.cl/enterprise/catalogo/ebs/region",
                                                                                                               "ConsultarDatosTurismoBindingQSPort"),
                                                                                                     cl.com.ccla.mpe.webservice.turismo.ConsultarDatosTurismoOperacionPortType.class,
                                                                                                     features);
  }
}