
package oasis.names.tc.emergency.cap._1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sent"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Actual"/&gt;
 *               &lt;enumeration value="Exercise"/&gt;
 *               &lt;enumeration value="System"/&gt;
 *               &lt;enumeration value="Test"/&gt;
 *               &lt;enumeration value="Draft"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="msgType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Alert"/&gt;
 *               &lt;enumeration value="Update"/&gt;
 *               &lt;enumeration value="Cancel"/&gt;
 *               &lt;enumeration value="Ack"/&gt;
 *               &lt;enumeration value="Error"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scope"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Public"/&gt;
 *               &lt;enumeration value="Restricted"/&gt;
 *               &lt;enumeration value="Private"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="references" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="info" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *                   &lt;element name="category" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Geo"/&gt;
 *                         &lt;enumeration value="Met"/&gt;
 *                         &lt;enumeration value="Safety"/&gt;
 *                         &lt;enumeration value="Security"/&gt;
 *                         &lt;enumeration value="Rescue"/&gt;
 *                         &lt;enumeration value="Fire"/&gt;
 *                         &lt;enumeration value="Health"/&gt;
 *                         &lt;enumeration value="Env"/&gt;
 *                         &lt;enumeration value="Transport"/&gt;
 *                         &lt;enumeration value="Infra"/&gt;
 *                         &lt;enumeration value="CBRNE"/&gt;
 *                         &lt;enumeration value="Other"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="responseType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Shelter"/&gt;
 *                         &lt;enumeration value="Evacuate"/&gt;
 *                         &lt;enumeration value="Prepare"/&gt;
 *                         &lt;enumeration value="Execute"/&gt;
 *                         &lt;enumeration value="Avoid"/&gt;
 *                         &lt;enumeration value="Monitor"/&gt;
 *                         &lt;enumeration value="Assess"/&gt;
 *                         &lt;enumeration value="AllClear"/&gt;
 *                         &lt;enumeration value="None"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="urgency"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Immediate"/&gt;
 *                         &lt;enumeration value="Expected"/&gt;
 *                         &lt;enumeration value="Future"/&gt;
 *                         &lt;enumeration value="Past"/&gt;
 *                         &lt;enumeration value="Unknown"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="severity"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Extreme"/&gt;
 *                         &lt;enumeration value="Severe"/&gt;
 *                         &lt;enumeration value="Moderate"/&gt;
 *                         &lt;enumeration value="Minor"/&gt;
 *                         &lt;enumeration value="Unknown"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="certainty"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Observed"/&gt;
 *                         &lt;enumeration value="Likely"/&gt;
 *                         &lt;enumeration value="Possible"/&gt;
 *                         &lt;enumeration value="Unlikely"/&gt;
 *                         &lt;enumeration value="Unknown"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="audience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="eventCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
 *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="effective" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *                         &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="onset" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *                         &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="expires" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *                         &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                   &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="parameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
 *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="resource" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="resourceDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                             &lt;element name="derefUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="area" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="areaDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="polygon" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="circle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="geocode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
 *                                       &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ceiling" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifier",
    "sender",
    "sent",
    "status",
    "msgType",
    "source",
    "scope",
    "restriction",
    "addresses",
    "code",
    "note",
    "references",
    "incidents",
    "info",
    "any"
})
@XmlRootElement(name = "alert")
public class Alert {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected XMLGregorianCalendar sent;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String msgType;
    protected String source;
    @XmlElement(required = true)
    protected String scope;
    protected String restriction;
    protected String addresses;
    protected List<String> code;
    protected String note;
    protected String references;
    protected String incidents;
    protected List<Alert.Info> info;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the sent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSent(XMLGregorianCalendar value) {
        this.sent = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresses(String value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCode() {
        if (code == null) {
            code = new ArrayList<String>();
        }
        return this.code;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * Gets the value of the incidents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidents() {
        return incidents;
    }

    /**
     * Sets the value of the incidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidents(String value) {
        this.incidents = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alert.Info }
     * 
     * 
     */
    public List<Alert.Info> getInfo() {
        if (info == null) {
            info = new ArrayList<Alert.Info>();
        }
        return this.info;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
     *         &lt;element name="category" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Geo"/&gt;
     *               &lt;enumeration value="Met"/&gt;
     *               &lt;enumeration value="Safety"/&gt;
     *               &lt;enumeration value="Security"/&gt;
     *               &lt;enumeration value="Rescue"/&gt;
     *               &lt;enumeration value="Fire"/&gt;
     *               &lt;enumeration value="Health"/&gt;
     *               &lt;enumeration value="Env"/&gt;
     *               &lt;enumeration value="Transport"/&gt;
     *               &lt;enumeration value="Infra"/&gt;
     *               &lt;enumeration value="CBRNE"/&gt;
     *               &lt;enumeration value="Other"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="responseType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Shelter"/&gt;
     *               &lt;enumeration value="Evacuate"/&gt;
     *               &lt;enumeration value="Prepare"/&gt;
     *               &lt;enumeration value="Execute"/&gt;
     *               &lt;enumeration value="Avoid"/&gt;
     *               &lt;enumeration value="Monitor"/&gt;
     *               &lt;enumeration value="Assess"/&gt;
     *               &lt;enumeration value="AllClear"/&gt;
     *               &lt;enumeration value="None"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="urgency"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Immediate"/&gt;
     *               &lt;enumeration value="Expected"/&gt;
     *               &lt;enumeration value="Future"/&gt;
     *               &lt;enumeration value="Past"/&gt;
     *               &lt;enumeration value="Unknown"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="severity"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Extreme"/&gt;
     *               &lt;enumeration value="Severe"/&gt;
     *               &lt;enumeration value="Moderate"/&gt;
     *               &lt;enumeration value="Minor"/&gt;
     *               &lt;enumeration value="Unknown"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="certainty"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Observed"/&gt;
     *               &lt;enumeration value="Likely"/&gt;
     *               &lt;enumeration value="Possible"/&gt;
     *               &lt;enumeration value="Unlikely"/&gt;
     *               &lt;enumeration value="Unknown"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="audience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="eventCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
     *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="effective" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
     *               &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="onset" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
     *               &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="expires" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
     *               &lt;pattern value="\d\d\d\d-\d\d-\d\dT\d\d:\d\d:\d\d[-,+]\d\d:\d\d"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="parameter" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
     *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="resource" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="resourceDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *                   &lt;element name="derefUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="area" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="areaDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="polygon" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="circle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="geocode" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
     *                             &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ceiling" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "language",
        "category",
        "event",
        "responseType",
        "urgency",
        "severity",
        "certainty",
        "audience",
        "eventCode",
        "effective",
        "onset",
        "expires",
        "senderName",
        "headline",
        "description",
        "instruction",
        "web",
        "contact",
        "parameter",
        "resource",
        "area"
    })
    public static class Info {

        @XmlElement(defaultValue = "en-US")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlElement(required = true)
        protected List<String> category;
        @XmlElement(required = true)
        protected String event;
        protected List<String> responseType;
        @XmlElement(required = true)
        protected String urgency;
        @XmlElement(required = true)
        protected String severity;
        @XmlElement(required = true)
        protected String certainty;
        protected String audience;
        protected List<Alert.Info.EventCode> eventCode;
        protected XMLGregorianCalendar effective;
        protected XMLGregorianCalendar onset;
        protected XMLGregorianCalendar expires;
        protected String senderName;
        protected String headline;
        protected String description;
        protected String instruction;
        @XmlSchemaType(name = "anyURI")
        protected String web;
        protected String contact;
        protected List<Alert.Info.Parameter> parameter;
        protected List<Alert.Info.Resource> resource;
        protected List<Alert.Info.Area> area;

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCategory() {
            if (category == null) {
                category = new ArrayList<String>();
            }
            return this.category;
        }

        /**
         * Gets the value of the event property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvent() {
            return event;
        }

        /**
         * Sets the value of the event property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvent(String value) {
            this.event = value;
        }

        /**
         * Gets the value of the responseType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responseType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponseType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResponseType() {
            if (responseType == null) {
                responseType = new ArrayList<String>();
            }
            return this.responseType;
        }

        /**
         * Gets the value of the urgency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrgency() {
            return urgency;
        }

        /**
         * Sets the value of the urgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrgency(String value) {
            this.urgency = value;
        }

        /**
         * Gets the value of the severity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeverity() {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeverity(String value) {
            this.severity = value;
        }

        /**
         * Gets the value of the certainty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertainty() {
            return certainty;
        }

        /**
         * Sets the value of the certainty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertainty(String value) {
            this.certainty = value;
        }

        /**
         * Gets the value of the audience property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAudience() {
            return audience;
        }

        /**
         * Sets the value of the audience property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAudience(String value) {
            this.audience = value;
        }

        /**
         * Gets the value of the eventCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alert.Info.EventCode }
         * 
         * 
         */
        public List<Alert.Info.EventCode> getEventCode() {
            if (eventCode == null) {
                eventCode = new ArrayList<Alert.Info.EventCode>();
            }
            return this.eventCode;
        }

        /**
         * Gets the value of the effective property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffective() {
            return effective;
        }

        /**
         * Sets the value of the effective property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffective(XMLGregorianCalendar value) {
            this.effective = value;
        }

        /**
         * Gets the value of the onset property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOnset() {
            return onset;
        }

        /**
         * Sets the value of the onset property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOnset(XMLGregorianCalendar value) {
            this.onset = value;
        }

        /**
         * Gets the value of the expires property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpires() {
            return expires;
        }

        /**
         * Sets the value of the expires property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpires(XMLGregorianCalendar value) {
            this.expires = value;
        }

        /**
         * Gets the value of the senderName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderName() {
            return senderName;
        }

        /**
         * Sets the value of the senderName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderName(String value) {
            this.senderName = value;
        }

        /**
         * Gets the value of the headline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadline() {
            return headline;
        }

        /**
         * Sets the value of the headline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadline(String value) {
            this.headline = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the instruction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstruction() {
            return instruction;
        }

        /**
         * Sets the value of the instruction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstruction(String value) {
            this.instruction = value;
        }

        /**
         * Gets the value of the web property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeb() {
            return web;
        }

        /**
         * Sets the value of the web property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeb(String value) {
            this.web = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alert.Info.Parameter }
         * 
         * 
         */
        public List<Alert.Info.Parameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Alert.Info.Parameter>();
            }
            return this.parameter;
        }

        /**
         * Gets the value of the resource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alert.Info.Resource }
         * 
         * 
         */
        public List<Alert.Info.Resource> getResource() {
            if (resource == null) {
                resource = new ArrayList<Alert.Info.Resource>();
            }
            return this.resource;
        }

        /**
         * Gets the value of the area property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the area property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alert.Info.Area }
         * 
         * 
         */
        public List<Alert.Info.Area> getArea() {
            if (area == null) {
                area = new ArrayList<Alert.Info.Area>();
            }
            return this.area;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="areaDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="polygon" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="circle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="geocode" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
         *                   &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ceiling" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "areaDesc",
            "polygon",
            "circle",
            "geocode",
            "altitude",
            "ceiling"
        })
        public static class Area {

