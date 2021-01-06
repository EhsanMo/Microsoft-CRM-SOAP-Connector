
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QueryByEntityNameDictionary complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="QueryByEntityNameDictionary"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="KeyValuePairOfstringQueryBasegUGIFE1S" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringQueryBasegUGIFE1S"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryByEntityNameDictionary", propOrder = {
    "keyValuePairOfstringQueryBasegUGIFE1S"
})
public class QueryByEntityNameDictionary {

    @XmlElement(name = "KeyValuePairOfstringQueryBasegUGIFE1S")
    protected List<KeyValuePairOfstringQueryBasegUGIFE1S> keyValuePairOfstringQueryBasegUGIFE1S;

    /**
     * Gets the value of the keyValuePairOfstringQueryBasegUGIFE1S property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the keyValuePairOfstringQueryBasegUGIFE1S property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getKeyValuePairOfstringQueryBasegUGIFE1S().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link KeyValuePairOfstringQueryBasegUGIFE1S }
     */
    public List<KeyValuePairOfstringQueryBasegUGIFE1S> getKeyValuePairOfstringQueryBasegUGIFE1S() {
        if (keyValuePairOfstringQueryBasegUGIFE1S == null) {
            keyValuePairOfstringQueryBasegUGIFE1S = new ArrayList<KeyValuePairOfstringQueryBasegUGIFE1S>();
        }
        return this.keyValuePairOfstringQueryBasegUGIFE1S;
    }

}
