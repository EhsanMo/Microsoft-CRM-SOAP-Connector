
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="entityName"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="id"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="columnSet" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ColumnSet" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityName",
    "id",
    "columnSet"
})
@XmlRootElement(name = "Retrieve", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class Retrieve {

    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected String entityName;
    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
    protected String id;
    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected ColumnSet columnSet;

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

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the columnSet property.
     *
     * @return possible object is {@link ColumnSet }
     */
    public ColumnSet getColumnSet() {
        return columnSet;
    }

    /**
     * Sets the value of the columnSet property.
     *
     * @param value allowed object is {@link ColumnSet }
     */
    public void setColumnSet(ColumnSet value) {
        this.columnSet = value;
    }

}
