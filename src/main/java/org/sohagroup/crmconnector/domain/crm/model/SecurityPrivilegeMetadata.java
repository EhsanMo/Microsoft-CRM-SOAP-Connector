
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SecurityPrivilegeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="SecurityPrivilegeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="CanBeBasic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="CanBeDeep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="CanBeGlobal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="CanBeLocal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element name="Name"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="PrivilegeId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="PrivilegeType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}PrivilegeType" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPrivilegeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "canBeBasic",
    "canBeDeep",
    "canBeGlobal",
    "canBeLocal",
    "name",
    "privilegeId",
    "privilegeType"
})
public class SecurityPrivilegeMetadata {

    @XmlElement(name = "CanBeBasic")
    protected Boolean canBeBasic;
    @XmlElement(name = "CanBeDeep")
    protected Boolean canBeDeep;
    @XmlElement(name = "CanBeGlobal")
    protected Boolean canBeGlobal;
    @XmlElement(name = "CanBeLocal")
    protected Boolean canBeLocal;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "PrivilegeId")
    protected String privilegeId;
    @XmlElement(name = "PrivilegeType")
    @XmlSchemaType(name = "string")
    protected PrivilegeType privilegeType;

    /**
     * Gets the value of the canBeBasic property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCanBeBasic() {
        return canBeBasic;
    }

    /**
     * Sets the value of the canBeBasic property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCanBeBasic(Boolean value) {
        this.canBeBasic = value;
    }

    /**
     * Gets the value of the canBeDeep property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCanBeDeep() {
        return canBeDeep;
    }

    /**
     * Sets the value of the canBeDeep property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCanBeDeep(Boolean value) {
        this.canBeDeep = value;
    }

    /**
     * Gets the value of the canBeGlobal property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCanBeGlobal() {
        return canBeGlobal;
    }

    /**
     * Sets the value of the canBeGlobal property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCanBeGlobal(Boolean value) {
        this.canBeGlobal = value;
    }

    /**
     * Gets the value of the canBeLocal property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCanBeLocal() {
        return canBeLocal;
    }

    /**
     * Sets the value of the canBeLocal property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCanBeLocal(Boolean value) {
        this.canBeLocal = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the privilegeId property.
     *
     * @return possible object is {@link String }
     */
    public String getPrivilegeId() {
        return privilegeId;
    }

    /**
     * Sets the value of the privilegeId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPrivilegeId(String value) {
        this.privilegeId = value;
    }

    /**
     * Gets the value of the privilegeType property.
     *
     * @return possible object is {@link PrivilegeType }
     */
    public PrivilegeType getPrivilegeType() {
        return privilegeType;
    }

    /**
     * Sets the value of the privilegeType property.
     *
     * @param value allowed object is {@link PrivilegeType }
     */
    public void setPrivilegeType(PrivilegeType value) {
        this.privilegeType = value;
    }

}
