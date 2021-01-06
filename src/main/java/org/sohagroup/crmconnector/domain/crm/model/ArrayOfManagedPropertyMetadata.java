
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ArrayOfManagedPropertyMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ArrayOfManagedPropertyMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ManagedPropertyMetadata" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ManagedPropertyMetadata"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagedPropertyMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "managedPropertyMetadata"
})
public class ArrayOfManagedPropertyMetadata {

    @XmlElement(name = "ManagedPropertyMetadata", nillable = true)
    protected List<ManagedPropertyMetadata> managedPropertyMetadata;

    /**
     * Gets the value of the managedPropertyMetadata property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the managedPropertyMetadata property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getManagedPropertyMetadata().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link ManagedPropertyMetadata }
     */
    public List<ManagedPropertyMetadata> getManagedPropertyMetadata() {
        if (managedPropertyMetadata == null) {
            managedPropertyMetadata = new ArrayList<ManagedPropertyMetadata>();
        }
        return this.managedPropertyMetadata;
    }

}
