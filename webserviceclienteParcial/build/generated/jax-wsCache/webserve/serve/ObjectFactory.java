
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

    private final static QName _CessaResponse_QNAME = new QName("http://serve/", "cessaResponse");
    private final static QName _Cessa_QNAME = new QName("http://serve/", "cessa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CessaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "cessaResponse")
    public JAXBElement<CessaResponse> createCessaResponse(CessaResponse value) {
        return new JAXBElement<CessaResponse>(_CessaResponse_QNAME, CessaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cessa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve/", name = "cessa")
    public JAXBElement<Cessa> createCessa(Cessa value) {
        return new JAXBElement<Cessa>(_Cessa_QNAME, Cessa.class, null, value);
    }

}
