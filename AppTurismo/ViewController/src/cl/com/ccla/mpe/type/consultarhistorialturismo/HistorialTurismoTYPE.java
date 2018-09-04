
package cl.com.ccla.mpe.type.consultarhistorialturismo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HistorialTurismoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistorialTurismoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutPersona" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numeroComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaComprobante" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codigoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="centroTuristico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTransaccionCaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBoleta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistorialTurismoTYPE", propOrder = {
    "rutPersona",
    "numeroComprobante",
    "fechaComprobante",
    "codigoReserva",
    "checkOut",
    "checkIn",
    "numeroCuota",
    "centroTuristico",
    "monto",
    "fechaPago",
    "fechaVencimiento",
    "idTransaccion",
    "idTransaccionCaja",
    "estadoPago",
    "numeroBoleta"
})
public class HistorialTurismoTYPE {

    @XmlElementRef(name = "rutPersona", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> rutPersona;
    @XmlElementRef(name = "numeroComprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> numeroComprobante;
    @XmlElementRef(name = "fechaComprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaComprobante;
    @XmlElementRef(name = "codigoReserva", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> codigoReserva;
    @XmlElementRef(name = "checkOut", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> checkOut;
    @XmlElementRef(name = "checkIn", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> checkIn;
    @XmlElementRef(name = "numeroCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numeroCuota;
    @XmlElementRef(name = "centroTuristico", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> centroTuristico;
    @XmlElementRef(name = "monto", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> monto;
    @XmlElementRef(name = "fechaPago", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaPago;
    @XmlElementRef(name = "fechaVencimiento", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaVencimiento;
    @XmlElementRef(name = "idTransaccion", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> idTransaccion;
    @XmlElementRef(name = "idTransaccionCaja", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> idTransaccionCaja;
    @XmlElementRef(name = "estadoPago", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<String> estadoPago;
    @XmlElementRef(name = "numeroBoleta", namespace = "http://ccla.cl/enterprise/catalogo/ebm/historialTurismo", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numeroBoleta;

    /**
     * Gets the value of the rutPersona property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRutPersona() {
        return rutPersona;
    }

    /**
     * Sets the value of the rutPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRutPersona(JAXBElement<BigDecimal> value) {
        this.rutPersona = value;
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
     * Gets the value of the fechaComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaComprobante() {
        return fechaComprobante;
    }

    /**
     * Sets the value of the fechaComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaComprobante(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaComprobante = value;
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
     * Gets the value of the numeroCuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * Sets the value of the numeroCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumeroCuota(JAXBElement<BigDecimal> value) {
        this.numeroCuota = value;
    }

    /**
     * Gets the value of the centroTuristico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCentroTuristico() {
        return centroTuristico;
    }

    /**
     * Sets the value of the centroTuristico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCentroTuristico(JAXBElement<String> value) {
        this.centroTuristico = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMonto(JAXBElement<BigDecimal> value) {
        this.monto = value;
    }

    /**
     * Gets the value of the fechaPago property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaPago(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaVencimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the idTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTransaccion(JAXBElement<String> value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the idTransaccionCaja property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTransaccionCaja() {
        return idTransaccionCaja;
    }

    /**
     * Sets the value of the idTransaccionCaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTransaccionCaja(JAXBElement<String> value) {
        this.idTransaccionCaja = value;
    }

    /**
     * Gets the value of the estadoPago property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoPago() {
        return estadoPago;
    }

    /**
     * Sets the value of the estadoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoPago(JAXBElement<String> value) {
        this.estadoPago = value;
    }

    /**
     * Gets the value of the numeroBoleta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumeroBoleta() {
        return numeroBoleta;
    }

    /**
     * Sets the value of the numeroBoleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumeroBoleta(JAXBElement<BigDecimal> value) {
        this.numeroBoleta = value;
    }

}
