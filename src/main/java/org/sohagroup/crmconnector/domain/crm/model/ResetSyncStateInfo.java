
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ResetSyncStateInfo complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ResetSyncStateInfo"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="EntityIds"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetSyncStateInfo", propOrder = {
    "entityIds",
    "objectTypeCode"
})
public class ResetSyncStateInfo {

    @XmlElement(name = "EntityIds", nillable = true)
    protected ArrayOfguid entityIds;
    @XmlElement(name = "ObjectTypeCode")
    protected Integer objectTypeCode;

    /**
     * Gets the value of the entityIds property.
     *
     * @return possible object is {@link ArrayOfguid }
     */
    public ArrayOfguid getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the value of the entityIds property.
     *
     * @param value allowed object is {@link ArrayOfguid }
     */
    public void setEntityIds(ArrayOfguid value) {
        this.entityIds = value;
    }

    /**
     * Gets the value of the objectTypeCode property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getObjectTypeCode() {
        return objectTypeCode;
    }

    /**
     * Sets the value of the objectTypeCode property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setObjectTypeCode(Integer value) {
        this.objectTypeCode = value;
    }

}
