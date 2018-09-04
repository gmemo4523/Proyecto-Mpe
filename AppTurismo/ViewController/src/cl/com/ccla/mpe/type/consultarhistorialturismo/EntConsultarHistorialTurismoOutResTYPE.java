
package cl.com.ccla.mpe.type.consultarhistorialturismo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntConsultarHistorialTurismoOutResTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntConsultarHistorialTurismoOutResTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://ccla.cl/technical/core/ebo/TecResponseEBO}responseType"/>
 *         &lt;element name="listaHistorialTurismo" type="{http://ccla.cl/enterprise/catalogo/ebm/historialTurismo}ListaHistorialTurismoTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntConsultarHistorialTurismoOutResTYPE", propOrder = {
    "response",
    "listaHistorialTurismo"
})
public class EntConsultarHistorialTurismoOutResTYPE {

    @XmlElement(required = true)
    protected ResponseType response;
    protected ListaHistorialTurismoTYPE listaHistorialTurismo;

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
     * Gets the value of the listaHistorialTurismo property.
     * 
     * @return
     *     possible object is
     *     {@link ListaHistorialTurismoTYPE }
     *     
     */
    public ListaHistorialTurismoTYPE getListaHistorialTurismo() {
        return listaHistorialTurismo;
    }

    /**
     * Sets the value of the listaHistorialTurismo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaHistorialTurismoTYPE }
     *     
     */
    public void setListaHistorialTurismo(ListaHistorialTurismoTYPE value) {
        this.listaHistorialTurismo = value;
    }

}
