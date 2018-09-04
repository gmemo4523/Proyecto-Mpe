
package cl.com.ccla.type.consultadatosturismo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaTurismoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaTurismoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Turismo" type="{http://ccla.cl/enterprise/catalogo/ebm/datosTurismo}TurismoTYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaTurismoTYPE", propOrder = {
    "turismo"
})
public class ListaTurismoTYPE {

    @XmlElement(name = "Turismo")
    protected List<TurismoTYPE> turismo;

    /**
     * Gets the value of the turismo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turismo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurismo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TurismoTYPE }
     * 
     * 
     */
    public List<TurismoTYPE> getTurismo() {
        if (turismo == null) {
            turismo = new ArrayList<TurismoTYPE>();
        }
        return this.turismo;
    }

}
