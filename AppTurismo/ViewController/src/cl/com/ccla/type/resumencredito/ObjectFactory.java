
package cl.com.ccla.type.resumencredito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.resumencredito package. 
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
    private final static QName _EntConsultarResumenCreditoOutEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "EntConsultarResumenCreditoOutEBM");
    private final static QName _CCLAMWClients_QNAME = new QName("http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1", "CCLAMWClients");
    private final static QName _EntConsultarResumenCreditoInEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "EntConsultarResumenCreditoInEBM");
    private final static QName _DetalleError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "detalleError");
    private final static QName _CreditoTYPEMontoCuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "montoCuota");
    private final static QName _CreditoTYPEMonto_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "monto");
    private final static QName _CreditoTYPECodigoAlternativo_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "codigoAlternativo");
    private final static QName _CreditoTYPEFechaOtorgamiento_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "fechaOtorgamiento");
    private final static QName _CreditoTYPECodigoCredito_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "codigoCredito");
    private final static QName _CreditoTYPERut_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "rut");
    private final static QName _CreditoTYPEListaDetalleCredito_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "listaDetalleCredito");
    private final static QName _CreditoTYPETipoProducto_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "tipoProducto");
    private final static QName _CreditoTYPEEstadoCredito_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "estadoCredito");
    private final static QName _CreditoTYPESucursal_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "sucursal");
    private final static QName _ResponseTypeCodigoError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "codigoError");
    private final static QName _DetalleCreditoTYPEInteres_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "interes");
    private final static QName _DetalleCreditoTYPEGastosCobranza_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "gastosCobranza");
    private final static QName _DetalleCreditoTYPEFechaEmision_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "fechaEmision");
    private final static QName _DetalleCreditoTYPEInteresPenal_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "interesPenal");
    private final static QName _DetalleCreditoTYPEFechaVencimiento_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "fechaVencimiento");
    private final static QName _DetalleCreditoTYPEEstadoCuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "estadoCuota");
    private final static QName _DetalleCreditoTYPENumeroCuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "numeroCuota");
    private final static QName _DetalleCreditoTYPENumeroComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", "numeroComprobante");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.resumencredito
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CCLAMWClientsType }
     * 
     */
    public CCLAMWClientsType createCCLAMWClientsType() {
        return new CCLAMWClientsType();
    }

    /**
     * Create an instance of {@link EntConsultarResumenCreditoInReqType }
     * 
     */
    public EntConsultarResumenCreditoInReqType createEntConsultarResumenCreditoInReqType() {
        return new EntConsultarResumenCreditoInReqType();
    }

    /**
     * Create an instance of {@link EntConsultarResumenCreditoOutResTYPE }
     * 
     */
    public EntConsultarResumenCreditoOutResTYPE createEntConsultarResumenCreditoOutResTYPE() {
        return new EntConsultarResumenCreditoOutResTYPE();
    }

    /**
     * Create an instance of {@link PersonaTYPE }
     * 
     */
    public PersonaTYPE createPersonaTYPE() {
        return new PersonaTYPE();
    }

    /**
     * Create an instance of {@link CreditoTYPE }
     * 
     */
    public CreditoTYPE createCreditoTYPE() {
        return new CreditoTYPE();
    }

    /**
     * Create an instance of {@link DetalleCreditoTYPE }
     * 
     */
    public DetalleCreditoTYPE createDetalleCreditoTYPE() {
        return new DetalleCreditoTYPE();
    }

    /**
     * Create an instance of {@link ListaDetalleCreditoTYPE }
     * 
     */
    public ListaDetalleCreditoTYPE createListaDetalleCreditoTYPE() {
        return new ListaDetalleCreditoTYPE();
    }

    /**
     * Create an instance of {@link ListaCreditosTYPE }
     * 
     */
    public ListaCreditosTYPE createListaCreditosTYPE() {
        return new ListaCreditosTYPE();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/technical/core/ebo/TecResponseEBO", name = "responseGeneral")
    public JAXBElement<ResponseType> createResponseGeneral(ResponseType value) {
        return new JAXBElement<ResponseType>(_ResponseGeneral_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarResumenCreditoOutResTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "EntConsultarResumenCreditoOutEBM")
    public JAXBElement<EntConsultarResumenCreditoOutResTYPE> createEntConsultarResumenCreditoOutEBM(EntConsultarResumenCreditoOutResTYPE value) {
        return new JAXBElement<EntConsultarResumenCreditoOutResTYPE>(_EntConsultarResumenCreditoOutEBM_QNAME, EntConsultarResumenCreditoOutResTYPE.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarResumenCreditoInReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "EntConsultarResumenCreditoInEBM")
    public JAXBElement<EntConsultarResumenCreditoInReqType> createEntConsultarResumenCreditoInEBM(EntConsultarResumenCreditoInReqType value) {
        return new JAXBElement<EntConsultarResumenCreditoInReqType>(_EntConsultarResumenCreditoInEBM_QNAME, EntConsultarResumenCreditoInReqType.class, null, value);
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
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "montoCuota", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPEMontoCuota(String value) {
        return new JAXBElement<String>(_CreditoTYPEMontoCuota_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "monto", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPEMonto(String value) {
        return new JAXBElement<String>(_CreditoTYPEMonto_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "codigoAlternativo", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPECodigoAlternativo(String value) {
        return new JAXBElement<String>(_CreditoTYPECodigoAlternativo_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "fechaOtorgamiento", scope = CreditoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createCreditoTYPEFechaOtorgamiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreditoTYPEFechaOtorgamiento_QNAME, XMLGregorianCalendar.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "codigoCredito", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPECodigoCredito(String value) {
        return new JAXBElement<String>(_CreditoTYPECodigoCredito_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "rut", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPERut(String value) {
        return new JAXBElement<String>(_CreditoTYPERut_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDetalleCreditoTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "listaDetalleCredito", scope = CreditoTYPE.class)
    public JAXBElement<ListaDetalleCreditoTYPE> createCreditoTYPEListaDetalleCredito(ListaDetalleCreditoTYPE value) {
        return new JAXBElement<ListaDetalleCreditoTYPE>(_CreditoTYPEListaDetalleCredito_QNAME, ListaDetalleCreditoTYPE.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "tipoProducto", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPETipoProducto(String value) {
        return new JAXBElement<String>(_CreditoTYPETipoProducto_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "estadoCredito", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPEEstadoCredito(String value) {
        return new JAXBElement<String>(_CreditoTYPEEstadoCredito_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "sucursal", scope = CreditoTYPE.class)
    public JAXBElement<String> createCreditoTYPESucursal(String value) {
        return new JAXBElement<String>(_CreditoTYPESucursal_QNAME, String.class, CreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "rut", scope = PersonaTYPE.class)
    public JAXBElement<String> createPersonaTYPERut(String value) {
        return new JAXBElement<String>(_CreditoTYPERut_QNAME, String.class, PersonaTYPE.class, value);
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
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "interes", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPEInteres(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPEInteres_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "montoCuota", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPEMontoCuota(String value) {
        return new JAXBElement<String>(_CreditoTYPEMontoCuota_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "gastosCobranza", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPEGastosCobranza(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPEGastosCobranza_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "fechaEmision", scope = DetalleCreditoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createDetalleCreditoTYPEFechaEmision(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetalleCreditoTYPEFechaEmision_QNAME, XMLGregorianCalendar.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "codigoCredito", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPECodigoCredito(String value) {
        return new JAXBElement<String>(_CreditoTYPECodigoCredito_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "rut", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPERut(String value) {
        return new JAXBElement<String>(_CreditoTYPERut_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "interesPenal", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPEInteresPenal(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPEInteresPenal_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "fechaVencimiento", scope = DetalleCreditoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createDetalleCreditoTYPEFechaVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetalleCreditoTYPEFechaVencimiento_QNAME, XMLGregorianCalendar.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "estadoCuota", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPEEstadoCuota(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPEEstadoCuota_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "numeroCuota", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPENumeroCuota(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPENumeroCuota_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", name = "numeroComprobante", scope = DetalleCreditoTYPE.class)
    public JAXBElement<String> createDetalleCreditoTYPENumeroComprobante(String value) {
        return new JAXBElement<String>(_DetalleCreditoTYPENumeroComprobante_QNAME, String.class, DetalleCreditoTYPE.class, value);
    }

}
