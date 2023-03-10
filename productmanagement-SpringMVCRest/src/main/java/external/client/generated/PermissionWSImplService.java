
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
@WebServiceClient(name = "PermissionWSImplService", targetNamespace = "http://controller.usermanagement.digipay.com/", wsdlLocation = "http://localhost:8080/usermanagement_webapp_war/permissions?wsdl")
public class PermissionWSImplService
    extends Service
{

    private final static URL PERMISSIONWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERMISSIONWSIMPLSERVICE_EXCEPTION;
    private final static QName PERMISSIONWSIMPLSERVICE_QNAME = new QName("http://controller.usermanagement.digipay.com/", "PermissionWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/usermanagement_webapp_war/permissions?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERMISSIONWSIMPLSERVICE_WSDL_LOCATION = url;
        PERMISSIONWSIMPLSERVICE_EXCEPTION = e;
    }

    public PermissionWSImplService() {
        super(__getWsdlLocation(), PERMISSIONWSIMPLSERVICE_QNAME);
    }

    public PermissionWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERMISSIONWSIMPLSERVICE_QNAME, features);
    }

    public PermissionWSImplService(URL wsdlLocation) {
        super(wsdlLocation, PERMISSIONWSIMPLSERVICE_QNAME);
    }

    public PermissionWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERMISSIONWSIMPLSERVICE_QNAME, features);
    }

    public PermissionWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PermissionWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PermissionWS
     */
    @WebEndpoint(name = "PermissionWSImplPort")
    public PermissionWS getPermissionWSImplPort() {
        return super.getPort(new QName("http://controller.usermanagement.digipay.com/", "PermissionWSImplPort"), PermissionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PermissionWS
     */
    @WebEndpoint(name = "PermissionWSImplPort")
    public PermissionWS getPermissionWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.usermanagement.digipay.com/", "PermissionWSImplPort"), PermissionWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERMISSIONWSIMPLSERVICE_EXCEPTION!= null) {
            throw PERMISSIONWSIMPLSERVICE_EXCEPTION;
        }
        return PERMISSIONWSIMPLSERVICE_WSDL_LOCATION;
    }

}
