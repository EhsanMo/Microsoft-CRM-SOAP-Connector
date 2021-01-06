
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ShareAuditDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ShareAuditDetail"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="NewPrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OldPrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Principal" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReference"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareAuditDetail", propOrder = {
    "newPrivileges",
    "oldPrivileges",
    "principal"
})
public class ShareAuditDetail
    extends AuditDetail {

    @XmlList
    @XmlElement(name = "NewPrivileges")
    protected List<String> newPrivileges;
    @XmlList
    @XmlElement(name = "OldPrivileges")
    protected List<String> oldPrivileges;
    @XmlElement(name = "Principal", nillable = true)
    protected EntityReference principal;

    /**
     * Gets the value of the newPrivileges property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the newPrivileges property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getNewPrivileges().add(newItem); &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getNewPrivileges() {
        if (newPrivileges == null) {
            newPrivileges = new ArrayList<String>();
        }
        return this.newPrivileges;
    }

    /**
     * Gets the value of the oldPrivileges property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the oldPrivileges property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getOldPrivileges().add(newItem); &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getOldPrivileges() {
        if (oldPrivileges == null) {
            oldPrivileges = new ArrayList<String>();
        }
        return this.oldPrivileges;
    }

    /**
     * Gets the value of the principal property.
     *
     * @return possible object is {@link EntityReference }
     */
    public EntityReference getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     *
     * @param value allowed object is {@link EntityReference }
     */
    public void setPrincipal(EntityReference value) {
        this.principal = value;
    }

}
