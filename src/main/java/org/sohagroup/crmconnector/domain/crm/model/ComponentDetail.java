
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ComponentDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ComponentDetail"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="DisplayName"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="Id"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ParentDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ParentId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ParentSchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentDetail", propOrder = {
    "displayName",
    "id",
    "parentDisplayName",
    "parentId",
    "parentSchemaName",
    "schemaName",
    "solution",
    "type"
})
public class ComponentDetail {

    @XmlElement(name = "DisplayName", nillable = true)
    protected String displayName;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ParentDisplayName", nillable = true)
    protected String parentDisplayName;
    @XmlElement(name = "ParentId")
    protected String parentId;
    @XmlElement(name = "ParentSchemaName", nillable = true)
    protected String parentSchemaName;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;
    @XmlElement(name = "Solution", nillable = true)
    protected String solution;
    @XmlElement(name = "Type")
    protected Integer type;

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the parentDisplayName property.
     *
     * @return possible object is {@link String }
     */
    public String getParentDisplayName() {
        return parentDisplayName;
    }

    /**
     * Sets the value of the parentDisplayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setParentDisplayName(String value) {
        this.parentDisplayName = value;
    }

    /**
     * Gets the value of the parentId property.
     *
     * @return possible object is {@link String }
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the parentSchemaName property.
     *
     * @return possible object is {@link String }
     */
    public String getParentSchemaName() {
        return parentSchemaName;
    }

    /**
     * Sets the value of the parentSchemaName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setParentSchemaName(String value) {
        this.parentSchemaName = value;
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
     * Gets the value of the solution property.
     *
     * @return possible object is {@link String }
     */
    public String getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSolution(String value) {
        this.solution = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
