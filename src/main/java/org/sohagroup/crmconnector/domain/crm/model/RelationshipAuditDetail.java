
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelationshipAuditDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RelationshipAuditDetail"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="TargetRecords" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfEntityReference"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipAuditDetail", propOrder = {
    "relationshipName",
    "targetRecords"
})
public class RelationshipAuditDetail
    extends AuditDetail {

    @XmlElement(name = "RelationshipName", nillable = true)
    protected String relationshipName;
    @XmlElement(name = "TargetRecords", nillable = true)
    protected ArrayOfEntityReference targetRecords;

    /**
     * Gets the value of the relationshipName property.
     *
     * @return possible object is {@link String }
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the targetRecords property.
     *
     * @return possible object is {@link ArrayOfEntityReference }
     */
    public ArrayOfEntityReference getTargetRecords() {
        return targetRecords;
    }

    /**
     * Sets the value of the targetRecords property.
     *
     * @param value allowed object is {@link ArrayOfEntityReference }
     */
    public void setTargetRecords(ArrayOfEntityReference value) {
        this.targetRecords = value;
    }

}
