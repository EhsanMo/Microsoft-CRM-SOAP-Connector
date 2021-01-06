
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AliasedValue complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AliasedValue"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="AttributeLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="EntityLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasedValue", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "attributeLogicalName",
    "entityLogicalName",
    "value"
})
public class AliasedValue {

    @XmlElement(name = "AttributeLogicalName", nillable = true)
    protected String attributeLogicalName;
    @XmlElement(name = "EntityLogicalName", nillable = true)
    protected String entityLogicalName;
    @XmlElement(name = "Value", nillable = true)
    protected Object value;

    /**
     * Gets the value of the attributeLogicalName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeLogicalName() {
        return attributeLogicalName;
    }

    /**
     * Sets the value of the attributeLogicalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeLogicalName(String value) {
        this.attributeLogicalName = value;
    }

    /**
     * Gets the value of the entityLogicalName property.
     *
     * @return possible object is {@link String }
     */
    public String getEntityLogicalName() {
        return entityLogicalName;
    }

    /**
     * Sets the value of the entityLogicalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntityLogicalName(String value) {
        this.entityLogicalName = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link Object }
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link Object }
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
