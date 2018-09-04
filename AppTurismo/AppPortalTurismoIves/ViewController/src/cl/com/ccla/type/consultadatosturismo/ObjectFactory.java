
package cl.com.ccla.type.consultadatosturismo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.consultadatosturismo package. 
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
    private final static QName _EntConsultarDatosTurismoOutEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "EntConsultarDatosTurismoOutEBM");
    private final static QName _CCLAMWClients_QNAME = new QName("http://esb.cla.cl/EnterpriseObjects/CCLAMWClients/V1", "CCLAMWClients");
    private final static QName _EntConsultarDatosTurismoInEBM_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "EntConsultarDatosTurismoInEBM");
    private final static QName _DetalleError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "detalleError");
    private final static QName _TurismoTYPECheckOut_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CheckOut");
    private final static QName _TurismoTYPECodigoSucursal_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CodigoSucursal");
    private final static QName _TurismoTYPECuentaPeriodo_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CuentaPeriodo");
    private final static QName _TurismoTYPECentro_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "Centro");
    private final static QName _TurismoTYPECodigoReserva_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CodigoReserva");
    private final static QName _TurismoTYPECapacidadHabitacion_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CapacidadHabitacion");
    private final static QName _TurismoTYPECorrelativoComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CorrelativoComprobante");
    private final static QName _TurismoTYPENroHabitacion_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "NroHabitacion");
    private final static QName _TurismoTYPECuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "Cuota");
    private final static QName _TurismoTYPEMontoCi_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "MontoCi");
    private final static QName _TurismoTYPEEstadoCi_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "EstadoCi");
    private final static QName _TurismoTYPECheckIn_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "CheckIn");
    private final static QName _TurismoTYPEMntPendiente_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "MntPendiente");
    private final static QName _TurismoTYPENumeroComprobante_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "NumeroComprobante");
    private final static QName _TurismoTYPETipoHabitacion_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "TipoHabitacion");
    private final static QName _TurismoTYPEIdCuota_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "IdCuota");
    private final static QName _TurismoTYPETipoDocumento_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "TipoDocumento");
    private final static QName _TurismoTYPERegion_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "Region");
    private final static QName _TurismoTYPEEstado_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "Estado");
    private final static QName _TurismoTYPENroReserva_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "NroReserva");
    private final static QName _TurismoTYPEFechaGrab_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "FechaGrab");
    private final static QName _ResponseTypeCodigoError_QNAME = new QName("http://ccla.cl/technical/core/ebo/TecResponseEBO", "codigoError");
    private final static QName _PersonaTYPERut_QNAME = new QName("http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", "rut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.consultadatosturismo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntConsultarDatosTurismoInReqType }
     * 
     */
    public EntConsultarDatosTurismoInReqType createEntConsultarDatosTurismoInReqType() {
        return new EntConsultarDatosTurismoInReqType();
    }

    /**
     * Create an instance of {@link EntConsultarDatosTurismoOutResTYPE }
     * 
     */
    public EntConsultarDatosTurismoOutResTYPE createEntConsultarDatosTurismoOutResTYPE() {
        return new EntConsultarDatosTurismoOutResTYPE();
    }

    /**
     * Create an instance of {@link ListaTurismoTYPE }
     * 
     */
    public ListaTurismoTYPE createListaTurismoTYPE() {
        return new ListaTurismoTYPE();
    }

    /**
     * Create an instance of {@link PersonaTYPE }
     * 
     */
    public PersonaTYPE createPersonaTYPE() {
        return new PersonaTYPE();
    }

    /**
     * Create an instance of {@link TurismoTYPE }
     * 
     */
    public TurismoTYPE createTurismoTYPE() {
        return new TurismoTYPE();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarDatosTurismoOutResTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "EntConsultarDatosTurismoOutEBM")
    public JAXBElement<EntConsultarDatosTurismoOutResTYPE> createEntConsultarDatosTurismoOutEBM(EntConsultarDatosTurismoOutResTYPE value) {
        return new JAXBElement<EntConsultarDatosTurismoOutResTYPE>(_EntConsultarDatosTurismoOutEBM_QNAME, EntConsultarDatosTurismoOutResTYPE.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EntConsultarDatosTurismoInReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "EntConsultarDatosTurismoInEBM")
    public JAXBElement<EntConsultarDatosTurismoInReqType> createEntConsultarDatosTurismoInEBM(EntConsultarDatosTurismoInReqType value) {
        return new JAXBElement<EntConsultarDatosTurismoInReqType>(_EntConsultarDatosTurismoInEBM_QNAME, EntConsultarDatosTurismoInReqType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CheckOut", scope = TurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createTurismoTYPECheckOut(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TurismoTYPECheckOut_QNAME, XMLGregorianCalendar.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CodigoSucursal", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPECodigoSucursal(String value) {
        return new JAXBElement<String>(_TurismoTYPECodigoSucursal_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CuentaPeriodo", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPECuentaPeriodo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPECuentaPeriodo_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "Centro", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPECentro(String value) {
        return new JAXBElement<String>(_TurismoTYPECentro_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CodigoReserva", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPECodigoReserva(String value) {
        return new JAXBElement<String>(_TurismoTYPECodigoReserva_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CapacidadHabitacion", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPECapacidadHabitacion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPECapacidadHabitacion_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CorrelativoComprobante", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPECorrelativoComprobante(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPECorrelativoComprobante_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "NroHabitacion", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPENroHabitacion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPENroHabitacion_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "Cuota", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPECuota(String value) {
        return new JAXBElement<String>(_TurismoTYPECuota_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "MontoCi", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPEMontoCi(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPEMontoCi_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "EstadoCi", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPEEstadoCi(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPEEstadoCi_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "CheckIn", scope = TurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createTurismoTYPECheckIn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TurismoTYPECheckIn_QNAME, XMLGregorianCalendar.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "MntPendiente", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPEMntPendiente(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPEMntPendiente_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "NumeroComprobante", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPENumeroComprobante(String value) {
        return new JAXBElement<String>(_TurismoTYPENumeroComprobante_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "TipoHabitacion", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPETipoHabitacion(String value) {
        return new JAXBElement<String>(_TurismoTYPETipoHabitacion_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "IdCuota", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPEIdCuota(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPEIdCuota_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "TipoDocumento", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPETipoDocumento(String value) {
        return new JAXBElement<String>(_TurismoTYPETipoDocumento_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "Region", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPERegion(String value) {
        return new JAXBElement<String>(_TurismoTYPERegion_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "Estado", scope = TurismoTYPE.class)
    public JAXBElement<String> createTurismoTYPEEstado(String value) {
        return new JAXBElement<String>(_TurismoTYPEEstado_QNAME, String.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "NroReserva", scope = TurismoTYPE.class)
    public JAXBElement<BigDecimal> createTurismoTYPENroReserva(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TurismoTYPENroReserva_QNAME, BigDecimal.class, TurismoTYPE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "FechaGrab", scope = TurismoTYPE.class)
    public JAXBElement<XMLGregorianCalendar> createTurismoTYPEFechaGrab(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TurismoTYPEFechaGrab_QNAME, XMLGregorianCalendar.class, TurismoTYPE.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", name = "rut", scope = PersonaTYPE.class)
    public JAXBElement<BigDecimal> createPersonaTYPERut(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PersonaTYPERut_QNAME, BigDecimal.class, PersonaTYPE.class, value);
    }

}
