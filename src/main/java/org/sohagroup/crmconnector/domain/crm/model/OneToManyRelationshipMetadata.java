
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OneToManyRelationshipMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OneToManyRelationshipMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}RelationshipMetadataBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="AssociatedMenuConfiguration" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuConfiguration"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="CascadeConfiguration" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeConfiguration"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsHierarchical" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ReferencedAttribute" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ReferencedEntity" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ReferencingAttribute" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ReferencingEntity" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneToManyRelationshipMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "associatedMenuConfiguration",
    "cascadeConfiguration",
    "isHierarchical",
    "referencedAttribute",
    "referencedEntity",
    "referencingAttribute",
    "referencingEntity"
})
public class OneToManyRelationshipMetadata
    extends RelationshipMetadataBase {

    @XmlElement(name = "AssociatedMenuConfiguration", nillable = true)
    protected AssociatedMenuConfiguration associatedMenuConfiguration;
    @XmlElement(name = "CascadeConfiguration", nillable = true)
    protected CascadeConfiguration cascadeConfiguration;
    @XmlElement(name = "IsHierarchical", nillable = true)
    protected Boolean isHierarchical;
    @XmlElement(name = "ReferencedAttribute", nillable = true)
    protected String referencedAttribute;
    @XmlElement(name = "ReferencedEntity", nillable = true)
    protected String referencedEntity;
    @XmlElement(name = "ReferencingAttribute", nillable = true)
    protected String referencingAttribute;
    @XmlElement(name = "ReferencingEntity", nillable = true)
    protected String referencingEntity;

    /**
     * Gets the value of the associatedMenuConfiguration property.
     *
     * @return possible object is {@link AssociatedMenuConfiguration }
     */
    public AssociatedMenuConfiguration getAssociatedMenuConfiguration() {
        return associatedMenuConfiguration;
    }

    /**
     * Sets the value of the associatedMenuConfiguration property.
     *
     * @param value allowed object is {@link AssociatedMenuConfiguration }
     */
    public void setAssociatedMenuConfiguration(AssociatedMenuConfiguration value) {
        this.associatedMenuConfiguration = value;
    }

    /**
     * Gets the value of the cascadeConfiguration property.
     *
     * @return possible object is {@link CascadeConfiguration }
     */
    public CascadeConfiguration getCascadeConfiguration() {
        return cascadeConfiguration;
    }

    /**
     * Sets the value of the cascadeConfiguration property.
     *
     * @param value allowed object is {@link CascadeConfiguration }
     */
    public void setCascadeConfiguration(CascadeConfiguration value) {
        this.cascadeConfiguration = value;
    }

    /**
     * Gets the value of the isHierarchical property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsHierarchical() {
        return isHierarchical;
    }

    /**
     * Sets the value of the isHierarchical property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsHierarchical(Boolean value) {
        this.isHierarchical = value;
    }

    /**
     * Gets the value of the referencedAttribute property.
     *
     * @return possible object is {@link String }
     */
    public String getReferencedAttribute() {
        return referencedAttribute;
    }

    /**
     * Sets the value of the referencedAttribute property.
     *
     * @param value allowed object is {@link String }
     */
    public void setReferencedAttribute(String value) {
        this.referencedAttribute = value;
    }

    /**
     * Gets the value of the referencedEntity property.
     *
     * @return possible object is {@link String }
     */
    public String getReferencedEntity() {
        return referencedEntity;
    }

    /**
     * Sets the value of the referencedEntity property.
     *
     * @param value allowed object is {@link String }
     */
    public void setReferencedEntity(String value) {
        this.referencedEntity = value;
    }

    /**
     * Gets the value of the referencingAttribute property.
     *
     * @return possible object is {@link String }
     */
    public String getReferencingAttribute() {
        return referencingAttribute;
    }

    /**
     * Sets the value of the referencingAttribute property.
     *
     * @param value allowed object is {@link String }
     */
    public void setReferencingAttribute(String value) {
        this.referencingAttribute = value;
    }

    /**
     * Gets the value of the referencingEntity property.
     *
     * @return possible object is {@link String }
     */
    public String getReferencingEntity() {
        return referencingEntity;
    }

    /**
     * Sets the value of the referencingEntity property.
     *
     * @param value allowed object is {@link String }
     */
    public void setReferencingEntity(String value) {
        this.referencingEntity = value;
    }

}
