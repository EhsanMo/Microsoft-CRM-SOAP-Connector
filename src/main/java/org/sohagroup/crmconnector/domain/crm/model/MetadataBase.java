
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MetadataBase complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="MetadataBase"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="MetadataId"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt; &amp;lt;element
 * name="HasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataBase", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "metadataId",
    "hasChanged"
})
@XmlSeeAlso({
    LocalizedLabel.class,
    RelationshipMetadataBase.class,
    OptionSetMetadataBase.class,
    OptionMetadata.class,
    EntityMetadata.class,
    ManagedPropertyMetadata.class,
    AttributeMetadata.class
})
public class MetadataBase {

    @XmlElement(name = "MetadataId", nillable = true)
    protected String metadataId;
    @XmlElement(name = "HasChanged", nillable = true)
    protected Boolean hasChanged;

    /**
     * Gets the value of the metadataId property.
     *
     * @return possible object is {@link String }
     */
    public String getMetadataId() {
        return metadataId;
    }

    /**
     * Sets the value of the metadataId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMetadataId(String value) {
        this.metadataId = value;
    }

    /**
     * Gets the value of the hasChanged property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isHasChanged() {
        return hasChanged;
    }

    /**
     * Sets the value of the hasChanged property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setHasChanged(Boolean value) {
        this.hasChanged = value;
    }

}
