
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ExecuteResult" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationResponse"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "executeResult"
})
@XmlRootElement(name = "ExecuteResponse", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class ExecuteResponse {

    @XmlElement(name = "ExecuteResult", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected OrganizationResponse executeResult;

    /**
     * Gets the value of the executeResult property.
     *
     * @return possible object is {@link OrganizationResponse }
     */
    public OrganizationResponse getExecuteResult() {
        return executeResult;
    }

    /**
     * Sets the value of the executeResult property.
     *
     * @param value allowed object is {@link OrganizationResponse }
     */
    public void setExecuteResult(OrganizationResponse value) {
        this.executeResult = value;
    }

}
