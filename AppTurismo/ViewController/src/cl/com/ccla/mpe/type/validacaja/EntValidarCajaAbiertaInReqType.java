
package cl.com.ccla.mpe.type.validacaja;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntValidarCajaAbiertaInReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntValidarCajaAbiertaInReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caja" type="{http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta}cajaTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntValidarCajaAbiertaInReqType", propOrder = {
    "caja"
})
public class EntValidarCajaAbiertaInReqType {

    @XmlElement(required = true)
    protected CajaTYPE caja;

    /**
     * Gets the value of the caja property.
     * 
     * @return
     *     possible object is
     *     {@link CajaTYPE }
     *     
     */
    public CajaTYPE getCaja() {
        return caja;
    }

    /**
     * Sets the value of the caja property.
     * 
     * @param value
     *     allowed object is
     *     {@link CajaTYPE }
     *     
     */
    public void setCaja(CajaTYPE value) {
        this.caja = value;
    }

}
