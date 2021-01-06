
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ErrorInfo complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ErrorInfo"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="ErrorCode"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element name="ResourceList"
 * type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfResourceInfo" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorInfo", propOrder = {
    "errorCode",
    "resourceList"
})
public class ErrorInfo {

    @XmlElement(name = "ErrorCode", nillable = true)
    protected String errorCode;
    @XmlElement(name = "ResourceList", nillable = true)
    protected ArrayOfResourceInfo resourceList;

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is {@link String }
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the resourceList property.
     *
     * @return possible object is {@link ArrayOfResourceInfo }
     */
    public ArrayOfResourceInfo getResourceList() {
        return resourceList;
    }

    /**
     * Sets the value of the resourceList property.
     *
     * @param value allowed object is {@link ArrayOfResourceInfo }
     */
    public void setResourceList(ArrayOfResourceInfo value) {
        this.resourceList = value;
    }

}
