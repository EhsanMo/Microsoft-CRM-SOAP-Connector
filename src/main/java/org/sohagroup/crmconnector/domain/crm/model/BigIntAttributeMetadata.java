
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BigIntAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="BigIntAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}long"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}long"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BigIntAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "maxValue",
    "minValue"
})
public class BigIntAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "MaxValue", nillable = true)
    protected Long maxValue;
    @XmlElement(name = "MinValue", nillable = true)
    protected Long minValue;

    /**
     * Gets the value of the maxValue property.
     *
     * @return possible object is {@link Long }
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setMaxValue(Long value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     *
     * @return possible object is {@link Long }
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     *
     * @param value allowed object is {@link Long }
     */
    public void setMinValue(Long value) {
        this.minValue = value;
    }

}
