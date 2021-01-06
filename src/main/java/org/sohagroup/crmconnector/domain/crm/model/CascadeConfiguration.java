
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CascadeConfiguration complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="CascadeConfiguration"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Assign" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Delete" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Merge" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Reparent" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Share" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Unshare" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CascadeConfiguration", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "assign",
    "delete",
    "merge",
    "reparent",
    "share",
    "unshare"
})
public class CascadeConfiguration {

    @XmlElement(name = "Assign", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType assign;
    @XmlElement(name = "Delete", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType delete;
    @XmlElement(name = "Merge", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType merge;
    @XmlElement(name = "Reparent", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType reparent;
    @XmlElement(name = "Share", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType share;
    @XmlElement(name = "Unshare", nillable = true)
    @XmlSchemaType(name = "string")
    protected CascadeType unshare;

    /**
     * Gets the value of the assign property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getAssign() {
        return assign;
    }

    /**
     * Sets the value of the assign property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setAssign(CascadeType value) {
        this.assign = value;
    }

    /**
     * Gets the value of the delete property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setDelete(CascadeType value) {
        this.delete = value;
    }

    /**
     * Gets the value of the merge property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getMerge() {
        return merge;
    }

    /**
     * Sets the value of the merge property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setMerge(CascadeType value) {
        this.merge = value;
    }

    /**
     * Gets the value of the reparent property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getReparent() {
        return reparent;
    }

    /**
     * Sets the value of the reparent property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setReparent(CascadeType value) {
        this.reparent = value;
    }

    /**
     * Gets the value of the share property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setShare(CascadeType value) {
        this.share = value;
    }

    /**
     * Gets the value of the unshare property.
     *
     * @return possible object is {@link CascadeType }
     */
    public CascadeType getUnshare() {
        return unshare;
    }

    /**
     * Sets the value of the unshare property.
     *
     * @param value allowed object is {@link CascadeType }
     */
    public void setUnshare(CascadeType value) {
        this.unshare = value;
    }

}
