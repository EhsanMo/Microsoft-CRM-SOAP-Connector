
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SearchResults complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="SearchResults"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Proposals"
 * type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAppointmentProposal" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="TraceInfo" type="{http://schemas.microsoft.com/crm/2011/Contracts}TraceInfo"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = {
    "proposals",
    "traceInfo"
})
public class SearchResults {

    @XmlElement(name = "Proposals", nillable = true)
    protected ArrayOfAppointmentProposal proposals;
    @XmlElement(name = "TraceInfo", nillable = true)
    protected TraceInfo traceInfo;

    /**
     * Gets the value of the proposals property.
     *
     * @return possible object is {@link ArrayOfAppointmentProposal }
     */
    public ArrayOfAppointmentProposal getProposals() {
        return proposals;
    }

    /**
     * Sets the value of the proposals property.
     *
     * @param value allowed object is {@link ArrayOfAppointmentProposal }
     */
    public void setProposals(ArrayOfAppointmentProposal value) {
        this.proposals = value;
    }

    /**
     * Gets the value of the traceInfo property.
     *
     * @return possible object is {@link TraceInfo }
     */
    public TraceInfo getTraceInfo() {
        return traceInfo;
    }

    /**
     * Sets the value of the traceInfo property.
     *
     * @param value allowed object is {@link TraceInfo }
     */
    public void setTraceInfo(TraceInfo value) {
        this.traceInfo = value;
    }

}
