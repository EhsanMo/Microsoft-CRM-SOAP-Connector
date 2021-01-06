
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TraceInfo complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="TraceInfo"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="ErrorInfoList" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfErrorInfo" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceInfo", propOrder = {
    "errorInfoList"
})
public class TraceInfo {

    @XmlElement(name = "ErrorInfoList", nillable = true)
    protected ArrayOfErrorInfo errorInfoList;

    /**
     * Gets the value of the errorInfoList property.
     *
     * @return possible object is {@link ArrayOfErrorInfo }
     */
    public ArrayOfErrorInfo getErrorInfoList() {
        return errorInfoList;
    }

    /**
     * Sets the value of the errorInfoList property.
     *
     * @param value allowed object is {@link ArrayOfErrorInfo }
     */
    public void setErrorInfoList(ArrayOfErrorInfo value) {
        this.errorInfoList = value;
    }

}
