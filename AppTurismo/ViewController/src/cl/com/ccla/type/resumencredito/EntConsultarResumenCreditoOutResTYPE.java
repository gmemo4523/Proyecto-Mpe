
package cl.com.ccla.type.resumencredito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntConsultarResumenCreditoOutResTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntConsultarResumenCreditoOutResTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://ccla.cl/technical/core/ebo/TecResponseEBO}responseType"/>
 *         &lt;element name="listaCreditos" type="{http://ccla.cl/enterprise/catalogo/ebm/resumenCredito}ListaCreditosTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntConsultarResumenCreditoOutResTYPE", propOrder = {
    "response",
    "listaCreditos"
})
public class EntConsultarResumenCreditoOutResTYPE {

    @XmlElement(required = true)
    protected ResponseType response;
    protected ListaCreditosTYPE listaCreditos;

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
     * Gets the value of the listaCreditos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaCreditosTYPE }
     *     
     */
    public ListaCreditosTYPE getListaCreditos() {
        return listaCreditos;
    }

    /**
     * Sets the value of the listaCreditos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCreditosTYPE }
     *     
     */
    public void setListaCreditos(ListaCreditosTYPE value) {
        this.listaCreditos = value;
    }

}
