
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManyToManyRelationshipMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ManyToManyRelationshipMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}RelationshipMetadataBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="Entity1AssociatedMenuConfiguration"
 * type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuConfiguration" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Entity1IntersectAttribute" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Entity1LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Entity2AssociatedMenuConfiguration"
 * type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuConfiguration" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Entity2IntersectAttribute" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Entity2LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IntersectEntityName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManyToManyRelationshipMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "entity1AssociatedMenuConfiguration",
    "entity1IntersectAttribute",
    "entity1LogicalName",
    "entity2AssociatedMenuConfiguration",
    "entity2IntersectAttribute",
    "entity2LogicalName",
    "intersectEntityName"
})
public class ManyToManyRelationshipMetadata
    extends RelationshipMetadataBase {

    @XmlElement(name = "Entity1AssociatedMenuConfiguration", nillable = true)
    protected AssociatedMenuConfiguration entity1AssociatedMenuConfiguration;
    @XmlElement(name = "Entity1IntersectAttribute", nillable = true)
    protected String entity1IntersectAttribute;
    @XmlElement(name = "Entity1LogicalName", nillable = true)
    protected String entity1LogicalName;
    @XmlElement(name = "Entity2AssociatedMenuConfiguration", nillable = true)
    protected AssociatedMenuConfiguration entity2AssociatedMenuConfiguration;
    @XmlElement(name = "Entity2IntersectAttribute", nillable = true)
    protected String entity2IntersectAttribute;
    @XmlElement(name = "Entity2LogicalName", nillable = true)
    protected String entity2LogicalName;
    @XmlElement(name = "IntersectEntityName", nillable = true)
    protected String intersectEntityName;

    /**
     * Gets the value of the entity1AssociatedMenuConfiguration property.
     *
     * @return possible object is {@link AssociatedMenuConfiguration }
     */
    public AssociatedMenuConfiguration getEntity1AssociatedMenuConfiguration() {
        return entity1AssociatedMenuConfiguration;
    }

    /**
     * Sets the value of the entity1AssociatedMenuConfiguration property.
     *
     * @param value allowed object is {@link AssociatedMenuConfiguration }
     */
    public void setEntity1AssociatedMenuConfiguration(AssociatedMenuConfiguration value) {
        this.entity1AssociatedMenuConfiguration = value;
    }

    /**
     * Gets the value of the entity1IntersectAttribute property.
     *
     * @return possible object is {@link String }
     */
    public String getEntity1IntersectAttribute() {
        return entity1IntersectAttribute;
    }

    /**
     * Sets the value of the entity1IntersectAttribute property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntity1IntersectAttribute(String value) {
        this.entity1IntersectAttribute = value;
    }

    /**
     * Gets the value of the entity1LogicalName property.
     *
     * @return possible object is {@link String }
     */
    public String getEntity1LogicalName() {
        return entity1LogicalName;
    }

    /**
     * Sets the value of the entity1LogicalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntity1LogicalName(String value) {
        this.entity1LogicalName = value;
    }

    /**
     * Gets the value of the entity2AssociatedMenuConfiguration property.
     *
     * @return possible object is {@link AssociatedMenuConfiguration }
     */
    public AssociatedMenuConfiguration getEntity2AssociatedMenuConfiguration() {
        return entity2AssociatedMenuConfiguration;
    }

    /**
     * Sets the value of the entity2AssociatedMenuConfiguration property.
     *
     * @param value allowed object is {@link AssociatedMenuConfiguration }
     */
    public void setEntity2AssociatedMenuConfiguration(AssociatedMenuConfiguration value) {
        this.entity2AssociatedMenuConfiguration = value;
    }

    /**
     * Gets the value of the entity2IntersectAttribute property.
     *
     * @return possible object is {@link String }
     */
    public String getEntity2IntersectAttribute() {
        return entity2IntersectAttribute;
    }

    /**
     * Sets the value of the entity2IntersectAttribute property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntity2IntersectAttribute(String value) {
        this.entity2IntersectAttribute = value;
    }

    /**
     * Gets the value of the entity2LogicalName property.
     *
     * @return possible object is {@link String }
     */
    public String getEntity2LogicalName() {
        return entity2LogicalName;
    }

    /**
     * Sets the value of the entity2LogicalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntity2LogicalName(String value) {
        this.entity2LogicalName = value;
    }

    /**
     * Gets the value of the intersectEntityName property.
     *
     * @return possible object is {@link String }
     */
    public String getIntersectEntityName() {
        return intersectEntityName;
    }

    /**
     * Sets the value of the intersectEntityName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIntersectEntityName(String value) {
        this.intersectEntityName = value;
    }

}
