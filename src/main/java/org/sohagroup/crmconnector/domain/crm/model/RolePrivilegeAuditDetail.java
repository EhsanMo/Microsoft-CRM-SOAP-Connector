
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RolePrivilegeAuditDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RolePrivilegeAuditDetail"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="InvalidNewPrivileges" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="NewRolePrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfRolePrivilege"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="OldRolePrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfRolePrivilege"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePrivilegeAuditDetail", propOrder = {
    "invalidNewPrivileges",
    "newRolePrivileges",
    "oldRolePrivileges"
})
public class RolePrivilegeAuditDetail
    extends AuditDetail {

    @XmlElement(name = "InvalidNewPrivileges", nillable = true)
    protected ArrayOfguid invalidNewPrivileges;
    @XmlElement(name = "NewRolePrivileges", nillable = true)
    protected ArrayOfRolePrivilege newRolePrivileges;
    @XmlElement(name = "OldRolePrivileges", nillable = true)
    protected ArrayOfRolePrivilege oldRolePrivileges;

    /**
     * Gets the value of the invalidNewPrivileges property.
     *
     * @return possible object is {@link ArrayOfguid }
     */
    public ArrayOfguid getInvalidNewPrivileges() {
        return invalidNewPrivileges;
    }

    /**
     * Sets the value of the invalidNewPrivileges property.
     *
     * @param value allowed object is {@link ArrayOfguid }
     */
    public void setInvalidNewPrivileges(ArrayOfguid value) {
        this.invalidNewPrivileges = value;
    }

    /**
     * Gets the value of the newRolePrivileges property.
     *
     * @return possible object is {@link ArrayOfRolePrivilege }
     */
    public ArrayOfRolePrivilege getNewRolePrivileges() {
        return newRolePrivileges;
    }

    /**
     * Sets the value of the newRolePrivileges property.
     *
     * @param value allowed object is {@link ArrayOfRolePrivilege }
     */
    public void setNewRolePrivileges(ArrayOfRolePrivilege value) {
        this.newRolePrivileges = value;
    }

    /**
     * Gets the value of the oldRolePrivileges property.
     *
     * @return possible object is {@link ArrayOfRolePrivilege }
     */
    public ArrayOfRolePrivilege getOldRolePrivileges() {
        return oldRolePrivileges;
    }

    /**
     * Sets the value of the oldRolePrivileges property.
     *
     * @param value allowed object is {@link ArrayOfRolePrivilege }
     */
    public void setOldRolePrivileges(ArrayOfRolePrivilege value) {
        this.oldRolePrivileges = value;
    }

}
