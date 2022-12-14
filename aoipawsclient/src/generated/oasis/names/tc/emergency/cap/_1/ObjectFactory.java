
package oasis.names.tc.emergency.cap._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.emergency.cap._1 package. 
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

    private final static QName _ValueName_QNAME = new QName("urn:oasis:names:tc:emergency:cap:1.2", "valueName");
    private final static QName _Value_QNAME = new QName("urn:oasis:names:tc:emergency:cap:1.2", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.emergency.cap._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alert }
     * 
     */
    public Alert createAlert() {
        return new Alert();
    }

    /**
     * Create an instance of {@link Alert.Info }
     * 
     */
    public Alert.Info createAlertInfo() {
        return new Alert.Info();
    }

    /**
     * Create an instance of {@link Alert.Info.Area }
     * 
     */
    public Alert.Info.Area createAlertInfoArea() {
        return new Alert.Info.Area();
    }

    /**
     * Create an instance of {@link Alert.Info.EventCode }
     * 
     */
    public Alert.Info.EventCode createAlertInfoEventCode() {
        return new Alert.Info.EventCode();
    }

    /**
     * Create an instance of {@link Alert.Info.Parameter }
     * 
     */
    public Alert.Info.Parameter createAlertInfoParameter() {
        return new Alert.Info.Parameter();
    }

    /**
     * Create an instance of {@link Alert.Info.Resource }
     * 
     */
    public Alert.Info.Resource createAlertInfoResource() {
        return new Alert.Info.Resource();
    }

    /**
     * Create an instance of {@link Alert.Info.Area.Geocode }
     * 
     */
    public Alert.Info.Area.Geocode createAlertInfoAreaGeocode() {
        return new Alert.Info.Area.Geocode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:emergency:cap:1.2", name = "valueName")
    public JAXBElement<String> createValueName(String value) {
        return new JAXBElement<String>(_ValueName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:emergency:cap:1.2", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

}
