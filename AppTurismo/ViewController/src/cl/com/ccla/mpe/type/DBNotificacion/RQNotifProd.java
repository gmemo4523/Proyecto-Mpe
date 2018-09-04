
package cl.com.ccla.mpe.type.DBNotificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RQ_Notif_Prod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RQ_Notif_Prod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TRX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ORIGEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RQ_Notif_Prod", propOrder = {
    "idtrx",
    "estado",
    "producto",
    "origen"
})
public class RQNotifProd {

    @XmlElement(name = "ID_TRX", required = true)
    protected String idtrx;
    @XmlElement(name = "ESTADO")
    protected long estado;
    @XmlElement(name = "PRODUCTO")
    protected long producto;
    @XmlElement(name = "ORIGEN", required = true)
    protected String origen;

    /**
     * Gets the value of the idtrx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTRX() {
        return idtrx;
    }

    /**
     * Sets the value of the idtrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTRX(String value) {
        this.idtrx = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public long getESTADO() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setESTADO(long value) {
        this.estado = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     */
    public long getPRODUCTO() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     */
    public void setPRODUCTO(long value) {
        this.producto = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGEN() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGEN(String value) {
        this.origen = value;
    }

}
