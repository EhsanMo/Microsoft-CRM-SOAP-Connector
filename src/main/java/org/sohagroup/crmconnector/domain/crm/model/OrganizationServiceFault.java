
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganizationServiceFault complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OrganizationServiceFault"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Contracts}BaseServiceFault"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="InnerFault" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationServiceFault"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="TraceText" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceFault", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "innerFault",
    "traceText"
})
public class OrganizationServiceFault
    extends BaseServiceFault {

    @XmlElement(name = "InnerFault", nillable = true)
    protected OrganizationServiceFault innerFault;
    @XmlElement(name = "TraceText", nillable = true)
    protected String traceText;

    /**
     * Gets the value of the innerFault property.
     *
     * @return possible object is {@link OrganizationServiceFault }
     */
    public OrganizationServiceFault getInnerFault() {
        return innerFault;
    }

    /**
     * Sets the value of the innerFault property.
     *
     * @param value allowed object is {@link OrganizationServiceFault }
     */
    public void setInnerFault(OrganizationServiceFault value) {
        this.innerFault = value;
    }

    /**
     * Gets the value of the traceText property.
     *
     * @return possible object is {@link String }
     */
    public String getTraceText() {
        return traceText;
    }

    /**
     * Sets the value of the traceText property.
     *
     * @param value allowed object is {@link String }
     */
    public void setTraceText(String value) {
        this.traceText = value;
    }

}
