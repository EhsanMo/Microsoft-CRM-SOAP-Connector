
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF"&amp;gt;
 * &amp;lt;complexContent&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="key" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}DeletedMetadataFilters"/&amp;gt;
 * &amp;lt;element name="value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF {

    @XmlList
    @XmlElement(required = true)
    protected List<String> key;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfguid value;

    /**
     * Gets the value of the key property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the key property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getKey().add(newItem); &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getKey() {
        if (key == null) {
            key = new ArrayList<String>();
        }
        return this.key;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link ArrayOfguid }
     */
    public ArrayOfguid getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link ArrayOfguid }
     */
    public void setValue(ArrayOfguid value) {
        this.value = value;
    }

}
