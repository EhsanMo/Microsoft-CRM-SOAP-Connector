
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExecuteMultipleSettings complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ExecuteMultipleSettings"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ContinueOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ReturnResponses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteMultipleSettings", namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", propOrder = {
    "continueOnError",
    "returnResponses"
})
public class ExecuteMultipleSettings {

    @XmlElement(name = "ContinueOnError")
    protected Boolean continueOnError;
    @XmlElement(name = "ReturnResponses")
    protected Boolean returnResponses;

    /**
     * Gets the value of the continueOnError property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isContinueOnError() {
        return continueOnError;
    }

    /**
     * Sets the value of the continueOnError property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    /**
     * Gets the value of the returnResponses property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isReturnResponses() {
        return returnResponses;
    }

    /**
     * Sets the value of the returnResponses property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setReturnResponses(Boolean value) {
        this.returnResponses = value;
    }

}
