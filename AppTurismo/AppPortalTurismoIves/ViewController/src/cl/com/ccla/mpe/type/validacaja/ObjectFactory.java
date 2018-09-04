
package cl.com.ccla.mpe.type.validacaja;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.mpe.type.validacaja package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseGeneral_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "responseGeneral");
    private final static QName _CCLAMWClients_QNAME = new QName("http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1", "CCLAMWClients");
    private final static QName _EntValidarCajaAbiertaInEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", "EntValidarCajaAbiertaInEBM");
    private final static QName _EntValidarCajaAbiertaOutEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", "EntValidarCajaAbiertaOutEBM");
    private final static QName _DetalleError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "detalleError");
    private final static QName _ResponseTypeCodigoError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "codigoError");
    private final static QName _CajaTYPEPagoUsuario_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", "pagoUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.mpe.type.validacaja
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntValidarCajaAbiertaInReqType }
     * 
     */
    public EntValidarCajaAbiertaInReqType createEntValidarCajaAbiertaInReqType() {
        return new EntValidarCajaAbiertaInReqType();
    }

    /**
     * Create an instance of {@link EntValidarCajaAbiertaOutResTYPE }
     * 
     */
    public EntValidarCajaAbiertaOutResTYPE createEntValidarCajaAbiertaOutResTYPE() {
        return new EntValidarCajaAbiertaOutResTYPE();
    }

    /**
     * Create an instance of {@link CajaTYPE }
     * 
     */
    public CajaTYPE createCajaTYPE() {
        return new CajaTYPE();
    }

    /**
     * Create an instance of {@link DetalleErrorType }
     * 
     */
    public DetalleErrorType createDetalleErrorType() {
        return new DetalleErrorType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link RespuestaServicio }
     * 
     */
    public RespuestaServicio createRespuestaServicio() {
        return new RespuestaServicio();
    }

    /**
     * Create an instance of {@link CCLAMWClientsType }
     * 
     */
    public CCLAMWClientsType createCCLAMWClientsType() {
        return new CCLAMWClientsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/technical/core/ebo/TecResponseEBO", name = "responseGeneral")
    public JAXBElement<ResponseType> createResponseGeneral(ResponseType value) {
        return new JAXBElement<ResponseType>(_ResponseGeneral_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCLAMWClientsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1", name = "CCLAMWClients")
    public JAXBElement<CCLAMWClientsType> createCCLAMWClients(CCLAMWClientsType value) {
        return new JAXBElement<CCLAMWClientsType>(_CCLAMWClients_QNAME, CCLAMWClientsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntValidarCajaAbiertaInReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", name = "EntValidarCajaAbiertaInEBM")
    public JAXBElement<EntValidarCajaAbiertaInReqType> createEntValidarCajaAbiertaInEBM(EntValidarCajaAbiertaInReqType value) {
        return new JAXBElement<EntValidarCajaAbiertaInReqType>(_EntValidarCajaAbiertaInEBM_QNAME, EntValidarCajaAbiertaInReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntValidarCajaAbiertaOutResTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", name = "EntValidarCajaAbiertaOutEBM")
    public JAXBElement<EntValidarCajaAbiertaOutResTYPE> createEntValidarCajaAbiertaOutEBM(EntValidarCajaAbiertaOutResTYPE value) {
        return new JAXBElement<EntValidarCajaAbiertaOutResTYPE>(_EntValidarCajaAbiertaOutEBM_QNAME, EntValidarCajaAbiertaOutResTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/technical/core/ebo/TecResponseEBO", name = "detalleError")
    public JAXBElement<DetalleErrorType> createDetalleError(DetalleErrorType value) {
        return new JAXBElement<DetalleErrorType>(_DetalleError_QNAME, DetalleErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/technical/core/ebo/TecResponseEBO", name = "codigoError", scope = ResponseType.class)
    public JAXBElement<String> createResponseTypeCodigoError(String value) {
        return new JAXBElement<String>(_ResponseTypeCodigoError_QNAME, String.class, ResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", name = "pagoUsuario", scope = CajaTYPE.class)
    public JAXBElement<String> createCajaTYPEPagoUsuario(String value) {
        return new JAXBElement<String>(_CajaTYPEPagoUsuario_QNAME, String.class, CajaTYPE.class, value);
    }

}
