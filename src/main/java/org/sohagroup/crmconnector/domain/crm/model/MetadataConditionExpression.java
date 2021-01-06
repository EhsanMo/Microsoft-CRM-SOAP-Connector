
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MetadataConditionExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MetadataConditionExpression"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ConditionOperator" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataConditionOperator"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConditionExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", propOrder = {
    "conditionOperator",
    "propertyName",
    "value"
})
public class MetadataConditionExpression {

    @XmlElement(name = "ConditionOperator")
    @XmlSchemaType(name = "string")
    protected MetadataConditionOperator conditionOperator;
    @XmlElement(name = "PropertyName", nillable = true)
    protected String propertyName;
    @XmlElement(name = "Value", nillable = true)
    protected Object value;

    /**
     * Gets the value of the conditionOperator property.
     *
     * @return possible object is {@link MetadataConditionOperator }
     */
    public MetadataConditionOperator getConditionOperator() {
        return conditionOperator;
    }

    /**
     * Sets the value of the conditionOperator property.
     *
     * @param value allowed object is {@link MetadataConditionOperator }
     */
    public void setConditionOperator(MetadataConditionOperator value) {
        this.conditionOperator = value;
    }

    /**
     * Gets the value of the propertyName property.
     *
     * @return possible object is {@link String }
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
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
