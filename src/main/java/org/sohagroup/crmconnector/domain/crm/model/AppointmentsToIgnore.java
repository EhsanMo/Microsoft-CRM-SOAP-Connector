
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AppointmentsToIgnore complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AppointmentsToIgnore"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Appointments" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ResourceId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentsToIgnore", propOrder = {
    "appointments",
    "resourceId"
})
public class AppointmentsToIgnore {

    @XmlElement(name = "Appointments", nillable = true)
    protected ArrayOfguid appointments;
    @XmlElement(name = "ResourceId")
    protected String resourceId;

    /**
     * Gets the value of the appointments property.
     *
     * @return possible object is {@link ArrayOfguid }
     */
    public ArrayOfguid getAppointments() {
        return appointments;
    }

    /**
     * Sets the value of the appointments property.
     *
     * @param value allowed object is {@link ArrayOfguid }
     */
    public void setAppointments(ArrayOfguid value) {
        this.appointments = value;
    }

    /**
     * Gets the value of the resourceId property.
     *
     * @return possible object is {@link String }
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

}
