
package cl.com.ccla.type.consultadatosturismo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TurismoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TurismoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NroReserva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Centro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MntPendiente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroHabitacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapacidadHabitacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FechaGrab" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumeroComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MontoCi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CuentaPeriodo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrelativoComprobante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Cuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurismoTYPE", propOrder = {
    "nroReserva",
    "codigoReserva",
    "checkIn",
    "checkOut",
    "centro",
    "mntPendiente",
    "estado",
    "tipoHabitacion",
    "nroHabitacion",
    "capacidadHabitacion",
    "fechaGrab",
    "numeroComprobante",
    "estadoCi",
    "montoCi",
    "cuentaPeriodo",
    "region",
    "codigoSucursal",
    "tipoDocumento",
    "correlativoComprobante",
    "cuota",
    "idCuota"
})
public class TurismoTYPE {

    @XmlElementRef(name = "NroReserva", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> nroReserva;
    @XmlElementRef(name = "CodigoReserva", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> codigoReserva;
    @XmlElementRef(name = "CheckIn", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> checkIn;
    @XmlElementRef(name = "CheckOut", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> checkOut;
    @XmlElementRef(name = "Centro", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> centro;
    @XmlElementRef(name = "MntPendiente", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> mntPendiente;
    @XmlElementRef(name = "Estado", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "TipoHabitacion", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> tipoHabitacion;
    @XmlElementRef(name = "NroHabitacion", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> nroHabitacion;
    @XmlElementRef(name = "CapacidadHabitacion", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> capacidadHabitacion;
    @XmlElementRef(name = "FechaGrab", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaGrab;
    @XmlElementRef(name = "NumeroComprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> numeroComprobante;
    @XmlElementRef(name = "EstadoCi", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> estadoCi;
    @XmlElementRef(name = "MontoCi", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> montoCi;
    @XmlElementRef(name = "CuentaPeriodo", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> cuentaPeriodo;
    @XmlElementRef(name = "Region", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "CodigoSucursal", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> codigoSucursal;
    @XmlElementRef(name = "TipoDocumento", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> tipoDocumento;
    @XmlElementRef(name = "CorrelativoComprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> correlativoComprobante;
    @XmlElementRef(name = "Cuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<String> cuota;
    @XmlElementRef(name = "IdCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/datosTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> idCuota;

    /**
     * Gets the value of the nroReserva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNroReserva() {
        return nroReserva;
    }

    /**
     * Sets the value of the nroReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNroReserva(JAXBElement<BigDecimal> value) {
        this.nroReserva = value;
    }

    /**
     * Gets the value of the codigoReserva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Sets the value of the codigoReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoReserva(JAXBElement<String> value) {
        this.codigoReserva = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCheckIn(JAXBElement<XMLGregorianCalendar> value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCheckOut(JAXBElement<XMLGregorianCalendar> value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the centro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCentro() {
        return centro;
    }

    /**
     * Sets the value of the centro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCentro(JAXBElement<String> value) {
        this.centro = value;
    }

    /**
     * Gets the value of the mntPendiente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMntPendiente() {
        return mntPendiente;
    }

    /**
     * Sets the value of the mntPendiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMntPendiente(JAXBElement<BigDecimal> value) {
        this.mntPendiente = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Gets the value of the tipoHabitacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Sets the value of the tipoHabitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoHabitacion(JAXBElement<String> value) {
        this.tipoHabitacion = value;
    }

    /**
     * Gets the value of the nroHabitacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNroHabitacion() {
        return nroHabitacion;
    }

    /**
     * Sets the value of the nroHabitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNroHabitacion(JAXBElement<BigDecimal> value) {
        this.nroHabitacion = value;
    }

    /**
     * Gets the value of the capacidadHabitacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCapacidadHabitacion() {
        return capacidadHabitacion;
    }

    /**
     * Sets the value of the capacidadHabitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCapacidadHabitacion(JAXBElement<BigDecimal> value) {
        this.capacidadHabitacion = value;
    }

    /**
     * Gets the value of the fechaGrab property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaGrab() {
        return fechaGrab;
    }

    /**
     * Sets the value of the fechaGrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaGrab(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaGrab = value;
    }

    /**
     * Gets the value of the numeroComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Sets the value of the numeroComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroComprobante(JAXBElement<String> value) {
        this.numeroComprobante = value;
    }

    /**
     * Gets the value of the estadoCi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEstadoCi() {
        return estadoCi;
    }

    /**
     * Sets the value of the estadoCi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEstadoCi(JAXBElement<BigDecimal> value) {
        this.estadoCi = value;
    }

    /**
     * Gets the value of the montoCi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontoCi() {
        return montoCi;
    }

    /**
     * Sets the value of the montoCi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontoCi(JAXBElement<BigDecimal> value) {
        this.montoCi = value;
    }

    /**
     * Gets the value of the cuentaPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCuentaPeriodo() {
        return cuentaPeriodo;
    }

    /**
     * Sets the value of the cuentaPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCuentaPeriodo(JAXBElement<BigDecimal> value) {
        this.cuentaPeriodo = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the codigoSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Sets the value of the codigoSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSucursal(JAXBElement<String> value) {
        this.codigoSucursal = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the correlativoComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCorrelativoComprobante() {
        return correlativoComprobante;
    }

    /**
     * Sets the value of the correlativoComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCorrelativoComprobante(JAXBElement<BigDecimal> value) {
        this.correlativoComprobante = value;
    }

    /**
     * Gets the value of the cuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuota() {
        return cuota;
    }

    /**
     * Sets the value of the cuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuota(JAXBElement<String> value) {
        this.cuota = value;
    }

    /**
     * Gets the value of the idCuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIdCuota() {
        return idCuota;
    }

    /**
     * Sets the value of the idCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIdCuota(JAXBElement<BigDecimal> value) {
        this.idCuota = value;
    }

}
