
package cl.com.ccla.type.resumencredito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creditoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAlternativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOtorgamiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaDetalleCredito" type="{http://ccla.cl/enterprise/catalogo/ebm/resumenCredito}listaDetalleCreditoTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditoTYPE", propOrder = {
    "codigoCredito",
    "sucursal",
    "codigoAlternativo",
    "estadoCredito",
    "tipoProducto",
    "fechaOtorgamiento",
    "monto",
    "montoCuota",
    "rut",
    "listaDetalleCredito"
})
public class CreditoTYPE {

    @XmlElementRef(name = "codigoCredito", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> codigoCredito;
    @XmlElementRef(name = "sucursal", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> sucursal;
    @XmlElementRef(name = "codigoAlternativo", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> codigoAlternativo;
    @XmlElementRef(name = "estadoCredito", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> estadoCredito;
    @XmlElementRef(name = "tipoProducto", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> tipoProducto;
    @XmlElementRef(name = "fechaOtorgamiento", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> fechaOtorgamiento;
    @XmlElementRef(name = "monto", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> monto;
    @XmlElementRef(name = "montoCuota", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> montoCuota;
    @XmlElementRef(name = "rut", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<String> rut;
    @XmlElementRef(name = "listaDetalleCredito", namespace = "http://ccla.cl/enterprise/catalogo/ebm/resumenCredito", type = JAXBElement.class)
    protected JAXBElement<ListaDetalleCreditoTYPE> listaDetalleCredito;

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
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSucursal(JAXBElement<String> value) {
        this.sucursal = value;
    }

    /**
     * Gets the value of the codigoAlternativo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoAlternativo() {
        return codigoAlternativo;
    }

    /**
     * Sets the value of the codigoAlternativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoAlternativo(JAXBElement<String> value) {
        this.codigoAlternativo = value;
    }

    /**
     * Gets the value of the estadoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCredito() {
        return estadoCredito;
    }

    /**
     * Sets the value of the estadoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCredito(JAXBElement<String> value) {
        this.estadoCredito = value;
    }

    /**
     * Gets the value of the tipoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Sets the value of the tipoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoProducto(JAXBElement<String> value) {
        this.tipoProducto = value;
    }

    /**
     * Gets the value of the fechaOtorgamiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    /**
     * Sets the value of the fechaOtorgamiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaOtorgamiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaOtorgamiento = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonto(JAXBElement<String> value) {
        this.monto = value;
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

    /**
     * Gets the value of the listaDetalleCredito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaDetalleCreditoTYPE }{@code >}
     *     
     */
    public JAXBElement<ListaDetalleCreditoTYPE> getListaDetalleCredito() {
        return listaDetalleCredito;
    }

    /**
     * Sets the value of the listaDetalleCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaDetalleCreditoTYPE }{@code >}
     *     
     */
    public void setListaDetalleCredito(JAXBElement<ListaDetalleCreditoTYPE> value) {
        this.listaDetalleCredito = value;
    }

}
