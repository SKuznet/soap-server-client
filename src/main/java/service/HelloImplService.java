
package service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloImplService", targetNamespace = "http://service/", wsdlLocation = "http://127.0.0.1:12345/Service?wsdl")
public class HelloImplService
    extends Service
{

    private final static URL HELLOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOIMPLSERVICE_EXCEPTION;
    private final static QName HELLOIMPLSERVICE_QNAME = new QName("http://service/", "HelloImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:12345/Service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOIMPLSERVICE_WSDL_LOCATION = url;
        HELLOIMPLSERVICE_EXCEPTION = e;
    }

    public HelloImplService() {
        super(__getWsdlLocation(), HELLOIMPLSERVICE_QNAME);
    }

    public HelloImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOIMPLSERVICE_QNAME, features);
    }

    public HelloImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOIMPLSERVICE_QNAME);
    }

    public HelloImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOIMPLSERVICE_QNAME, features);
    }

    public HelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort() {
        return super.getPort(new QName("http://service/", "HelloImplPort"), Hello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "HelloImplPort"), Hello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOIMPLSERVICE_EXCEPTION;
        }
        return HELLOIMPLSERVICE_WSDL_LOCATION;
    }

}
