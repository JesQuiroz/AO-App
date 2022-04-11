package services.ipaws.fema.gov.ipaws_capservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-04-11T15:34:10.592-04:00
 * Generated source version: 3.5.1
 *
 */
@WebService(targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/", name = "CAPserviceInterface")
@XmlSeeAlso({services.ipaws.fema.gov.caprequest.ObjectFactory.class, ObjectFactory.class, oasis.names.tc.emergency.cap._1.ObjectFactory.class, services.ipaws.fema.gov.capresponse.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CAPserviceInterface {

    @WebMethod(action = "http://gov.fema.ipaws.services/IPAWS_CAPService/getMessage")
    @WebResult(name = "messageResponseTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/", partName = "parameters")
    public MessageResponseTypeDef getMessage(

        @WebParam(partName = "parameters", name = "getMessageTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/")
        services.ipaws.fema.gov.caprequest.RequestParameterList parameters
    ) throws CAPSoapException;

    @WebMethod(action = "http://gov.fema.ipaws.services/IPAWS_CAPService/postCAP")
    @WebResult(name = "postCAPResponseTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/", partName = "parameters")
    public services.ipaws.fema.gov.capresponse.ResponseParameterList postCAP(

        @WebParam(partName = "parameters", name = "postCAPRequestTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/")
        PostCAPRequestTypeDef parameters
    ) throws CAPSoapException;

    @WebMethod(action = "http://gov.fema.ipaws.services/IPAWS_CAPService/getRequest")
    @WebResult(name = "getResponseTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/", partName = "parameters")
    public services.ipaws.fema.gov.capresponse.ResponseParameterList getRequest(

        @WebParam(partName = "parameters", name = "getRequestTypeDef", targetNamespace = "http://gov.fema.ipaws.services/IPAWS_CAPService/")
        services.ipaws.fema.gov.caprequest.RequestParameterList parameters
    ) throws CAPSoapException;
}
