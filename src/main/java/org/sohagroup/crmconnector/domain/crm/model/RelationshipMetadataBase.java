
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelationshipMetadataBase complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RelationshipMetadataBase"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="IsCustomRelationship" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsValidForAdvancedFind" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="SecurityTypes" type="{http://schemas.microsoft.com/xrm/2011/Metadata}SecurityTypes"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="RelationshipType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}RelationshipType"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipMetadataBase", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "isCustomRelationship",
    "isCustomizable",
    "isManaged",
    "isValidForAdvancedFind",
    "schemaName",
    "securityTypes",
    "introducedVersion",
    "relationshipType"
})
@XmlSeeAlso({
    OneToManyRelationshipMetadata.class,
    ManyToManyRelationshipMetadata.class
})
public class RelationshipMetadataBase
    extends MetadataBase {

    @XmlElement(name = "IsCustomRelationship", nillable = true)
    protected Boolean isCustomRelationship;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "IsValidForAdvancedFind", nillable = true)
    protected Boolean isValidForAdvancedFind;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;
    @XmlList
    @XmlElement(name = "SecurityTypes", nillable = true)
    protected List<String> securityTypes;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;
    @XmlElement(name = "RelationshipType")
    @XmlSchemaType(name = "string")
    protected RelationshipType relationshipType;

    /**
     * Gets the value of the isCustomRelationship property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsCustomRelationship() {
        return isCustomRelationship;
    }

    /**
     * Sets the value of the isCustomRelationship property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsCustomRelationship(Boolean value) {
        this.isCustomRelationship = value;
    }

    /**
     * Gets the value of the isCustomizable property.
     *
     * @return possible object is {@link BooleanManagedProperty }
     */
    public BooleanManagedProperty getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Sets the value of the isCustomizable property.
     *
     * @param value allowed object is {@link BooleanManagedProperty }
     */
    public void setIsCustomizable(BooleanManagedProperty value) {
        this.isCustomizable = value;
    }

    /**
     * Gets the value of the isManaged property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsManaged() {
        return isManaged;
    }

    /**
     * Sets the value of the isManaged property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsManaged(Boolean value) {
        this.isManaged = value;
    }

    /**
     * Gets the value of the isValidForAdvancedFind property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsValidForAdvancedFind() {
        return isValidForAdvancedFind;
    }

    /**
     * Sets the value of the isValidForAdvancedFind property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsValidForAdvancedFind(Boolean value) {
        this.isValidForAdvancedFind = value;
    }

    /**
     * Gets the value of the schemaName property.
     *
     * @return possible object is {@link String }
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the securityTypes property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the securityTypes property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getSecurityTypes().add(newItem); &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getSecurityTypes() {
        if (securityTypes == null) {
            securityTypes = new ArrayList<String>();
        }
        return this.securityTypes;
    }

    /**
     * Gets the value of the introducedVersion property.
     *
     * @return possible object is {@link String }
     */
    public String getIntroducedVersion() {
        return introducedVersion;
    }

    /**
     * Sets the value of the introducedVersion property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIntroducedVersion(String value) {
        this.introducedVersion = value;
    }

    /**
     * Gets the value of the relationshipType property.
     *
     * @return possible object is {@link RelationshipType }
     */
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     *
     * @param value allowed object is {@link RelationshipType }
     */
    public void setRelationshipType(RelationshipType value) {
        this.relationshipType = value;
    }

}
