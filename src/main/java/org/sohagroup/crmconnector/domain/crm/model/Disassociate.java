
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
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="entityId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="relationship" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Relationship" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="relatedEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReferenceCollection"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityName",
    "entityId",
    "relationship",
    "relatedEntities"
})
@XmlRootElement(name = "Disassociate", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class Disassociate {

    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected String entityName;
    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
    protected String entityId;
    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected Relationship relationship;
    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected EntityReferenceCollection relatedEntities;

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
     * Gets the value of the entityId property.
     *
     * @return possible object is {@link String }
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the relationship property.
     *
     * @return possible object is {@link Relationship }
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     *
     * @param value allowed object is {@link Relationship }
     */
    public void setRelationship(Relationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the relatedEntities property.
     *
     * @return possible object is {@link EntityReferenceCollection }
     */
    public EntityReferenceCollection getRelatedEntities() {
        return relatedEntities;
    }

    /**
     * Sets the value of the relatedEntities property.
     *
     * @param value allowed object is {@link EntityReferenceCollection }
     */
    public void setRelatedEntities(EntityReferenceCollection value) {
        this.relatedEntities = value;
    }

}
