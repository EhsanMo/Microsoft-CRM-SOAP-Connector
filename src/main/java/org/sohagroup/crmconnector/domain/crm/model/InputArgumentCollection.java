
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InputArgumentCollection complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="InputArgumentCollection"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Arguments" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringanyType"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputArgumentCollection", propOrder = {
    "arguments"
})
public class InputArgumentCollection {

    @XmlElement(name = "Arguments", nillable = true)
    protected ArrayOfKeyValuePairOfstringanyType arguments;

    /**
     * Gets the value of the arguments property.
     *
     * @return possible object is {@link ArrayOfKeyValuePairOfstringanyType }
     */
    public ArrayOfKeyValuePairOfstringanyType getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     *
     * @param value allowed object is {@link ArrayOfKeyValuePairOfstringanyType }
     */
    public void setArguments(ArrayOfKeyValuePairOfstringanyType value) {
        this.arguments = value;
    }

}
