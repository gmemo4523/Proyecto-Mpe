
package cl.com.ccla.mpe.type.turismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntConsultarDatosTurismoOutResTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntConsultarDatosTurismoOutResTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://ccla.cl/technical/core/ebo/TecResponseEBO}responseType"/>
 *         &lt;element name="listaTurismo" type="{http://ccla.cl/enterprise/catalogo/ebm/datosTurismo}ListaTurismoTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntConsultarDatosTurismoOutResTYPE", propOrder = {
    "response",
    "listaTurismo"
})
public class EntConsultarDatosTurismoOutResTYPE {

    @XmlElement(required = true)
    protected ResponseType response;
    protected ListaTurismoTYPE listaTurismo;

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
     * Gets the value of the listaTurismo property.
     * 
     * @return
     *     possible object is
     *     {@link ListaTurismoTYPE }
     *     
     */
    public ListaTurismoTYPE getListaTurismo() {
        return listaTurismo;
    }

    /**
     * Sets the value of the listaTurismo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaTurismoTYPE }
     *     
     */
    public void setListaTurismo(ListaTurismoTYPE value) {
        this.listaTurismo = value;
    }

}
