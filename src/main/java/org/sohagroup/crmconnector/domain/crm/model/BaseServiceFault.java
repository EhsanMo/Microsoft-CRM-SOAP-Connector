
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for BaseServiceFault complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="BaseServiceFault"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="ErrorCode"
 * type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element name="ErrorDetails"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}ErrorDetailCollection" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceFault", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "errorCode",
    "errorDetails",
    "message",
    "timestamp"
})
@XmlSeeAlso({
    OrganizationServiceFault.class,
    DiscoveryServiceFault.class
})
public class BaseServiceFault {

    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElement(name = "ErrorDetails", nillable = true)
    protected ErrorDetailCollection errorDetails;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDetails property.
     *
     * @return possible object is {@link ErrorDetailCollection }
     */
    public ErrorDetailCollection getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     *
     * @param value allowed object is {@link ErrorDetailCollection }
     */
    public void setErrorDetails(ErrorDetailCollection value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
