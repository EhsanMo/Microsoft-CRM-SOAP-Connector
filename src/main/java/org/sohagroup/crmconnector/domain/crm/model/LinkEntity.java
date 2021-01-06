
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LinkEntity complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="LinkEntity"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Columns"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}ColumnSet" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="EntityAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="JoinOperator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}JoinOperator" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="LinkCriteria" type="{http://schemas.microsoft.com/xrm/2011/Contracts}FilterExpression"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LinkEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfLinkEntity"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LinkFromAttributeName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LinkFromEntityName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LinkToAttributeName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LinkToEntityName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkEntity", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "columns",
    "entityAlias",
    "joinOperator",
    "linkCriteria",
    "linkEntities",
    "linkFromAttributeName",
    "linkFromEntityName",
    "linkToAttributeName",
    "linkToEntityName"
})
public class LinkEntity {

    @XmlElement(name = "Columns", nillable = true)
    protected ColumnSet columns;
    @XmlElement(name = "EntityAlias", nillable = true)
    protected String entityAlias;
    @XmlElement(name = "JoinOperator")
    @XmlSchemaType(name = "string")
    protected JoinOperator joinOperator;
    @XmlElement(name = "LinkCriteria", nillable = true)
    protected FilterExpression linkCriteria;
    @XmlElement(name = "LinkEntities", nillable = true)
    protected ArrayOfLinkEntity linkEntities;
    @XmlElement(name = "LinkFromAttributeName", nillable = true)
    protected String linkFromAttributeName;
    @XmlElement(name = "LinkFromEntityName", nillable = true)
    protected String linkFromEntityName;
    @XmlElement(name = "LinkToAttributeName", nillable = true)
    protected String linkToAttributeName;
    @XmlElement(name = "LinkToEntityName", nillable = true)
    protected String linkToEntityName;

    /**
     * Gets the value of the columns property.
     *
     * @return possible object is {@link ColumnSet }
     */
    public ColumnSet getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     *
     * @param value allowed object is {@link ColumnSet }
     */
    public void setColumns(ColumnSet value) {
        this.columns = value;
    }

    /**
     * Gets the value of the entityAlias property.
     *
     * @return possible object is {@link String }
     */
    public String getEntityAlias() {
        return entityAlias;
    }

    /**
     * Sets the value of the entityAlias property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntityAlias(String value) {
        this.entityAlias = value;
    }

    /**
     * Gets the value of the joinOperator property.
     *
     * @return possible object is {@link JoinOperator }
     */
    public JoinOperator getJoinOperator() {
        return joinOperator;
    }

    /**
     * Sets the value of the joinOperator property.
     *
     * @param value allowed object is {@link JoinOperator }
     */
    public void setJoinOperator(JoinOperator value) {
        this.joinOperator = value;
    }

    /**
     * Gets the value of the linkCriteria property.
     *
     * @return possible object is {@link FilterExpression }
     */
    public FilterExpression getLinkCriteria() {
        return linkCriteria;
    }

    /**
     * Sets the value of the linkCriteria property.
     *
     * @param value allowed object is {@link FilterExpression }
     */
    public void setLinkCriteria(FilterExpression value) {
        this.linkCriteria = value;
    }

    /**
     * Gets the value of the linkEntities property.
     *
     * @return possible object is {@link ArrayOfLinkEntity }
     */
    public ArrayOfLinkEntity getLinkEntities() {
        return linkEntities;
    }

    /**
     * Sets the value of the linkEntities property.
     *
     * @param value allowed object is {@link ArrayOfLinkEntity }
     */
    public void setLinkEntities(ArrayOfLinkEntity value) {
        this.linkEntities = value;
    }

    /**
     * Gets the value of the linkFromAttributeName property.
     *
     * @return possible object is {@link String }
     */
    public String getLinkFromAttributeName() {
        return linkFromAttributeName;
    }

    /**
     * Sets the value of the linkFromAttributeName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLinkFromAttributeName(String value) {
        this.linkFromAttributeName = value;
    }

    /**
     * Gets the value of the linkFromEntityName property.
     *
     * @return possible object is {@link String }
     */
    public String getLinkFromEntityName() {
        return linkFromEntityName;
    }

    /**
     * Sets the value of the linkFromEntityName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLinkFromEntityName(String value) {
        this.linkFromEntityName = value;
    }

    /**
     * Gets the value of the linkToAttributeName property.
     *
     * @return possible object is {@link String }
     */
    public String getLinkToAttributeName() {
        return linkToAttributeName;
    }

    /**
     * Sets the value of the linkToAttributeName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLinkToAttributeName(String value) {
        this.linkToAttributeName = value;
    }

    /**
     * Gets the value of the linkToEntityName property.
     *
     * @return possible object is {@link String }
     */
    public String getLinkToEntityName() {
        return linkToEntityName;
    }

    /**
     * Sets the value of the linkToEntityName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLinkToEntityName(String value) {
        this.linkToEntityName = value;
    }

}
