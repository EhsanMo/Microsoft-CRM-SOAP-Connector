
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MetadataQueryExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MetadataQueryExpression"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="Criteria" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataFilterExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Properties" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataPropertiesExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataQueryExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", propOrder = {
    "criteria",
    "properties"
})
@XmlSeeAlso({
    RelationshipQueryExpression.class,
    EntityQueryExpression.class,
    AttributeQueryExpression.class
})
public class MetadataQueryExpression
    extends MetadataQueryBase {

    @XmlElement(name = "Criteria", nillable = true)
    protected MetadataFilterExpression criteria;
    @XmlElement(name = "Properties", nillable = true)
    protected MetadataPropertiesExpression properties;

    /**
     * Gets the value of the criteria property.
     *
     * @return possible object is {@link MetadataFilterExpression }
     */
    public MetadataFilterExpression getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     *
     * @param value allowed object is {@link MetadataFilterExpression }
     */
    public void setCriteria(MetadataFilterExpression value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return possible object is {@link MetadataPropertiesExpression }
     */
    public MetadataPropertiesExpression getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value allowed object is {@link MetadataPropertiesExpression }
     */
    public void setProperties(MetadataPropertiesExpression value) {
        this.properties = value;
    }

}
