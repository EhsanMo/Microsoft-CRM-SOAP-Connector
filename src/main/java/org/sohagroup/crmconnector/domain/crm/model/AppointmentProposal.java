
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for AppointmentProposal complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AppointmentProposal"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="End"
 * type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt; &amp;lt;element name="ProposalParties"
 * type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfProposalParty" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="SiteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="Start"
 * type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentProposal", propOrder = {
    "end",
    "proposalParties",
    "siteId",
    "siteName",
    "start"
})
public class AppointmentProposal {

    @XmlElement(name = "End", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "ProposalParties", nillable = true)
    protected ArrayOfProposalParty proposalParties;
    @XmlElement(name = "SiteId")
    protected String siteId;
    @XmlElement(name = "SiteName", nillable = true)
    protected String siteName;
    @XmlElement(name = "Start", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;

    /**
     * Gets the value of the end property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the proposalParties property.
     *
     * @return possible object is {@link ArrayOfProposalParty }
     */
    public ArrayOfProposalParty getProposalParties() {
        return proposalParties;
    }

    /**
     * Sets the value of the proposalParties property.
     *
     * @param value allowed object is {@link ArrayOfProposalParty }
     */
    public void setProposalParties(ArrayOfProposalParty value) {
        this.proposalParties = value;
    }

    /**
     * Gets the value of the siteId property.
     *
     * @return possible object is {@link String }
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the siteName property.
     *
     * @return possible object is {@link String }
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the start property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

}
