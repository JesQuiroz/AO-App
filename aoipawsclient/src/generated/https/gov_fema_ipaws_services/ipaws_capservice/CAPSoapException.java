
package https.gov_fema_ipaws_services.ipaws_capservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-04-06T18:21:06.982-04:00
 * Generated source version: 3.5.1
 */

@WebFault(name = "CAPServiceException", targetNamespace = "https://gov.fema.ipaws.services/IPAWS_CAPService/")
public class CAPSoapException extends Exception {

    private https.gov_fema_ipaws_services.ipaws_capservice.CAPServiceException faultInfo;

    public CAPSoapException() {
        super();
    }

    public CAPSoapException(String message) {
        super(message);
    }

    public CAPSoapException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CAPSoapException(String message, https.gov_fema_ipaws_services.ipaws_capservice.CAPServiceException capServiceException) {
        super(message);
        this.faultInfo = capServiceException;
    }

    public CAPSoapException(String message, https.gov_fema_ipaws_services.ipaws_capservice.CAPServiceException capServiceException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = capServiceException;
    }

    public https.gov_fema_ipaws_services.ipaws_capservice.CAPServiceException getFaultInfo() {
        return this.faultInfo;
    }
}