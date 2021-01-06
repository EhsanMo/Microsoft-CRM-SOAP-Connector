
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PagingInfo complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="PagingInfo"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="Count"
 * type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element name="PageNumber"
 * type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;element name="PagingCookie"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="ReturnTotalRecordCount"
 * type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingInfo", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "count",
    "pageNumber",
    "pagingCookie",
    "returnTotalRecordCount"
})
public class PagingInfo {

    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "PagingCookie", nillable = true)
    protected String pagingCookie;
    @XmlElement(name = "ReturnTotalRecordCount")
    protected Boolean returnTotalRecordCount;

    /**
     * Gets the value of the count property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the pageNumber property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pagingCookie property.
     *
     * @return possible object is {@link String }
     */
    public String getPagingCookie() {
        return pagingCookie;
    }

    /**
     * Sets the value of the pagingCookie property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPagingCookie(String value) {
        this.pagingCookie = value;
    }

    /**
     * Gets the value of the returnTotalRecordCount property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isReturnTotalRecordCount() {
        return returnTotalRecordCount;
    }

    /**
     * Sets the value of the returnTotalRecordCount property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setReturnTotalRecordCount(Boolean value) {
        this.returnTotalRecordCount = value;
    }

}
