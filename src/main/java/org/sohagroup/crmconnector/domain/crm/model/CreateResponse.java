
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
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="CreateResult"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createResult"
})
@XmlRootElement(name = "CreateResponse", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class CreateResponse {

    @XmlElement(name = "CreateResult", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
    protected String createResult;

    /**
     * Gets the value of the createResult property.
     *
     * @return possible object is {@link String }
     */
    public String getCreateResult() {
        return createResult;
    }

    /**
     * Sets the value of the createResult property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCreateResult(String value) {
        this.createResult = value;
    }

}
