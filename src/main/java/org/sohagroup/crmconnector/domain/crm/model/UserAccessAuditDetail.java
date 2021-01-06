
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for UserAccessAuditDetail complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="UserAccessAuditDetail"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="Interval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAccessAuditDetail", propOrder = {
    "accessTime",
    "interval"
})
public class UserAccessAuditDetail
    extends AuditDetail {

    @XmlElement(name = "AccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessTime;
    @XmlElement(name = "Interval")
    protected Integer interval;

    /**
     * Gets the value of the accessTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the value of the accessTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setAccessTime(XMLGregorianCalendar value) {
        this.accessTime = value;
    }

    /**
     * Gets the value of the interval property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setInterval(Integer value) {
        this.interval = value;
    }

}
