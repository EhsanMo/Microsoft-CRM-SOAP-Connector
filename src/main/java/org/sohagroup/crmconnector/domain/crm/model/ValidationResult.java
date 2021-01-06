
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ValidationResult complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ValidationResult"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="ActivityId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="TraceInfo" type="{http://schemas.microsoft.com/crm/2011/Contracts}TraceInfo" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ValidationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult", propOrder = {
    "activityId",
    "traceInfo",
    "validationSuccess"
})
public class ValidationResult {

    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "TraceInfo", nillable = true)
    protected TraceInfo traceInfo;
    @XmlElement(name = "ValidationSuccess")
    protected Boolean validationSuccess;

    /**
     * Gets the value of the activityId property.
     *
     * @return possible object is {@link String }
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setActivityId(String value) {
        this.activityId = value;
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

    /**
     * Gets the value of the validationSuccess property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isValidationSuccess() {
        return validationSuccess;
    }

    /**
     * Sets the value of the validationSuccess property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setValidationSuccess(Boolean value) {
        this.validationSuccess = value;
    }

}
