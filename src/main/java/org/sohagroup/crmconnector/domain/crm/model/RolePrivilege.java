
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RolePrivilege complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RolePrivilege"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="BusinessUnitId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Depth" type="{http://schemas.microsoft.com/crm/2011/Contracts}PrivilegeDepth"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="PrivilegeId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePrivilege", propOrder = {
    "businessUnitId",
    "depth",
    "privilegeId"
})
public class RolePrivilege {

    @XmlElement(name = "BusinessUnitId")
    protected String businessUnitId;
    @XmlElement(name = "Depth")
    @XmlSchemaType(name = "string")
    protected PrivilegeDepth depth;
    @XmlElement(name = "PrivilegeId")
    protected String privilegeId;

    /**
     * Gets the value of the businessUnitId property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessUnitId(String value) {
        this.businessUnitId = value;
    }

    /**
     * Gets the value of the depth property.
     *
     * @return possible object is {@link PrivilegeDepth }
     */
    public PrivilegeDepth getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     *
     * @param value allowed object is {@link PrivilegeDepth }
     */
    public void setDepth(PrivilegeDepth value) {
        this.depth = value;
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

}
