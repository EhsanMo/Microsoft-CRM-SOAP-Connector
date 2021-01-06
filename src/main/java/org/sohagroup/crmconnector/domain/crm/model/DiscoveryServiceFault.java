
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DiscoveryServiceFault complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="DiscoveryServiceFault"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Contracts}BaseServiceFault"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="InnerFault" type="{http://schemas.microsoft.com/xrm/2011/Contracts}DiscoveryServiceFault"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryServiceFault", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "innerFault"
})
public class DiscoveryServiceFault
    extends BaseServiceFault {

    @XmlElement(name = "InnerFault", nillable = true)
    protected DiscoveryServiceFault innerFault;

    /**
     * Gets the value of the innerFault property.
     *
     * @return possible object is {@link DiscoveryServiceFault }
     */
    public DiscoveryServiceFault getInnerFault() {
        return innerFault;
    }

    /**
     * Sets the value of the innerFault property.
     *
     * @param value allowed object is {@link DiscoveryServiceFault }
     */
    public void setInnerFault(DiscoveryServiceFault value) {
        this.innerFault = value;
    }

}
