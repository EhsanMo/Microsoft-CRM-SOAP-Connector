
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FetchExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="FetchExpression"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "query"
})
public class FetchExpression
    extends QueryBase {

    @XmlElement(name = "Query", nillable = true)
    protected String query;

    /**
     * Gets the value of the query property.
     *
     * @return possible object is {@link String }
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     *
     * @param value allowed object is {@link String }
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
