
package serve;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webserve", targetNamespace = "http://serve/", wsdlLocation = "http://localhost:8080/webserviceParcial2/webserve?WSDL")
public class Webserve_Service
    extends Service
{

    private final static URL WEBSERVE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVE_EXCEPTION;
    private final static QName WEBSERVE_QNAME = new QName("http://serve/", "webserve");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webserviceParcial2/webserve?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVE_WSDL_LOCATION = url;
        WEBSERVE_EXCEPTION = e;
    }

    public Webserve_Service() {
        super(__getWsdlLocation(), WEBSERVE_QNAME);
    }

    public Webserve_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVE_QNAME, features);
    }

    public Webserve_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVE_QNAME);
    }

    public Webserve_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVE_QNAME, features);
    }

    public Webserve_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Webserve_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Webserve
     */
    @WebEndpoint(name = "webservePort")
    public Webserve getWebservePort() {
        return super.getPort(new QName("http://serve/", "webservePort"), Webserve.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Webserve
     */
    @WebEndpoint(name = "webservePort")
    public Webserve getWebservePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serve/", "webservePort"), Webserve.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVE_EXCEPTION!= null) {
            throw WEBSERVE_EXCEPTION;
        }
        return WEBSERVE_WSDL_LOCATION;
    }

}
