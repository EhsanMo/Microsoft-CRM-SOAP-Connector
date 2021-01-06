
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Label complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="Label"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="LocalizedLabels" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LocalizedLabelCollection"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="UserLocalizedLabel" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LocalizedLabel"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "localizedLabels",
    "userLocalizedLabel"
})
public class Label {

    @XmlElement(name = "LocalizedLabels", nillable = true)
    protected LocalizedLabelCollection localizedLabels;
    @XmlElement(name = "UserLocalizedLabel", nillable = true)
    protected LocalizedLabel userLocalizedLabel;

    /**
     * Gets the value of the localizedLabels property.
     *
     * @return possible object is {@link LocalizedLabelCollection }
     */
    public LocalizedLabelCollection getLocalizedLabels() {
        return localizedLabels;
    }

    /**
     * Sets the value of the localizedLabels property.
     *
     * @param value allowed object is {@link LocalizedLabelCollection }
     */
    public void setLocalizedLabels(LocalizedLabelCollection value) {
        this.localizedLabels = value;
    }

    /**
     * Gets the value of the userLocalizedLabel property.
     *
     * @return possible object is {@link LocalizedLabel }
     */
    public LocalizedLabel getUserLocalizedLabel() {
        return userLocalizedLabel;
    }

    /**
     * Sets the value of the userLocalizedLabel property.
     *
     * @param value allowed object is {@link LocalizedLabel }
     */
    public void setUserLocalizedLabel(LocalizedLabel value) {
        this.userLocalizedLabel = value;
    }

}
