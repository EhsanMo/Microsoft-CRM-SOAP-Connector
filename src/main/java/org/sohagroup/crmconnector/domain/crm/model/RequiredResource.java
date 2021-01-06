
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RequiredResource complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RequiredResource"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="ResourceId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ResourceSpecId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredResource", propOrder = {
    "resourceId",
    "resourceSpecId"
})
public class RequiredResource {

    @XmlElement(name = "ResourceId")
    protected String resourceId;
    @XmlElement(name = "ResourceSpecId")
    protected String resourceSpecId;

    /**
     * Gets the value of the resourceId property.
     *
     * @return possible object is {@link String }
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceSpecId property.
     *
     * @return possible object is {@link String }
     */
    public String getResourceSpecId() {
        return resourceSpecId;
    }

    /**
     * Sets the value of the resourceSpecId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResourceSpecId(String value) {
        this.resourceSpecId = value;
    }

}