            @XmlElement(required = true)
            protected String areaDesc;
            protected List<String> polygon;
            protected List<String> circle;
            protected List<Alert.Info.Area.Geocode> geocode;
            protected BigDecimal altitude;
            protected BigDecimal ceiling;

            /**
             * Gets the value of the areaDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaDesc() {
                return areaDesc;
            }

            /**
             * Sets the value of the areaDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaDesc(String value) {
                this.areaDesc = value;
            }

            /**
             * Gets the value of the polygon property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the polygon property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolygon().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPolygon() {
                if (polygon == null) {
                    polygon = new ArrayList<String>();
                }
                return this.polygon;
            }

            /**
             * Gets the value of the circle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the circle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCircle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCircle() {
                if (circle == null) {
                    circle = new ArrayList<String>();
                }
                return this.circle;
            }

            /**
             * Gets the value of the geocode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geocode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeocode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Alert.Info.Area.Geocode }
             * 
             * 
             */
            public List<Alert.Info.Area.Geocode> getGeocode() {
                if (geocode == null) {
                    geocode = new ArrayList<Alert.Info.Area.Geocode>();
                }
                return this.geocode;
            }

            /**
             * Gets the value of the altitude property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAltitude() {
                return altitude;
            }

            /**
             * Sets the value of the altitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAltitude(BigDecimal value) {
                this.altitude = value;
            }

            /**
             * Gets the value of the ceiling property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCeiling() {
                return ceiling;
            }

            /**
             * Sets the value of the ceiling property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCeiling(BigDecimal value) {
                this.ceiling = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
             *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "valueName",
                "value"
            })
            public static class Geocode {

                @XmlElement(required = true)
                protected String valueName;
                @XmlElement(required = true)
                protected String value;

                /**
                 * Gets the value of the valueName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValueName() {
                    return valueName;
                }

                /**
                 * Sets the value of the valueName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValueName(String value) {
                    this.valueName = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
         *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "valueName",
            "value"
        })
        public static class EventCode {

            @XmlElement(required = true)
            protected String valueName;
            @XmlElement(required = true)
            protected String value;

            /**
             * Gets the value of the valueName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueName() {
                return valueName;
            }

            /**
             * Sets the value of the valueName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueName(String value) {
                this.valueName = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}valueName"/&gt;
         *         &lt;element ref="{urn:oasis:names:tc:emergency:cap:1.2}value"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "valueName",
            "value"
        })
        public static class Parameter {

            @XmlElement(required = true)
            protected String valueName;
            @XmlElement(required = true)
            protected String value;

            /**
             * Gets the value of the valueName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueName() {
                return valueName;
            }

            /**
             * Sets the value of the valueName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueName(String value) {
                this.valueName = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="resourceDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
         *         &lt;element name="derefUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "resourceDesc",
            "mimeType",
            "size",
            "uri",
            "derefUri",
            "digest"
        })
        public static class Resource {

            @XmlElement(required = true)
            protected String resourceDesc;
            @XmlElement(required = true)
            protected String mimeType;
            protected BigInteger size;
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            protected String derefUri;
            protected String digest;

            /**
             * Gets the value of the resourceDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResourceDesc() {
                return resourceDesc;
            }

            /**
             * Sets the value of the resourceDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResourceDesc(String value) {
                this.resourceDesc = value;
            }

            /**
             * Gets the value of the mimeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMimeType() {
                return mimeType;
            }

            /**
             * Sets the value of the mimeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMimeType(String value) {
                this.mimeType = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSize(BigInteger value) {
                this.size = value;
            }

            /**
             * Gets the value of the uri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUri() {
                return uri;
            }

            /**
             * Sets the value of the uri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUri(String value) {
                this.uri = value;
            }

            /**
             * Gets the value of the derefUri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDerefUri() {
                return derefUri;
            }

            /**
             * Sets the value of the derefUri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDerefUri(String value) {
                this.derefUri = value;
            }

            /**
             * Gets the value of the digest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDigest() {
                return digest;
            }

            /**
             * Sets the value of the digest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDigest(String value) {
                this.digest = value;
            }

        }

    }

}
