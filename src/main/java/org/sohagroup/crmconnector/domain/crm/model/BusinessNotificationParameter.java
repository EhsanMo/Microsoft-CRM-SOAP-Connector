
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BusinessNotificationParameter complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="BusinessNotificationParameter"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ParameterType" type="{http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages}BusinessNotificationParameterType"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessNotificationParameter", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", propOrder = {
    "data",
    "parameterType"
})
public class BusinessNotificationParameter {

  @XmlElement(name = "Data", nillable = true)
  protected String data;
  @XmlElement(name = "ParameterType")
  @XmlSchemaType(name = "string")
  protected BusinessNotificationParameterType parameterType;

  /**
   * Gets the value of the data property.
   *
   * @return possible object is {@link String }
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the value of the data property.
   *
   * @param value allowed object is {@link String }
   */
  public void setData(String value) {
    this.data = value;
  }

  /**
   * Gets the value of the parameterType property.
   *
   * @return possible object is {@link BusinessNotificationParameterType }
   */
  public BusinessNotificationParameterType getParameterType() {
    return parameterType;
  }

  /**
   * Sets the value of the parameterType property.
   *
   * @param value allowed object is {@link BusinessNotificationParameterType }
   */
  public void setParameterType(BusinessNotificationParameterType value) {
    this.parameterType = value;
  }

}
