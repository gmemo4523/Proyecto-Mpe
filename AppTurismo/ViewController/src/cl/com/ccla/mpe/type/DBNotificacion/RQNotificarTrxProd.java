
package cl.com.ccla.mpe.type.DBNotificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RQ_NotificarTrx_Prod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RQ_NotificarTrx_Prod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notificacion" type="{http://producto.notificacion.dashboard.ws.ccla.cl/}RQ_Notif_Prod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RQ_NotificarTrx_Prod", propOrder = {
    "notificacion"
})
public class RQNotificarTrxProd {

    @XmlElement(name = "Notificacion", required = true)
    protected RQNotifProd notificacion;

    /**
     * Gets the value of the notificacion property.
     * 
     * @return
     *     possible object is
     *     {@link RQNotifProd }
     *     
     */
    public RQNotifProd getNotificacion() {
        return notificacion;
    }

    /**
     * Sets the value of the notificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RQNotifProd }
     *     
     */
    public void setNotificacion(RQNotifProd value) {
        this.notificacion = value;
    }

}
