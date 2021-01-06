
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConditionExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ConditionExpression"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Operator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ConditionOperator" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Values" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "attributeName",
    "operator",
    "values",
    "entityName"
})
public class ConditionExpression {

    @XmlElement(name = "AttributeName", nillable = true)
    protected String attributeName;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected ConditionOperator operator;
    @XmlElement(name = "Values", nillable = true)
    protected ArrayOfanyType values;
    @XmlElement(name = "EntityName", nillable = true)
    protected String entityName;

    /**
     * Gets the value of the attributeName property.
     *
     * @return possible object is {@link String }
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is {@link ConditionOperator }
     */
    public ConditionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value allowed object is {@link ConditionOperator }
     */
    public void setOperator(ConditionOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the values property.
     *
     * @return possible object is {@link ArrayOfanyType }
     */
    public ArrayOfanyType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     *
     * @param value allowed object is {@link ArrayOfanyType }
     */
    public void setValues(ArrayOfanyType value) {
        this.values = value;
    }

    /**
     * Gets the value of the entityName property.
     *
     * @return possible object is {@link String }
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

}
