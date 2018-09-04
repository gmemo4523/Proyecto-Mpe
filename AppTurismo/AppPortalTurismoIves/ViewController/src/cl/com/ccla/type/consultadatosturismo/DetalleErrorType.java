
package cl.com.ccla.type.consultadatosturismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aplicacionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreServicioOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoErrorOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajerErrorOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trazaErrorOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleErrorType", namespace = "http://ccla.cl/technical/core/ebo/TecResponseEBO", propOrder = {
    "tipoError",
    "aplicacionOrigen",
    "nombreServicioOrigen",
    "codigoErrorOrigen",
    "mensajerErrorOrigen",
    "trazaErrorOrigen"
})
public class DetalleErrorType {

    protected String tipoError;
    protected String aplicacionOrigen;
    protected String nombreServicioOrigen;
    protected String codigoErrorOrigen;
    protected String mensajerErrorOrigen;
    protected String trazaErrorOrigen;

    /**
     * Gets the value of the tipoError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoError() {
        return tipoError;
    }

    /**
     * Sets the value of the tipoError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoError(String value) {
        this.tipoError = value;
    }

    /**
     * Gets the value of the aplicacionOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicacionOrigen() {
        return aplicacionOrigen;
    }

    /**
     * Sets the value of the aplicacionOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicacionOrigen(String value) {
        this.aplicacionOrigen = value;
    }

    /**
     * Gets the value of the nombreServicioOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreServicioOrigen() {
        return nombreServicioOrigen;
    }

    /**
     * Sets the value of the nombreServicioOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreServicioOrigen(String value) {
        this.nombreServicioOrigen = value;
    }

    /**
     * Gets the value of the codigoErrorOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoErrorOrigen() {
        return codigoErrorOrigen;
    }

    /**
     * Sets the value of the codigoErrorOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoErrorOrigen(String value) {
        this.codigoErrorOrigen = value;
    }

    /**
     * Gets the value of the mensajerErrorOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajerErrorOrigen() {
        return mensajerErrorOrigen;
    }

    /**
     * Sets the value of the mensajerErrorOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajerErrorOrigen(String value) {
        this.mensajerErrorOrigen = value;
    }

    /**
     * Gets the value of the trazaErrorOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrazaErrorOrigen() {
        return trazaErrorOrigen;
    }

    /**
     * Sets the value of the trazaErrorOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrazaErrorOrigen(String value) {
        this.trazaErrorOrigen = value;
    }

}
