
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StatusOptionMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="StatusOptionMetadata"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="TransitionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOptionMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "state",
    "transitionData"
})
public class StatusOptionMetadata
    extends OptionMetadata {

    @XmlElement(name = "State", nillable = true)
    protected Integer state;
    @XmlElement(name = "TransitionData", nillable = true)
    protected String transitionData;

    /**
     * Gets the value of the state property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setState(Integer value) {
        this.state = value;
    }

    /**
     * Gets the value of the transitionData property.
     *
     * @return possible object is {@link String }
     */
    public String getTransitionData() {
        return transitionData;
    }

    /**
     * Sets the value of the transitionData property.
     *
     * @param value allowed object is {@link String }
     */
    public void setTransitionData(String value) {
        this.transitionData = value;
    }

}
