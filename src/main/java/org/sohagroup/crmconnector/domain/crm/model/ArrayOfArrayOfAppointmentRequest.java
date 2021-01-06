
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ArrayOfArrayOfAppointmentRequest complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ArrayOfArrayOfAppointmentRequest"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ArrayOfAppointmentRequest" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAppointmentRequest"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfAppointmentRequest", propOrder = {
    "arrayOfAppointmentRequest"
})
public class ArrayOfArrayOfAppointmentRequest {

    @XmlElement(name = "ArrayOfAppointmentRequest", nillable = true)
    protected List<ArrayOfAppointmentRequest> arrayOfAppointmentRequest;

    /**
     * Gets the value of the arrayOfAppointmentRequest property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the arrayOfAppointmentRequest property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getArrayOfAppointmentRequest().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link ArrayOfAppointmentRequest }
     */
    public List<ArrayOfAppointmentRequest> getArrayOfAppointmentRequest() {
        if (arrayOfAppointmentRequest == null) {
            arrayOfAppointmentRequest = new ArrayList<ArrayOfAppointmentRequest>();
        }
        return this.arrayOfAppointmentRequest;
    }

}
