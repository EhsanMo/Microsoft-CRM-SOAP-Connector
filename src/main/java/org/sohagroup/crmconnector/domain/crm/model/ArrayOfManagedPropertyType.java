
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ArrayOfManagedPropertyType complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ArrayOfManagedPropertyType"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ManagedPropertyType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ManagedPropertyType"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagedPropertyType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "managedPropertyType"
})
public class ArrayOfManagedPropertyType {

    @XmlElement(name = "ManagedPropertyType")
    @XmlSchemaType(name = "string")
    protected List<ManagedPropertyType> managedPropertyType;

    /**
     * Gets the value of the managedPropertyType property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the managedPropertyType property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getManagedPropertyType().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link ManagedPropertyType }
     */
    public List<ManagedPropertyType> getManagedPropertyType() {
        if (managedPropertyType == null) {
            managedPropertyType = new ArrayList<ManagedPropertyType>();
        }
        return this.managedPropertyType;
    }

}
