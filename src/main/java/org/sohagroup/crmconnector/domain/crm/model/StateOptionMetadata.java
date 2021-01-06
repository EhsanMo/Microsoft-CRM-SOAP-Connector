
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StateOptionMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="StateOptionMetadata"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="DefaultStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="InvariantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateOptionMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "defaultStatus",
    "invariantName"
})
public class StateOptionMetadata
    extends OptionMetadata {

    @XmlElement(name = "DefaultStatus", nillable = true)
    protected Integer defaultStatus;
    @XmlElement(name = "InvariantName", nillable = true)
    protected String invariantName;

    /**
     * Gets the value of the defaultStatus property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Sets the value of the defaultStatus property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setDefaultStatus(Integer value) {
        this.defaultStatus = value;
    }

    /**
     * Gets the value of the invariantName property.
     *
     * @return possible object is {@link String }
     */
    public String getInvariantName() {
        return invariantName;
    }

    /**
     * Sets the value of the invariantName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setInvariantName(String value) {
        this.invariantName = value;
    }

}
