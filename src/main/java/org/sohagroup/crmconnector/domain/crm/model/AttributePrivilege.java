
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributePrivilege complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AttributePrivilege"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="AttributeId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element name="CanRead"
 * type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element name="CanUpdate"
 * type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributePrivilege", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "attributeId",
    "canCreate",
    "canRead",
    "canUpdate"
})
public class AttributePrivilege {

    @XmlElement(name = "AttributeId")
    protected String attributeId;
    @XmlElement(name = "CanCreate")
    protected Integer canCreate;
    @XmlElement(name = "CanRead")
    protected Integer canRead;
    @XmlElement(name = "CanUpdate")
    protected Integer canUpdate;

    /**
     * Gets the value of the attributeId property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the canCreate property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCanCreate() {
        return canCreate;
    }

    /**
     * Sets the value of the canCreate property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCanCreate(Integer value) {
        this.canCreate = value;
    }

    /**
     * Gets the value of the canRead property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCanRead() {
        return canRead;
    }

    /**
     * Sets the value of the canRead property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCanRead(Integer value) {
        this.canRead = value;
    }

    /**
     * Gets the value of the canUpdate property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCanUpdate(Integer value) {
        this.canUpdate = value;
    }

}
