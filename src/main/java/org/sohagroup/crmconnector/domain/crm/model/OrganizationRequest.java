
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganizationRequest complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OrganizationRequest"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Parameters"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}ParameterCollection" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="RequestId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="RequestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationRequest", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "parameters",
    "requestId",
    "requestName"
})
public class OrganizationRequest {

    @XmlElement(name = "Parameters", nillable = true)
    protected ParameterCollection parameters;
    @XmlElement(name = "RequestId", nillable = true)
    protected String requestId;
    @XmlElement(name = "RequestName", nillable = true)
    protected String requestName;

    /**
     * Gets the value of the parameters property.
     *
     * @return possible object is {@link ParameterCollection }
     */
    public ParameterCollection getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     *
     * @param value allowed object is {@link ParameterCollection }
     */
    public void setParameters(ParameterCollection value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the requestId property.
     *
     * @return possible object is {@link String }
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestName property.
     *
     * @return possible object is {@link String }
     */
    public String getRequestName() {
        return requestName;
    }

    /**
     * Sets the value of the requestName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRequestName(String value) {
        this.requestName = value;
    }

}
