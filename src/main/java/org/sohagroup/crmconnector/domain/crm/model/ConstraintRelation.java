
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConstraintRelation complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ConstraintRelation"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ConstraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Constraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ObjectId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintRelation", propOrder = {
    "constraintType",
    "constraints",
    "objectId"
})
public class ConstraintRelation {

    @XmlElement(name = "ConstraintType", nillable = true)
    protected String constraintType;
    @XmlElement(name = "Constraints", nillable = true)
    protected String constraints;
    @XmlElement(name = "ObjectId")
    protected String objectId;

    /**
     * Gets the value of the constraintType property.
     *
     * @return possible object is {@link String }
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setConstraintType(String value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the constraints property.
     *
     * @return possible object is {@link String }
     */
    public String getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     *
     * @param value allowed object is {@link String }
     */
    public void setConstraints(String value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the objectId property.
     *
     * @return possible object is {@link String }
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

}
