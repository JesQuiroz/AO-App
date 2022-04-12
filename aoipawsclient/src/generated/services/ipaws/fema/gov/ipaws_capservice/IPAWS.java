package services.ipaws.fema.gov.ipaws_capservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * OSB Service
 *
 * This class was generated by Apache CXF 3.5.1
 * 2022-04-11T15:34:10.603-04:00
 * Generated source version: 3.5.1
 *
 */
@WebServiceClient(name = "IPAWS",
                  wsdlLocation = "file:/C:/Users/John/Desktop/New%20folder%20(2)/src/main/resources/wsdl/IPAWS.wsdl",
                  targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/")
public class IPAWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gov.fema.ipaws.services/IPAWS_CAPService/", "IPAWS");
    public final static QName IPAWS = new QName("http://gov.fema.ipaws.services/IPAWS_CAPService/", "IPAWS");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/John/Desktop/New%20folder%20(2)/src/main/resources/wsdl/IPAWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IPAWS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/John/Desktop/New%20folder%20(2)/src/main/resources/wsdl/IPAWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IPAWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IPAWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IPAWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public IPAWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IPAWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IPAWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CAPserviceInterface
     */
    @WebEndpoint(name = "IPAWS")
    public CAPserviceInterface getIPAWS() {
        return super.getPort(IPAWS, CAPserviceInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CAPserviceInterface
     */
    @WebEndpoint(name = "IPAWS")
    public CAPserviceInterface getIPAWS(WebServiceFeature... features) {
        return super.getPort(IPAWS, CAPserviceInterface.class, features);
    }

}
