
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FilterExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="FilterExpression"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Conditions"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfConditionExpression" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FilterOperator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LogicalOperator"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Filters" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfFilterExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsQuickFindFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "conditions",
    "filterOperator",
    "filters",
    "isQuickFindFilter"
})
public class FilterExpression {

    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfConditionExpression conditions;
    @XmlElement(name = "FilterOperator")
    @XmlSchemaType(name = "string")
    protected LogicalOperator filterOperator;
    @XmlElement(name = "Filters", nillable = true)
    protected ArrayOfFilterExpression filters;
    @XmlElement(name = "IsQuickFindFilter")
    protected Boolean isQuickFindFilter;

    /**
     * Gets the value of the conditions property.
     *
     * @return possible object is {@link ArrayOfConditionExpression }
     */
    public ArrayOfConditionExpression getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     *
     * @param value allowed object is {@link ArrayOfConditionExpression }
     */
    public void setConditions(ArrayOfConditionExpression value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the filterOperator property.
     *
     * @return possible object is {@link LogicalOperator }
     */
    public LogicalOperator getFilterOperator() {
        return filterOperator;
    }

    /**
     * Sets the value of the filterOperator property.
     *
     * @param value allowed object is {@link LogicalOperator }
     */
    public void setFilterOperator(LogicalOperator value) {
        this.filterOperator = value;
    }

    /**
     * Gets the value of the filters property.
     *
     * @return possible object is {@link ArrayOfFilterExpression }
     */
    public ArrayOfFilterExpression getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     *
     * @param value allowed object is {@link ArrayOfFilterExpression }
     */
    public void setFilters(ArrayOfFilterExpression value) {
        this.filters = value;
    }

    /**
     * Gets the value of the isQuickFindFilter property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsQuickFindFilter() {
        return isQuickFindFilter;
    }

    /**
     * Sets the value of the isQuickFindFilter property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsQuickFindFilter(Boolean value) {
        this.isQuickFindFilter = value;
    }

}
