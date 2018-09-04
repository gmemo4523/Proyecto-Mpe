
package cl.com.ccla.mpe.type.consultarhistorialturismo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaHistorialTurismoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaHistorialTurismoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistorialTurismo" type="{http://ccla.cl/enterprise/catalogo/ebm/historialTurismo}HistorialTurismoTYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaHistorialTurismoTYPE", propOrder = {
    "historialTurismo"
})
public class ListaHistorialTurismoTYPE {

    @XmlElement(name = "HistorialTurismo")
    protected List<HistorialTurismoTYPE> historialTurismo;

    /**
     * Gets the value of the historialTurismo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historialTurismo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistorialTurismo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistorialTurismoTYPE }
     * 
     * 
     */
    public List<HistorialTurismoTYPE> getHistorialTurismo() {
        if (historialTurismo == null) {
            historialTurismo = new ArrayList<HistorialTurismoTYPE>();
        }
        return this.historialTurismo;
    }

}
