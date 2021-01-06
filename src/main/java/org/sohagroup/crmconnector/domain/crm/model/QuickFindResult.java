
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QuickFindResult complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="QuickFindResult"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Data"
 * type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityCollection" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="QueryColumnSet" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickFindResult", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "data",
    "errorCode",
    "queryColumnSet"
})
public class QuickFindResult {

    @XmlElement(name = "Data", nillable = true)
    protected EntityCollection data;
    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElement(name = "QueryColumnSet", nillable = true)
    protected ArrayOfstring queryColumnSet;

    /**
     * Gets the value of the data property.
     *
     * @return possible object is {@link EntityCollection }
     */
    public EntityCollection getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value allowed object is {@link EntityCollection }
     */
    public void setData(EntityCollection value) {
        this.data = value;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the queryColumnSet property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getQueryColumnSet() {
        return queryColumnSet;
    }

    /**
     * Sets the value of the queryColumnSet property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setQueryColumnSet(ArrayOfstring value) {
        this.queryColumnSet = value;
    }

}
