
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="query"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query"
})
@XmlRootElement(name = "RetrieveMultiple", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services")
public class RetrieveMultiple {

    @XmlElement(namespace = "http://schemas.microsoft.com/xrm/2011/Contracts/Services", nillable = true)
    protected QueryBase query;

    /**
     * Gets the value of the query property.
     *
     * @return possible object is {@link QueryBase }
     */
    public QueryBase getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     *
     * @param value allowed object is {@link QueryBase }
     */
    public void setQuery(QueryBase value) {
        this.query = value;
    }

}
