
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganizationResponse complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OrganizationResponse"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ResponseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Results" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ParameterCollection" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationResponse", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "responseName",
    "results"
})
public class OrganizationResponse {

    @XmlElement(name = "ResponseName", nillable = true)
    protected String responseName;
    @XmlElement(name = "Results", nillable = true)
    protected ParameterCollection results;

    /**
     * Gets the value of the responseName property.
     *
     * @return possible object is {@link String }
     */
    public String getResponseName() {
        return responseName;
    }

    /**
     * Sets the value of the responseName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResponseName(String value) {
        this.responseName = value;
    }

    /**
     * Gets the value of the results property.
     *
     * @return possible object is {@link ParameterCollection }
     */
    public ParameterCollection getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     *
     * @param value allowed object is {@link ParameterCollection }
     */
    public void setResults(ParameterCollection value) {
        this.results = value;
    }

}
