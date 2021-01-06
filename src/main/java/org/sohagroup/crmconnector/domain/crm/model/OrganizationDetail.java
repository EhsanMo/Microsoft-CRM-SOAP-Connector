
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganizationDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OrganizationDetail"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Endpoints"
 * type="{http://schemas.microsoft.com/xrm/2014/Contracts}EndpointCollection" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="OrganizationId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OrganizationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="State" type="{http://schemas.microsoft.com/xrm/2014/Contracts}OrganizationState"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="UrlName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetail", namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", propOrder = {
    "endpoints",
    "friendlyName",
    "organizationId",
    "organizationVersion",
    "state",
    "uniqueName",
    "urlName"
})
public class OrganizationDetail {

    @XmlElement(name = "Endpoints", nillable = true)
    protected EndpointCollection endpoints;
    @XmlElement(name = "FriendlyName", nillable = true)
    protected String friendlyName;
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "OrganizationVersion", nillable = true)
    protected String organizationVersion;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected OrganizationState state;
    @XmlElement(name = "UniqueName", nillable = true)
    protected String uniqueName;
    @XmlElement(name = "UrlName", nillable = true)
    protected String urlName;

    /**
     * Gets the value of the endpoints property.
     *
     * @return possible object is {@link EndpointCollection }
     */
    public EndpointCollection getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     *
     * @param value allowed object is {@link EndpointCollection }
     */
    public void setEndpoints(EndpointCollection value) {
        this.endpoints = value;
    }

    /**
     * Gets the value of the friendlyName property.
     *
     * @return possible object is {@link String }
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the organizationId property.
     *
     * @return possible object is {@link String }
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationVersion property.
     *
     * @return possible object is {@link String }
     */
    public String getOrganizationVersion() {
        return organizationVersion;
    }

    /**
     * Sets the value of the organizationVersion property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOrganizationVersion(String value) {
        this.organizationVersion = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is {@link OrganizationState }
     */
    public OrganizationState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is {@link OrganizationState }
     */
    public void setState(OrganizationState value) {
        this.state = value;
    }

    /**
     * Gets the value of the uniqueName property.
     *
     * @return possible object is {@link String }
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * Sets the value of the uniqueName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setUniqueName(String value) {
        this.uniqueName = value;
    }

    /**
     * Gets the value of the urlName property.
     *
     * @return possible object is {@link String }
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * Sets the value of the urlName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setUrlName(String value) {
        this.urlName = value;
    }

}
