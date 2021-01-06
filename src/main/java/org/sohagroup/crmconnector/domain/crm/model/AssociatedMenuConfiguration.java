
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AssociatedMenuConfiguration complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="AssociatedMenuConfiguration"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Behavior" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuBehavior" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="Group" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuGroup"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Label" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedMenuConfiguration", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "behavior",
    "group",
    "label",
    "order"
})
public class AssociatedMenuConfiguration {

    @XmlElement(name = "Behavior", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssociatedMenuBehavior behavior;
    @XmlElement(name = "Group", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssociatedMenuGroup group;
    @XmlElement(name = "Label", nillable = true)
    protected Label label;
    @XmlElement(name = "Order", nillable = true)
    protected Integer order;

    /**
     * Gets the value of the behavior property.
     *
     * @return possible object is {@link AssociatedMenuBehavior }
     */
    public AssociatedMenuBehavior getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     *
     * @param value allowed object is {@link AssociatedMenuBehavior }
     */
    public void setBehavior(AssociatedMenuBehavior value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return possible object is {@link AssociatedMenuGroup }
     */
    public AssociatedMenuGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value allowed object is {@link AssociatedMenuGroup }
     */
    public void setGroup(AssociatedMenuGroup value) {
        this.group = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is {@link Label }
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is {@link Label }
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the order property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

}
