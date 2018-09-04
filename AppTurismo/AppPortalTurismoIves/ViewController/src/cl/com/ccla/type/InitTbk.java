
package cl.com.ccla.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for initTbk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="initTbk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initMpe" type="{http://ws/}initMpeTbkVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "initTbk", propOrder = {
    "initMpe"
})
public class InitTbk {

    protected InitMpeTbkVO initMpe;

    /**
     * Gets the value of the initMpe property.
     * 
     * @return
     *     possible object is
     *     {@link InitMpeTbkVO }
     *     
     */
    public InitMpeTbkVO getInitMpe() {
        return initMpe;
    }

    /**
     * Sets the value of the initMpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitMpeTbkVO }
     *     
     */
    public void setInitMpe(InitMpeTbkVO value) {
        this.initMpe = value;
    }

}
