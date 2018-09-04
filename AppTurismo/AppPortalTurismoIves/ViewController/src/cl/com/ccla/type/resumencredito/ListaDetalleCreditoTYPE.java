
package cl.com.ccla.type.resumencredito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaDetalleCreditoTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaDetalleCreditoTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detalleCredito" type="{http://ccla.cl/enterprise/catalogo/ebm/resumenCredito}detalleCreditoTYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDetalleCreditoTYPE", propOrder = {
    "detalleCredito"
})
public class ListaDetalleCreditoTYPE {

    protected List<DetalleCreditoTYPE> detalleCredito;

    /**
     * Gets the value of the detalleCredito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleCredito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleCredito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleCreditoTYPE }
     * 
     * 
     */
    public List<DetalleCreditoTYPE> getDetalleCredito() {
        if (detalleCredito == null) {
            detalleCredito = new ArrayList<DetalleCreditoTYPE>();
        }
        return this.detalleCredito;
    }

}
