
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MemoAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MemoAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="Format" type="{http://schemas.microsoft.com/xrm/2011/Metadata}StringFormat"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ImeMode" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ImeMode"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsLocalizable" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "format",
    "imeMode",
    "maxLength",
    "isLocalizable"
})
public class MemoAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "Format", nillable = true)
    @XmlSchemaType(name = "string")
    protected StringFormat format;
    @XmlElement(name = "ImeMode", nillable = true)
    @XmlSchemaType(name = "string")
    protected ImeMode imeMode;
    @XmlElement(name = "MaxLength", nillable = true)
    protected Integer maxLength;
    @XmlElement(name = "IsLocalizable", nillable = true)
    protected Boolean isLocalizable;

    /**
     * Gets the value of the format property.
     *
     * @return possible object is {@link StringFormat }
     */
    public StringFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value allowed object is {@link StringFormat }
     */
    public void setFormat(StringFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the imeMode property.
     *
     * @return possible object is {@link ImeMode }
     */
    public ImeMode getImeMode() {
        return imeMode;
    }

    /**
     * Sets the value of the imeMode property.
     *
     * @param value allowed object is {@link ImeMode }
     */
    public void setImeMode(ImeMode value) {
        this.imeMode = value;
    }

    /**
     * Gets the value of the maxLength property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the isLocalizable property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsLocalizable() {
        return isLocalizable;
    }

    /**
     * Sets the value of the isLocalizable property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsLocalizable(Boolean value) {
        this.isLocalizable = value;
    }

}
