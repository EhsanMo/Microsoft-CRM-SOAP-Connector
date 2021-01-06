
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EnumAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="EnumAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="DefaultFormValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OptionSet" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadata"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "defaultFormValue",
    "optionSet"
})
@XmlSeeAlso({
    PicklistAttributeMetadata.class,
    EntityNameAttributeMetadata.class,
    StateAttributeMetadata.class,
    StatusAttributeMetadata.class
})
public class EnumAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "DefaultFormValue", nillable = true)
    protected Integer defaultFormValue;
    @XmlElement(name = "OptionSet", nillable = true)
    protected OptionSetMetadata optionSet;

    /**
     * Gets the value of the defaultFormValue property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getDefaultFormValue() {
        return defaultFormValue;
    }

    /**
     * Sets the value of the defaultFormValue property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setDefaultFormValue(Integer value) {
        this.defaultFormValue = value;
    }

    /**
     * Gets the value of the optionSet property.
     *
     * @return possible object is {@link OptionSetMetadata }
     */
    public OptionSetMetadata getOptionSet() {
        return optionSet;
    }

    /**
     * Sets the value of the optionSet property.
     *
     * @param value allowed object is {@link OptionSetMetadata }
     */
    public void setOptionSet(OptionSetMetadata value) {
        this.optionSet = value;
    }

}
