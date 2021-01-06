
package org.sohagroup.crmconnector.domain.crm.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelatedEntityCollection complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="RelatedEntityCollection"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN"
 * maxOccurs="unbounded" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedEntityCollection", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "keyValuePairOfRelationshipEntityCollectionXPsK4FkN"
})
public class RelatedEntityCollection {

    @XmlElement(name = "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN")
    protected List<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN> keyValuePairOfRelationshipEntityCollectionXPsK4FkN;

    /**
     * Gets the value of the keyValuePairOfRelationshipEntityCollectionXPsK4FkN property.
     * <p>
     * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
     * make to the returned list will be present inside the JAXB object. This is why there is not a
     * &lt;CODE&gt;set&lt;/CODE&gt; method for the keyValuePairOfRelationshipEntityCollectionXPsK4FkN property.
     * <p>
     * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getKeyValuePairOfRelationshipEntityCollectionXPsK4FkN().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link KeyValuePairOfRelationshipEntityCollectionXPsK4FkN
     * }
     */
    public List<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN> getKeyValuePairOfRelationshipEntityCollectionXPsK4FkN() {
        if (keyValuePairOfRelationshipEntityCollectionXPsK4FkN == null) {
            keyValuePairOfRelationshipEntityCollectionXPsK4FkN = new ArrayList<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN>();
        }
        return this.keyValuePairOfRelationshipEntityCollectionXPsK4FkN;
    }

}
