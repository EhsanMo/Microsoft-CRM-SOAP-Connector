
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for KeyValuePairOfEndpointTypestringyDL0RVHi complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="KeyValuePairOfEndpointTypestringyDL0RVHi"&amp;gt;
 * &amp;lt;complexContent&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="key" type="{http://schemas.microsoft.com/xrm/2014/Contracts}EndpointType"/&amp;gt;
 * &amp;lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfEndpointTypestringyDL0RVHi", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfEndpointTypestringyDL0RVHi {

  @XmlElement(required = true)
  @XmlSchemaType(name = "string")
  protected EndpointType key;
  @XmlElement(required = true, nillable = true)
  protected String value;

  /**
   * Gets the value of the key property.
   *
   * @return possible object is {@link EndpointType }
   */
  public EndpointType getKey() {
    return key;
  }

  /**
   * Sets the value of the key property.
   *
   * @param value allowed object is {@link EndpointType }
   */
  public void setKey(EndpointType value) {
    this.key = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

}
