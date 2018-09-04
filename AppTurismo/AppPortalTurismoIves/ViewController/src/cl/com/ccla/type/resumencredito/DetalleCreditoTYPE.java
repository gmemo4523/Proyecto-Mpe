
package cl.com.ccla.type.resumencredito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detalleCreditoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleCreditoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="montoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gastosCobranza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interesPenal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleCreditoTYPE", propOrder = {
    "numeroComprobante",
    "fechaEmision",
    "numeroCuota",
    "codigoCredito",
    "estadoCuota",
    "fechaVencimiento",
    "montoCuota",
    "interes",
    "gastosCobranza",
    "interesPenal",
    "rut"
})
public class DetalleCreditoTYPE {

    @XmlElementRef(name = "numeroComprobante", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> numeroComprobante;
    @XmlElementRef(name = "fechaEmision", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaEmision;
    @XmlElementRef(name = "numeroCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> numeroCuota;
    @XmlElementRef(name = "codigoCredito", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> codigoCredito;
    @XmlElementRef(name = "estadoCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> estadoCuota;
    @XmlElementRef(name = "fechaVencimiento", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaVencimiento;
    @XmlElementRef(name = "montoCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> montoCuota;
    @XmlElementRef(name = "interes", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> interes;
    @XmlElementRef(name = "gastosCobranza", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> gastosCobranza;
    @XmlElementRef(name = "interesPenal", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> interesPenal;
    @XmlElementRef(name = "rut", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> rut;

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
     * Gets the value of the fechaEmision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Sets the value of the fechaEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaEmision(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaEmision = value;
    }

    /**
     * Gets the value of the numeroCuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * Sets the value of the numeroCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuota(JAXBElement<String> value) {
        this.numeroCuota = value;
    }

    /**
     * Gets the value of the codigoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCredito() {
        return codigoCredito;
    }

    /**
     * Sets the value of the codigoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCredito(JAXBElement<String> value) {
        this.codigoCredito = value;
    }

    /**
     * Gets the value of the estadoCuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCuota() {
        return estadoCuota;
    }

    /**
     * Sets the value of the estadoCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCuota(JAXBElement<String> value) {
        this.estadoCuota = value;
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
     * Gets the value of the montoCuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMontoCuota() {
        return montoCuota;
    }

    /**
     * Sets the value of the montoCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMontoCuota(JAXBElement<String> value) {
        this.montoCuota = value;
    }

    /**
     * Gets the value of the interes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInteres() {
        return interes;
    }

    /**
     * Sets the value of the interes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInteres(JAXBElement<String> value) {
        this.interes = value;
    }

    /**
     * Gets the value of the gastosCobranza property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGastosCobranza() {
        return gastosCobranza;
    }

    /**
     * Sets the value of the gastosCobranza property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGastosCobranza(JAXBElement<String> value) {
        this.gastosCobranza = value;
    }

    /**
     * Gets the value of the interesPenal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInteresPenal() {
        return interesPenal;
    }

    /**
     * Sets the value of the interesPenal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInteresPenal(JAXBElement<String> value) {
        this.interesPenal = value;
    }

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRut(JAXBElement<String> value) {
        this.rut = value;
    }

}
