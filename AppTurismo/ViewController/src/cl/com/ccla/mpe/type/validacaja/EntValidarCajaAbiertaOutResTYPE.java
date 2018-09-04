
package cl.com.ccla.mpe.type.validacaja;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntValidarCajaAbiertaOutResTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntValidarCajaAbiertaOutResTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://ccla.cl/technical/core/ebo/TecResponseEBO}responseType"/>
 *         &lt;element name="horarioCajaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horarioCajaFin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCaja" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntValidarCajaAbiertaOutResTYPE", propOrder = {
    "response",
    "horarioCajaInicio",
    "horarioCajaFin",
    "statusCaja"
})
public class EntValidarCajaAbiertaOutResTYPE {

    @XmlElement(required = true)
    protected ResponseType response;
    @XmlElement(required = true)
    protected String horarioCajaInicio;
    @XmlElement(required = true)
    protected String horarioCajaFin;
    protected int statusCaja;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the horarioCajaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioCajaInicio() {
        return horarioCajaInicio;
    }

    /**
     * Sets the value of the horarioCajaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioCajaInicio(String value) {
        this.horarioCajaInicio = value;
    }

    /**
     * Gets the value of the horarioCajaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioCajaFin() {
        return horarioCajaFin;
    }

    /**
     * Sets the value of the horarioCajaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioCajaFin(String value) {
        this.horarioCajaFin = value;
    }

    /**
     * Gets the value of the statusCaja property.
     * 
     */
    public int getStatusCaja() {
        return statusCaja;
    }

    /**
     * Sets the value of the statusCaja property.
     * 
     */
    public void setStatusCaja(int value) {
        this.statusCaja = value;
    }

}
