
package external.client.generated;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "UserWSImplService", targetNamespace = "http://controller.usermanagement.digipay.com/", wsdlLocation = "http://localhost:8080/usermanagement_webapp_war/users?wsdl")
public class UserWSImplService
    extends Service
{

    private final static URL USERWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERWSIMPLSERVICE_EXCEPTION;
    private final static QName USERWSIMPLSERVICE_QNAME = new QName("http://controller.usermanagement.digipay.com/", "UserWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/usermanagement_webapp_war/users?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWSIMPLSERVICE_WSDL_LOCATION = url;
        USERWSIMPLSERVICE_EXCEPTION = e;
    }

    public UserWSImplService() {
        super(__getWsdlLocation(), USERWSIMPLSERVICE_QNAME);
    }

    public UserWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWSIMPLSERVICE_QNAME, features);
    }

    public UserWSImplService(URL wsdlLocation) {
        super(wsdlLocation, USERWSIMPLSERVICE_QNAME);
    }

    public UserWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWSIMPLSERVICE_QNAME, features);
    }

    public UserWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWS
     */
    @WebEndpoint(name = "UserWSImplPort")
    public UserWS getUserWSImplPort() {
        return super.getPort(new QName("http://controller.usermanagement.digipay.com/", "UserWSImplPort"), UserWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWS
     */
    @WebEndpoint(name = "UserWSImplPort")
    public UserWS getUserWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.usermanagement.digipay.com/", "UserWSImplPort"), UserWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWSIMPLSERVICE_EXCEPTION!= null) {
            throw USERWSIMPLSERVICE_EXCEPTION;
        }
        return USERWSIMPLSERVICE_WSDL_LOCATION;
    }

}
