
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ObjectiveRelation complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ObjectiveRelation"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ObjectiveExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ResourceSpecId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectiveRelation", propOrder = {
    "objectiveExpression",
    "resourceSpecId"
})
public class ObjectiveRelation {

    @XmlElement(name = "ObjectiveExpression", nillable = true)
    protected String objectiveExpression;
    @XmlElement(name = "ResourceSpecId")
    protected String resourceSpecId;

    /**
     * Gets the value of the objectiveExpression property.
     *
     * @return possible object is {@link String }
     */
    public String getObjectiveExpression() {
        return objectiveExpression;
    }

    /**
     * Sets the value of the objectiveExpression property.
     *
     * @param value allowed object is {@link String }
     */
    public void setObjectiveExpression(String value) {
        this.objectiveExpression = value;
    }

    /**
     * Gets the value of the resourceSpecId property.
     *
     * @return possible object is {@link String }
     */
    public String getResourceSpecId() {
        return resourceSpecId;
    }

    /**
     * Sets the value of the resourceSpecId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResourceSpecId(String value) {
        this.resourceSpecId = value;
    }

}
