
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DoubleAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="DoubleAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="ImeMode" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ImeMode"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}double"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}double"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "imeMode",
    "maxValue",
    "minValue",
    "precision"
})
public class DoubleAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "ImeMode", nillable = true)
    @XmlSchemaType(name = "string")
    protected ImeMode imeMode;
    @XmlElement(name = "MaxValue", nillable = true)
    protected Double maxValue;
    @XmlElement(name = "MinValue", nillable = true)
    protected Double minValue;
    @XmlElement(name = "Precision", nillable = true)
    protected Integer precision;

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
     * Gets the value of the maxValue property.
     *
     * @return possible object is {@link Double }
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     *
     * @return possible object is {@link Double }
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the precision property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

}
