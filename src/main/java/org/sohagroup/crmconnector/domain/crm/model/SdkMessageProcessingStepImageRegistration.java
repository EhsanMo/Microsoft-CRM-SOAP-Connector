
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SdkMessageProcessingStepImageRegistration complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="SdkMessageProcessingStepImageRegistration"&amp;gt;
 * &amp;lt;complexContent&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="Attributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EntityAlias" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ImageType" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MessagePropertyName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdkMessageProcessingStepImageRegistration", propOrder = {
    "attributes",
    "entityAlias",
    "imageType",
    "messagePropertyName"
})
public class SdkMessageProcessingStepImageRegistration {

    @XmlElement(name = "Attributes", nillable = true)
    protected ArrayOfstring attributes;
    @XmlElement(name = "EntityAlias", nillable = true)
    protected String entityAlias;
    @XmlElement(name = "ImageType")
    protected Integer imageType;
    @XmlElement(name = "MessagePropertyName", nillable = true)
    protected String messagePropertyName;

    /**
     * Gets the value of the attributes property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setAttributes(ArrayOfstring value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the entityAlias property.
     *
     * @return possible object is {@link String }
     */
    public String getEntityAlias() {
        return entityAlias;
    }

    /**
     * Sets the value of the entityAlias property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntityAlias(String value) {
        this.entityAlias = value;
    }

    /**
     * Gets the value of the imageType property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setImageType(Integer value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the messagePropertyName property.
     *
     * @return possible object is {@link String }
     */
    public String getMessagePropertyName() {
        return messagePropertyName;
    }

    /**
     * Sets the value of the messagePropertyName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMessagePropertyName(String value) {
        this.messagePropertyName = value;
    }

}
