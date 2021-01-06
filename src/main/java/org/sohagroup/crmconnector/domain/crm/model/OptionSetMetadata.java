
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OptionSetMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OptionSetMetadata"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadataBase"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="Options" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfOptionMetadata"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSetMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "options"
})
public class OptionSetMetadata
    extends OptionSetMetadataBase {

    @XmlElement(name = "Options", nillable = true)
    protected ArrayOfOptionMetadata options;

    /**
     * Gets the value of the options property.
     *
     * @return possible object is {@link ArrayOfOptionMetadata }
     */
    public ArrayOfOptionMetadata getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     *
     * @param value allowed object is {@link ArrayOfOptionMetadata }
     */
    public void setOptions(ArrayOfOptionMetadata value) {
        this.options = value;
    }

}
