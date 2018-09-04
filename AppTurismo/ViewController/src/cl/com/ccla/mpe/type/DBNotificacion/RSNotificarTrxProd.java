
package cl.com.ccla.mpe.type.DBNotificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RS_NotificarTrx_Prod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RS_NotificarTrx_Prod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://producto.notificacion.dashboard.ws.ccla.cl/}Status"/>
 *         &lt;element name="estadoOperacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RS_NotificarTrx_Prod", propOrder = {
    "status",
    "estadoOperacion",
    "descOperacion"
})
public class RSNotificarTrxProd {

    @XmlElement(name = "Status", namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", required = true)
    protected RSStatus status;
    protected long estadoOperacion;
    @XmlElement(required = true)
    protected String descOperacion;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RSStatus }
     *     
     */
    public RSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSStatus }
     *     
     */
    public void setStatus(RSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the estadoOperacion property.
     * 
     */
    public long getEstadoOperacion() {
        return estadoOperacion;
    }

    /**
     * Sets the value of the estadoOperacion property.
     * 
     */
    public void setEstadoOperacion(long value) {
        this.estadoOperacion = value;
    }

    /**
     * Gets the value of the descOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOperacion() {
        return descOperacion;
    }

    /**
     * Sets the value of the descOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOperacion(String value) {
        this.descOperacion = value;
    }

}
