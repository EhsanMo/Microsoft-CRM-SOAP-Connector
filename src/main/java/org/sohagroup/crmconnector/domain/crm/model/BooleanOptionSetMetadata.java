
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BooleanOptionSetMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="BooleanOptionSetMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadataBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="FalseOption" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="TrueOption" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanOptionSetMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "falseOption",
    "trueOption"
})
public class BooleanOptionSetMetadata
    extends OptionSetMetadataBase {

    @XmlElement(name = "FalseOption", nillable = true)
    protected OptionMetadata falseOption;
    @XmlElement(name = "TrueOption", nillable = true)
    protected OptionMetadata trueOption;

    /**
     * Gets the value of the falseOption property.
     *
     * @return possible object is {@link OptionMetadata }
     */
    public OptionMetadata getFalseOption() {
        return falseOption;
    }

    /**
     * Sets the value of the falseOption property.
     *
     * @param value allowed object is {@link OptionMetadata }
     */
    public void setFalseOption(OptionMetadata value) {
        this.falseOption = value;
    }

    /**
     * Gets the value of the trueOption property.
     *
     * @return possible object is {@link OptionMetadata }
     */
    public OptionMetadata getTrueOption() {
        return trueOption;
    }

    /**
     * Sets the value of the trueOption property.
     *
     * @param value allowed object is {@link OptionMetadata }
     */
    public void setTrueOption(OptionMetadata value) {
        this.trueOption = value;
    }

}
