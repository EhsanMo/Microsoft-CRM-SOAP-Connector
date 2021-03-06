
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagedPropertyAttributeRequiredLevel complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ManagedPropertyAttributeRequiredLevel"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="CanBeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="ManagedPropertyLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Value" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeRequiredLevel"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedPropertyAttributeRequiredLevel", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "canBeChanged",
    "managedPropertyLogicalName",
    "value"
})
@XmlSeeAlso({
    AttributeRequiredLevelManagedProperty.class
})
public class ManagedPropertyAttributeRequiredLevel {

  @XmlElement(name = "CanBeChanged")
  protected Boolean canBeChanged;
  @XmlElement(name = "ManagedPropertyLogicalName", nillable = true)
  protected String managedPropertyLogicalName;
  @XmlElement(name = "Value")
  @XmlSchemaType(name = "string")
  protected AttributeRequiredLevel value;

  /**
   * Gets the value of the canBeChanged property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isCanBeChanged() {
    return canBeChanged;
  }

  /**
   * Sets the value of the canBeChanged property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setCanBeChanged(Boolean value) {
    this.canBeChanged = value;
  }

  /**
   * Gets the value of the managedPropertyLogicalName property.
   *
   * @return possible object is {@link String }
   */
  public String getManagedPropertyLogicalName() {
    return managedPropertyLogicalName;
  }

  /**
   * Sets the value of the managedPropertyLogicalName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setManagedPropertyLogicalName(String value) {
    this.managedPropertyLogicalName = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link AttributeRequiredLevel }
   */
  public AttributeRequiredLevel getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link AttributeRequiredLevel }
   */
  public void setValue(AttributeRequiredLevel value) {
    this.value = value;
  }

}
