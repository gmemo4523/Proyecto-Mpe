
package cl.com.ccla.mpe.type.consultarhistorialturismo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.mpe.type.consultarhistorialturismo package. 
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
    private final static QName _EntConsultarHistorialTurismoOutEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "EntConsultarHistorialTurismoOutEBM");
    private final static QName _EntConsultarHistorialTurismoInEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "EntConsultarHistorialTurismoInEBM");
    private final static QName _DetalleError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "detalleError");
    private final static QName _ResponseTypeCodigoError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "codigoError");
    private final static QName _HistorialTurismoTYPEFechaPago_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "fechaPago");
    private final static QName _HistorialTurismoTYPEMonto_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "monto");
    private final static QName _HistorialTurismoTYPENumeroComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "numeroComprobante");
    private final static QName _HistorialTurismoTYPECheckOut_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "checkOut");
    private final static QName _HistorialTurismoTYPECentroTuristico_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "centroTuristico");
    private final static QName _HistorialTurismoTYPERutPersona_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "rutPersona");
    private final static QName _HistorialTurismoTYPEEstadoPago_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "estadoPago");
    private final static QName _HistorialTurismoTYPECheckIn_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "checkIn");
    private final static QName _HistorialTurismoTYPENumeroBoleta_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "numeroBoleta");
    private final static QName _HistorialTurismoTYPEIdTransaccionCaja_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "idTransaccionCaja");
    private final static QName _HistorialTurismoTYPENumeroCuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "numeroCuota");
    private final static QName _HistorialTurismoTYPEFechaVencimiento_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "fechaVencimiento");
    private final static QName _HistorialTurismoTYPEIdTransaccion_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "idTransaccion");
    private final static QName _HistorialTurismoTYPEFechaComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "fechaComprobante");
    private final static QName _HistorialTurismoTYPECodigoReserva_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "codigoReserva");
    private final static QName _PersonaTYPEComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "comprobante");
    private final static QName _PersonaTYPERut_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", "rut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.mpe.type.consultarhistorialturismo
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
     * Create an instance of {@link EntConsultarHistorialTurismoInReqType }
     * 
     */
    public EntConsultarHistorialTurismoInReqType createEntConsultarHistorialTurismoInReqType() {
        return new EntConsultarHistorialTurismoInReqType();
    }

    /**
     * Create an instance of {@link EntConsultarHistorialTurismoOutResTYPE }
     * 
     */
    public EntConsultarHistorialTurismoOutResTYPE createEntConsultarHistorialTurismoOutResTYPE() {
        return new EntConsultarHistorialTurismoOutResTYPE();
    }

    /**
     * Create an instance of {@link ListaHistorialTurismoTYPE }
     * 
     */
    public ListaHistorialTurismoTYPE createListaHistorialTurismoTYPE() {
        return new ListaHistorialTurismoTYPE();
    }

    /**
     * Create an instance of {@link PersonaTYPE }
     * 
     */
    public PersonaTYPE createPersonaTYPE() {
        return new PersonaTYPE();
    }

    /**
     * Create an instance of {@link HistorialTurismoTYPE }
     * 
     */
    public HistorialTurismoTYPE createHistorialTurismoTYPE() {
        return new HistorialTurismoTYPE();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CCLAMWClientsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1", name = "CCLAMWClients")
    public JAXBElement<CCLAMWClientsType> createCCLAMWClients(CCLAMWClientsType value) {
        return new JAXBElement<CCLAMWClientsType>(_CCLAMWClients_QNAME, CCLAMWClientsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarHistorialTurismoOutResTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "EntConsultarHistorialTurismoOutEBM")
    public JAXBElement<EntConsultarHistorialTurismoOutResTYPE> createEntConsultarHistorialTurismoOutEBM(EntConsultarHistorialTurismoOutResTYPE value) {
        return new JAXBElement<EntConsultarHistorialTurismoOutResTYPE>(_EntConsultarHistorialTurismoOutEBM_QNAME, EntConsultarHistorialTurismoOutResTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarHistorialTurismoInReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "EntConsultarHistorialTurismoInEBM")
    public JAXBElement<EntConsultarHistorialTurismoInReqType> createEntConsultarHistorialTurismoInEBM(EntConsultarHistorialTurismoInReqType value) {
        return new JAXBElement<EntConsultarHistorialTurismoInReqType>(_EntConsultarHistorialTurismoInEBM_QNAME, EntConsultarHistorialTurismoInReqType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "fechaPago", scope = HistorialTurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createHistorialTurismoTYPEFechaPago(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HistorialTurismoTYPEFechaPago_QNAME, XMLGregorianCalendar.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "monto", scope = HistorialTurismoTYPE.class)
    public JAXBElement<BigDecimal> createHistorialTurismoTYPEMonto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HistorialTurismoTYPEMonto_QNAME, BigDecimal.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "numeroComprobante", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPENumeroComprobante(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPENumeroComprobante_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "checkOut", scope = HistorialTurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createHistorialTurismoTYPECheckOut(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HistorialTurismoTYPECheckOut_QNAME, XMLGregorianCalendar.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "centroTuristico", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPECentroTuristico(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPECentroTuristico_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "rutPersona", scope = HistorialTurismoTYPE.class)
    public JAXBElement<BigDecimal> createHistorialTurismoTYPERutPersona(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HistorialTurismoTYPERutPersona_QNAME, BigDecimal.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "estadoPago", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPEEstadoPago(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPEEstadoPago_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "checkIn", scope = HistorialTurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createHistorialTurismoTYPECheckIn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HistorialTurismoTYPECheckIn_QNAME, XMLGregorianCalendar.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "numeroBoleta", scope = HistorialTurismoTYPE.class)
    public JAXBElement<BigDecimal> createHistorialTurismoTYPENumeroBoleta(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HistorialTurismoTYPENumeroBoleta_QNAME, BigDecimal.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "idTransaccionCaja", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPEIdTransaccionCaja(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPEIdTransaccionCaja_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "numeroCuota", scope = HistorialTurismoTYPE.class)
    public JAXBElement<BigDecimal> createHistorialTurismoTYPENumeroCuota(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HistorialTurismoTYPENumeroCuota_QNAME, BigDecimal.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "fechaVencimiento", scope = HistorialTurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createHistorialTurismoTYPEFechaVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HistorialTurismoTYPEFechaVencimiento_QNAME, XMLGregorianCalendar.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "idTransaccion", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPEIdTransaccion(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPEIdTransaccion_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "fechaComprobante", scope = HistorialTurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createHistorialTurismoTYPEFechaComprobante(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HistorialTurismoTYPEFechaComprobante_QNAME, XMLGregorianCalendar.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "codigoReserva", scope = HistorialTurismoTYPE.class)
    public JAXBElement<String> createHistorialTurismoTYPECodigoReserva(String value) {
        return new JAXBElement<String>(_HistorialTurismoTYPECodigoReserva_QNAME, String.class, HistorialTurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "comprobante", scope = PersonaTYPE.class)
    public JAXBElement<String> createPersonaTYPEComprobante(String value) {
        return new JAXBElement<String>(_PersonaTYPEComprobante_QNAME, String.class, PersonaTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", name = "rut", scope = PersonaTYPE.class)
    public JAXBElement<BigDecimal> createPersonaTYPERut(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonaTYPERut_QNAME, BigDecimal.class, PersonaTYPE.class, value);
    }

}
