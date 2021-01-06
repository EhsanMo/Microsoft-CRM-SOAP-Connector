
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MetadataPropertiesExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MetadataPropertiesExpression"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="AllProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="PropertyNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataPropertiesExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", propOrder = {
    "allProperties",
    "propertyNames"
})
public class MetadataPropertiesExpression {

    @XmlElement(name = "AllProperties")
    protected Boolean allProperties;
    @XmlElement(name = "PropertyNames", nillable = true)
    protected ArrayOfstring propertyNames;

    /**
     * Gets the value of the allProperties property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAllProperties() {
        return allProperties;
    }

    /**
     * Sets the value of the allProperties property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAllProperties(Boolean value) {
        this.allProperties = value;
    }

    /**
     * Gets the value of the propertyNames property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getPropertyNames() {
        return propertyNames;
    }

    /**
     * Sets the value of the propertyNames property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setPropertyNames(ArrayOfstring value) {
        this.propertyNames = value;
    }

}
