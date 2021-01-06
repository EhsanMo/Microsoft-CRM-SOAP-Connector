
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeMapping complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AttributeMapping"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="AllowedSyncDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="AttributeCrmDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="AttributeCrmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="AttributeExchangeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="AttributeExchangeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="AttributeMappingId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ComputedProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="DefaultSyncDirection" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EntityTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsComputed" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MappingName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="SyncDirection" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMapping", namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", propOrder = {
    "allowedSyncDirection",
    "attributeCrmDisplayName",
    "attributeCrmName",
    "attributeExchangeDisplayName",
    "attributeExchangeName",
    "attributeMappingId",
    "computedProperties",
    "defaultSyncDirection",
    "entityTypeCode",
    "isComputed",
    "mappingName",
    "syncDirection"
})
public class AttributeMapping {

    @XmlElement(name = "AllowedSyncDirection")
    protected Integer allowedSyncDirection;
    @XmlElement(name = "AttributeCrmDisplayName", nillable = true)
    protected String attributeCrmDisplayName;
    @XmlElement(name = "AttributeCrmName", nillable = true)
    protected String attributeCrmName;
    @XmlElement(name = "AttributeExchangeDisplayName", nillable = true)
    protected String attributeExchangeDisplayName;
    @XmlElement(name = "AttributeExchangeName", nillable = true)
    protected String attributeExchangeName;
    @XmlElement(name = "AttributeMappingId")
    protected String attributeMappingId;
    @XmlElement(name = "ComputedProperties", nillable = true)
    protected ArrayOfstring computedProperties;
    @XmlElement(name = "DefaultSyncDirection")
    protected Integer defaultSyncDirection;
    @XmlElement(name = "EntityTypeCode")
    protected Integer entityTypeCode;
    @XmlElement(name = "IsComputed")
    protected Boolean isComputed;
    @XmlElement(name = "MappingName", nillable = true)
    protected String mappingName;
    @XmlElement(name = "SyncDirection")
    protected Integer syncDirection;

    /**
     * Gets the value of the allowedSyncDirection property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getAllowedSyncDirection() {
        return allowedSyncDirection;
    }

    /**
     * Sets the value of the allowedSyncDirection property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setAllowedSyncDirection(Integer value) {
        this.allowedSyncDirection = value;
    }

    /**
     * Gets the value of the attributeCrmDisplayName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeCrmDisplayName() {
        return attributeCrmDisplayName;
    }

    /**
     * Sets the value of the attributeCrmDisplayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeCrmDisplayName(String value) {
        this.attributeCrmDisplayName = value;
    }

    /**
     * Gets the value of the attributeCrmName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeCrmName() {
        return attributeCrmName;
    }

    /**
     * Sets the value of the attributeCrmName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeCrmName(String value) {
        this.attributeCrmName = value;
    }

    /**
     * Gets the value of the attributeExchangeDisplayName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeExchangeDisplayName() {
        return attributeExchangeDisplayName;
    }

    /**
     * Sets the value of the attributeExchangeDisplayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeExchangeDisplayName(String value) {
        this.attributeExchangeDisplayName = value;
    }

    /**
     * Gets the value of the attributeExchangeName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeExchangeName() {
        return attributeExchangeName;
    }

    /**
     * Sets the value of the attributeExchangeName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeExchangeName(String value) {
        this.attributeExchangeName = value;
    }

    /**
     * Gets the value of the attributeMappingId property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeMappingId() {
        return attributeMappingId;
    }

    /**
     * Sets the value of the attributeMappingId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeMappingId(String value) {
        this.attributeMappingId = value;
    }

    /**
     * Gets the value of the computedProperties property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getComputedProperties() {
        return computedProperties;
    }

    /**
     * Sets the value of the computedProperties property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setComputedProperties(ArrayOfstring value) {
        this.computedProperties = value;
    }

    /**
     * Gets the value of the defaultSyncDirection property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getDefaultSyncDirection() {
        return defaultSyncDirection;
    }

    /**
     * Sets the value of the defaultSyncDirection property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setDefaultSyncDirection(Integer value) {
        this.defaultSyncDirection = value;
    }

    /**
     * Gets the value of the entityTypeCode property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getEntityTypeCode() {
        return entityTypeCode;
    }

    /**
     * Sets the value of the entityTypeCode property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setEntityTypeCode(Integer value) {
        this.entityTypeCode = value;
    }

    /**
     * Gets the value of the isComputed property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsComputed() {
        return isComputed;
    }

    /**
     * Sets the value of the isComputed property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsComputed(Boolean value) {
        this.isComputed = value;
    }

    /**
     * Gets the value of the mappingName property.
     *
     * @return possible object is {@link String }
     */
    public String getMappingName() {
        return mappingName;
    }

    /**
     * Sets the value of the mappingName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMappingName(String value) {
        this.mappingName = value;
    }

    /**
     * Gets the value of the syncDirection property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getSyncDirection() {
        return syncDirection;
    }

    /**
     * Sets the value of the syncDirection property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setSyncDirection(Integer value) {
        this.syncDirection = value;
    }

}
