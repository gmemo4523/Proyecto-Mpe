
package cl.com.ccla.mpe.type.DBNotificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.mpe.type.DBNotificacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificarTrxWPRS_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_WPRS");
    private final static QName _NotificarTrxWPRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_WPRQ");
    private final static QName _NotifProdRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Notif_ProdRQ");
    private final static QName _NotificarTrxProdRS_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_ProdRS");
    private final static QName _DataWPRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Data_WPRQ");
    private final static QName _NotificarTrxProdRQ_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "NotificarTrx_ProdRQ");
    private final static QName _Status_QNAME = new QName("http://producto.notificacion.dashboard.ws.ccla.cl/", "Status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.mpe.type.DBNotificacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RSStatus }
     * 
     */
    public RSStatus createRSStatus() {
        return new RSStatus();
    }

    /**
     * Create an instance of {@link RQNotificarTrxProd }
     * 
     */
    public RQNotificarTrxProd createRQNotificarTrxProd() {
        return new RQNotificarTrxProd();
    }

    /**
     * Create an instance of {@link RQDataWP }
     * 
     */
    public RQDataWP createRQDataWP() {
        return new RQDataWP();
    }

    /**
     * Create an instance of {@link RSNotificarTrxProd }
     * 
     */
    public RSNotificarTrxProd createRSNotificarTrxProd() {
        return new RSNotificarTrxProd();
    }

    /**
     * Create an instance of {@link RQNotifProd }
     * 
     */
    public RQNotifProd createRQNotifProd() {
        return new RQNotifProd();
    }

    /**
     * Create an instance of {@link RSNotificarTrxWP }
     * 
     */
    public RSNotificarTrxWP createRSNotificarTrxWP() {
        return new RSNotificarTrxWP();
    }

    /**
     * Create an instance of {@link RQNotificarTrxWP }
     * 
     */
    public RQNotificarTrxWP createRQNotificarTrxWP() {
        return new RQNotificarTrxWP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSNotificarTrxWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_WPRS")
    public JAXBElement<RSNotificarTrxWP> createNotificarTrxWPRS(RSNotificarTrxWP value) {
        return new JAXBElement<RSNotificarTrxWP>(_NotificarTrxWPRS_QNAME, RSNotificarTrxWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQNotificarTrxWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_WPRQ")
    public JAXBElement<RQNotificarTrxWP> createNotificarTrxWPRQ(RQNotificarTrxWP value) {
        return new JAXBElement<RQNotificarTrxWP>(_NotificarTrxWPRQ_QNAME, RQNotificarTrxWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQNotifProd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Notif_ProdRQ")
    public JAXBElement<RQNotifProd> createNotifProdRQ(RQNotifProd value) {
        return new JAXBElement<RQNotifProd>(_NotifProdRQ_QNAME, RQNotifProd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSNotificarTrxProd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_ProdRS")
    public JAXBElement<RSNotificarTrxProd> createNotificarTrxProdRS(RSNotificarTrxProd value) {
        return new JAXBElement<RSNotificarTrxProd>(_NotificarTrxProdRS_QNAME, RSNotificarTrxProd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQDataWP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Data_WPRQ")
    public JAXBElement<RQDataWP> createDataWPRQ(RQDataWP value) {
        return new JAXBElement<RQDataWP>(_DataWPRQ_QNAME, RQDataWP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RQNotificarTrxProd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "NotificarTrx_ProdRQ")
    public JAXBElement<RQNotificarTrxProd> createNotificarTrxProdRQ(RQNotificarTrxProd value) {
        return new JAXBElement<RQNotificarTrxProd>(_NotificarTrxProdRQ_QNAME, RQNotificarTrxProd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://producto.notificacion.dashboard.ws.ccla.cl/", name = "Status")
    public JAXBElement<RSStatus> createStatus(RSStatus value) {
        return new JAXBElement<RSStatus>(_Status_QNAME, RSStatus.class, null, value);
    }

}
