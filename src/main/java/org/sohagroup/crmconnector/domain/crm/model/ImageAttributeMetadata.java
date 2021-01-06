
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ImageAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ImageAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="IsPrimaryImage" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MaxHeight" type="{http://www.w3.org/2001/XMLSchema}short"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MaxWidth" type="{http://www.w3.org/2001/XMLSchema}short"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", propOrder = {
    "isPrimaryImage",
    "maxHeight",
    "maxWidth"
})
public class ImageAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "IsPrimaryImage", nillable = true)
    protected Boolean isPrimaryImage;
    @XmlElement(name = "MaxHeight", nillable = true)
    protected Short maxHeight;
    @XmlElement(name = "MaxWidth", nillable = true)
    protected Short maxWidth;

    /**
     * Gets the value of the isPrimaryImage property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsPrimaryImage() {
        return isPrimaryImage;
    }

    /**
     * Sets the value of the isPrimaryImage property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsPrimaryImage(Boolean value) {
        this.isPrimaryImage = value;
    }

    /**
     * Gets the value of the maxHeight property.
     *
     * @return possible object is {@link Short }
     */
    public Short getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     *
     * @param value allowed object is {@link Short }
     */
    public void setMaxHeight(Short value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the maxWidth property.
     *
     * @return possible object is {@link Short }
     */
    public Short getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     *
     * @param value allowed object is {@link Short }
     */
    public void setMaxWidth(Short value) {
        this.maxWidth = value;
    }

}
