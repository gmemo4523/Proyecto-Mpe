
package cl.com.ccla.type.consultadatosturismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntConsultarDatosTurismoInReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntConsultarDatosTurismoInReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persona" type="{http://ccla.cl/enterprise/catalogo/ebm/datosTurismo}personaTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntConsultarDatosTurismoInReqType", propOrder = {
    "persona"
})
public class EntConsultarDatosTurismoInReqType {

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
