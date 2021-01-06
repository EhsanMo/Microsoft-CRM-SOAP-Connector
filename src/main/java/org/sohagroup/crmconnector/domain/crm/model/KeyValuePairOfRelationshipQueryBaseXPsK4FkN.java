
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for KeyValuePairOfRelationshipQueryBaseX_PsK4FkN complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="KeyValuePairOfRelationshipQueryBaseX_PsK4FkN"&amp;gt;
 * &amp;lt;complexContent&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="key" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Relationship"/&amp;gt;
 * &amp;lt;element name="value" type="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfRelationshipQueryBaseXPsK4FkN {

    @XmlElement(required = true, nillable = true)
    protected Relationship key;
    @XmlElement(required = true, nillable = true)
    protected QueryBase value;

    /**
     * Gets the value of the key property.
     *
     * @return possible object is {@link Relationship }
     */
    public Relationship getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     *
     * @param value allowed object is {@link Relationship }
     */
    public void setKey(Relationship value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link QueryBase }
     */
    public QueryBase getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link QueryBase }
     */
    public void setValue(QueryBase value) {
        this.value = value;
    }

}
