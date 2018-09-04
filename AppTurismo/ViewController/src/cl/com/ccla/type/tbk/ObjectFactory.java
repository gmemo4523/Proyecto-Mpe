
package cl.com.ccla.type.tbk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.com.ccla.type.tbk package. 
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

    private final static QName _GetResultado_QNAME = new QName("http://ws/", "getResultado");
    private final static QName _GetResultadoResponse_QNAME = new QName("http://ws/", "getResultadoResponse");
    private final static QName _InitTbk_QNAME = new QName("http://ws/", "initTbk");
    private final static QName _InitTbkResponse_QNAME = new QName("http://ws/", "initTbkResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.com.ccla.type.tbk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InitTbkResponse }
     * 
     */
    public InitTbkResponse createInitTbkResponse() {
        return new InitTbkResponse();
    }

    /**
     * Create an instance of {@link InitTbk }
     * 
     */
    public InitTbk createInitTbk() {
        return new InitTbk();
    }

    /**
     * Create an instance of {@link GetResultadoResponse }
     * 
     */
    public GetResultadoResponse createGetResultadoResponse() {
        return new GetResultadoResponse();
    }

    /**
     * Create an instance of {@link GetResultado }
     * 
     */
    public GetResultado createGetResultado() {
        return new GetResultado();
    }

    /**
     * Create an instance of {@link InitMpeTbkVO }
     * 
     */
    public InitMpeTbkVO createInitMpeTbkVO() {
        return new InitMpeTbkVO();
    }

    /**
     * Create an instance of {@link InitVO }
     * 
     */
    public InitVO createInitVO() {
        return new InitVO();
    }

    /**
     * Create an instance of {@link WsTransactionDetailOutput }
     * 
     */
    public WsTransactionDetailOutput createWsTransactionDetailOutput() {
        return new WsTransactionDetailOutput();
    }

    /**
     * Create an instance of {@link TransactionResultOutput }
     * 
     */
    public TransactionResultOutput createTransactionResultOutput() {
        return new TransactionResultOutput();
    }

    /**
     * Create an instance of {@link CardDetail }
     * 
     */
    public CardDetail createCardDetail() {
        return new CardDetail();
    }

    /**
     * Create an instance of {@link WsTransactionDetail }
     * 
     */
    public WsTransactionDetail createWsTransactionDetail() {
        return new WsTransactionDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getResultado")
    public JAXBElement<GetResultado> createGetResultado(GetResultado value) {
        return new JAXBElement<GetResultado>(_GetResultado_QNAME, GetResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getResultadoResponse")
    public JAXBElement<GetResultadoResponse> createGetResultadoResponse(GetResultadoResponse value) {
        return new JAXBElement<GetResultadoResponse>(_GetResultadoResponse_QNAME, GetResultadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitTbk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "initTbk")
    public JAXBElement<InitTbk> createInitTbk(InitTbk value) {
        return new JAXBElement<InitTbk>(_InitTbk_QNAME, InitTbk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitTbkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "initTbkResponse")
    public JAXBElement<InitTbkResponse> createInitTbkResponse(InitTbkResponse value) {
        return new JAXBElement<InitTbkResponse>(_InitTbkResponse_QNAME, InitTbkResponse.class, null, value);
    }

}
