
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrincipalAccess complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="PrincipalAccess"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="AccessMask"
 * type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Principal" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReference" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAccess", propOrder = {
    "accessMask",
    "principal"
})
public class PrincipalAccess {

    @XmlList
    @XmlElement(name = "AccessMask")
    protected List<String> accessMask;
    @XmlElement(name = "Principal", nillable = true)
    protected EntityReference principal;

    /**
     * Gets the value of the accessMask property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the accessMask property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getAccessMask().add(newItem); &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getAccessMask() {
        if (accessMask == null) {
            accessMask = new ArrayList<String>();
        }
        return this.accessMask;
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
