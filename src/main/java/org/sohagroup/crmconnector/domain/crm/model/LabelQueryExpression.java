
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LabelQueryExpression complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="LabelQueryExpression"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryBase"&amp;gt; &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="FilterLanguages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="MissingLabelBehavior" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelQueryExpression", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", propOrder = {
    "filterLanguages",
    "missingLabelBehavior"
})
public class LabelQueryExpression
    extends MetadataQueryBase {

    @XmlElement(name = "FilterLanguages", nillable = true)
    protected ArrayOfint filterLanguages;
    @XmlElement(name = "MissingLabelBehavior", nillable = true)
    protected Integer missingLabelBehavior;

    /**
     * Gets the value of the filterLanguages property.
     *
     * @return possible object is {@link ArrayOfint }
     */
    public ArrayOfint getFilterLanguages() {
        return filterLanguages;
    }

    /**
     * Sets the value of the filterLanguages property.
     *
     * @param value allowed object is {@link ArrayOfint }
     */
    public void setFilterLanguages(ArrayOfint value) {
        this.filterLanguages = value;
    }

    /**
     * Gets the value of the missingLabelBehavior property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getMissingLabelBehavior() {
        return missingLabelBehavior;
    }

    /**
     * Sets the value of the missingLabelBehavior property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setMissingLabelBehavior(Integer value) {
        this.missingLabelBehavior = value;
    }

}
