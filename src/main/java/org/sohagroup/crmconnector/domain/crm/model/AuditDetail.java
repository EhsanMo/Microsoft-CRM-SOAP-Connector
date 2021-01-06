
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuditDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AuditDetail"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="AuditRecord"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}Entity" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditDetail", propOrder = {
    "auditRecord"
})
@XmlSeeAlso({
    AttributeAuditDetail.class,
    ShareAuditDetail.class,
    RelationshipAuditDetail.class,
    RolePrivilegeAuditDetail.class,
    UserAccessAuditDetail.class
})
public class AuditDetail {

    @XmlElement(name = "AuditRecord", nillable = true)
    protected Entity auditRecord;

    /**
     * Gets the value of the auditRecord property.
     *
     * @return possible object is {@link Entity }
     */
    public Entity getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     *
     * @param value allowed object is {@link Entity }
     */
    public void setAuditRecord(Entity value) {
        this.auditRecord = value;
    }

}
