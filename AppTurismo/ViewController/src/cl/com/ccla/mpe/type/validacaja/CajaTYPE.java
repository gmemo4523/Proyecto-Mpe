
package cl.com.ccla.mpe.type.validacaja;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cajaTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cajaTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cajaTYPE", propOrder = {
    "pagoUsuario"
})
public class CajaTYPE {

    @XmlElementRef(name = "pagoUsuario", namespace = "http://ccla.cl/enterprise/catalogo/ebm/validarCajaAbierta", type = JAXBElement.class)
    protected JAXBElement<String> pagoUsuario;

    /**
     * Gets the value of the pagoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPagoUsuario() {
        return pagoUsuario;
    }

    /**
     * Sets the value of the pagoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPagoUsuario(JAXBElement<String> value) {
        this.pagoUsuario = value;
    }

}
