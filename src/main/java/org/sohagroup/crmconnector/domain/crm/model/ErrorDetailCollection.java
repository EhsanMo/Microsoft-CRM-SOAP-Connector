
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ErrorDetailCollection complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ErrorDetailCollection"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="KeyValuePairOfstringanyType" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringanyType"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetailCollection", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "keyValuePairOfstringanyType"
})
public class ErrorDetailCollection {

    @XmlElement(name = "KeyValuePairOfstringanyType")
    protected List<KeyValuePairOfstringanyType> keyValuePairOfstringanyType;

    /**
     * Gets the value of the keyValuePairOfstringanyType property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the keyValuePairOfstringanyType property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getKeyValuePairOfstringanyType().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link KeyValuePairOfstringanyType }
     */
    public List<KeyValuePairOfstringanyType> getKeyValuePairOfstringanyType() {
        if (keyValuePairOfstringanyType == null) {
            keyValuePairOfstringanyType = new ArrayList<KeyValuePairOfstringanyType>();
        }
        return this.keyValuePairOfstringanyType;
    }

}
