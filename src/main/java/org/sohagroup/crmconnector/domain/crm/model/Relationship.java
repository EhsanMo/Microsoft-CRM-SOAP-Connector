
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Relationship complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="Relationship"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="PrimaryEntityRole" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityRole" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "primaryEntityRole",
    "schemaName"
})
public class Relationship {

    @XmlElement(name = "PrimaryEntityRole", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityRole primaryEntityRole;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;

    /**
     * Gets the value of the primaryEntityRole property.
     *
     * @return possible object is {@link EntityRole }
     */
    public EntityRole getPrimaryEntityRole() {
        return primaryEntityRole;
    }

    /**
     * Sets the value of the primaryEntityRole property.
     *
     * @param value allowed object is {@link EntityRole }
     */
    public void setPrimaryEntityRole(EntityRole value) {
        this.primaryEntityRole = value;
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

}
