
package cl.com.ccla.mpe.type.DBNotificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RQ_NotificarTrx_WP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RQ_NotificarTrx_WP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_TRX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataWP" type="{http://producto.notificacion.dashboard.ws.ccla.cl/}RQ_Data_WP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RQ_NotificarTrx_WP", propOrder = {
    "idtrx",
    "tipoMov",
    "dataWP"
})
public class RQNotificarTrxWP {

    @XmlElement(name = "ID_TRX", required = true)
    protected String idtrx;
    @XmlElement(name = "TipoMov", required = true)
    protected String tipoMov;
    @XmlElement(required = true)
    protected RQDataWP dataWP;

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
     * Gets the value of the tipoMov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMov() {
        return tipoMov;
    }

    /**
     * Sets the value of the tipoMov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMov(String value) {
        this.tipoMov = value;
    }

    /**
     * Gets the value of the dataWP property.
     * 
     * @return
     *     possible object is
     *     {@link RQDataWP }
     *     
     */
    public RQDataWP getDataWP() {
        return dataWP;
    }

    /**
     * Sets the value of the dataWP property.
     * 
     * @param value
     *     allowed object is
     *     {@link RQDataWP }
     *     
     */
    public void setDataWP(RQDataWP value) {
        this.dataWP = value;
    }

}
