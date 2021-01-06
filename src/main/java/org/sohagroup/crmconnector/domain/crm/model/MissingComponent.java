
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MissingComponent complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MissingComponent"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="DependentComponent" type="{http://schemas.microsoft.com/crm/2011/Contracts}ComponentDetail"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="RequiredComponent" type="{http://schemas.microsoft.com/crm/2011/Contracts}ComponentDetail"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingComponent", propOrder = {
    "dependentComponent",
    "requiredComponent"
})
public class MissingComponent {

    @XmlElement(name = "DependentComponent", nillable = true)
    protected ComponentDetail dependentComponent;
    @XmlElement(name = "RequiredComponent", nillable = true)
    protected ComponentDetail requiredComponent;

    /**
     * Gets the value of the dependentComponent property.
     *
     * @return possible object is {@link ComponentDetail }
     */
    public ComponentDetail getDependentComponent() {
        return dependentComponent;
    }

    /**
     * Sets the value of the dependentComponent property.
     *
     * @param value allowed object is {@link ComponentDetail }
     */
    public void setDependentComponent(ComponentDetail value) {
        this.dependentComponent = value;
    }

    /**
     * Gets the value of the requiredComponent property.
     *
     * @return possible object is {@link ComponentDetail }
     */
    public ComponentDetail getRequiredComponent() {
        return requiredComponent;
    }

    /**
     * Sets the value of the requiredComponent property.
     *
     * @param value allowed object is {@link ComponentDetail }
     */
    public void setRequiredComponent(ComponentDetail value) {
        this.requiredComponent = value;
    }

}
