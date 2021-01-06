
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
 * name="RetrieveMultipleResult" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityCollection"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveMultipleResult"
})
@XmlRootElement(name = "RetrieveMultipleResponse", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class RetrieveMultipleResponse {

    @XmlElement(name = "RetrieveMultipleResult", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected EntityCollection retrieveMultipleResult;

    /**
     * Gets the value of the retrieveMultipleResult property.
     *
     * @return possible object is {@link EntityCollection }
     */
    public EntityCollection getRetrieveMultipleResult() {
        return retrieveMultipleResult;
    }

    /**
     * Sets the value of the retrieveMultipleResult property.
     *
     * @param value allowed object is {@link EntityCollection }
     */
    public void setRetrieveMultipleResult(EntityCollection value) {
        this.retrieveMultipleResult = value;
    }

}
