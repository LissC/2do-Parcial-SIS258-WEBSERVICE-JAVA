
package serve;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serve package. 
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

    private final static QName _Elapas_QNAME = new QName("http://service/", "elapas");
    private final static QName _ElapasResponse_QNAME = new QName("http://service/", "elapasResponse");
    private final static QName _Cessa_QNAME = new QName("http://service/", "cessa");
    private final static QName _CessaResponse_QNAME = new QName("http://service/", "cessaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Elapas }
     * 
     */
    public Elapas createElapas() {
        return new Elapas();
    }

    /**
     * Create an instance of {@link ElapasResponse }
     * 
     */
    public ElapasResponse createElapasResponse() {
        return new ElapasResponse();
    }

    /**
     * Create an instance of {@link CessaResponse }
     * 
     */
    public CessaResponse createCessaResponse() {
        return new CessaResponse();
    }

    /**
     * Create an instance of {@link Cessa }
     * 
     */
    public Cessa createCessa() {
        return new Cessa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Elapas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "elapas")
    public JAXBElement<Elapas> createElapas(Elapas value) {
        return new JAXBElement<Elapas>(_Elapas_QNAME, Elapas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElapasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "elapasResponse")
    public JAXBElement<ElapasResponse> createElapasResponse(ElapasResponse value) {
        return new JAXBElement<ElapasResponse>(_ElapasResponse_QNAME, ElapasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cessa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "cessa")
    public JAXBElement<Cessa> createCessa(Cessa value) {
        return new JAXBElement<Cessa>(_Cessa_QNAME, Cessa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CessaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "cessaResponse")
    public JAXBElement<CessaResponse> createCessaResponse(CessaResponse value) {
        return new JAXBElement<CessaResponse>(_CessaResponse_QNAME, CessaResponse.class, null, value);
    }

}
