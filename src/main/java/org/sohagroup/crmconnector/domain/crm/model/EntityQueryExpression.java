
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntityQueryExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="EntityQueryExpression"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryExpression"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="AttributeQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}AttributeQueryExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LabelQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}LabelQueryExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="RelationshipQuery" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}RelationshipQueryExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityQueryExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", propOrder = {
    "attributeQuery",
    "labelQuery",
    "relationshipQuery"
})
public class EntityQueryExpression
    extends MetadataQueryExpression {

    @XmlElement(name = "AttributeQuery", nillable = true)
    protected AttributeQueryExpression attributeQuery;
    @XmlElement(name = "LabelQuery", nillable = true)
    protected LabelQueryExpression labelQuery;
    @XmlElement(name = "RelationshipQuery", nillable = true)
    protected RelationshipQueryExpression relationshipQuery;

    /**
     * Gets the value of the attributeQuery property.
     *
     * @return possible object is {@link AttributeQueryExpression }
     */
    public AttributeQueryExpression getAttributeQuery() {
        return attributeQuery;
    }

    /**
     * Sets the value of the attributeQuery property.
     *
     * @param value allowed object is {@link AttributeQueryExpression }
     */
    public void setAttributeQuery(AttributeQueryExpression value) {
        this.attributeQuery = value;
    }

    /**
     * Gets the value of the labelQuery property.
     *
     * @return possible object is {@link LabelQueryExpression }
     */
    public LabelQueryExpression getLabelQuery() {
        return labelQuery;
    }

    /**
     * Sets the value of the labelQuery property.
     *
     * @param value allowed object is {@link LabelQueryExpression }
     */
    public void setLabelQuery(LabelQueryExpression value) {
        this.labelQuery = value;
    }

    /**
     * Gets the value of the relationshipQuery property.
     *
     * @return possible object is {@link RelationshipQueryExpression }
     */
    public RelationshipQueryExpression getRelationshipQuery() {
        return relationshipQuery;
    }

    /**
     * Sets the value of the relationshipQuery property.
     *
     * @param value allowed object is {@link RelationshipQueryExpression }
     */
    public void setRelationshipQuery(RelationshipQueryExpression value) {
        this.relationshipQuery = value;
    }

}
