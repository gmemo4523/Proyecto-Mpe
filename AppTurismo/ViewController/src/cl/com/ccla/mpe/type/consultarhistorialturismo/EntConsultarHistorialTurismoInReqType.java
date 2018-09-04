
package cl.com.ccla.mpe.type.consultarhistorialturismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntConsultarHistorialTurismoInReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntConsultarHistorialTurismoInReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persona" type="{http://ccla.cl/enterprise/catalogo/ebm/historialTurismo}personaTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntConsultarHistorialTurismoInReqType", propOrder = {
    "persona"
})
public class EntConsultarHistorialTurismoInReqType {

    @XmlElement(required = true)
    protected PersonaTYPE persona;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaTYPE }
     *     
     */
    public PersonaTYPE getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaTYPE }
     *     
     */
    public void setPersona(PersonaTYPE value) {
        this.persona = value;
    }

}
