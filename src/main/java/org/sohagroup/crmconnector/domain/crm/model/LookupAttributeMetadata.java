
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LookupAttributeMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="LookupAttributeMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="Targets" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupAttributeMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "targets"
})
public class LookupAttributeMetadata
    extends AttributeMetadata {

    @XmlElement(name = "Targets", nillable = true)
    protected ArrayOfstring targets;

    /**
     * Gets the value of the targets property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setTargets(ArrayOfstring value) {
        this.targets = value;
    }

}
