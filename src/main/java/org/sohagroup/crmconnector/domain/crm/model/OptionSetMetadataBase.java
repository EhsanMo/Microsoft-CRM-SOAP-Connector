
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OptionSetMetadataBase complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="OptionSetMetadataBase"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;extension
 * base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DisplayName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsCustomOptionSet" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsGlobal" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="OptionSetType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSetMetadataBase", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "description",
    "displayName",
    "isCustomOptionSet",
    "isCustomizable",
    "isGlobal",
    "isManaged",
    "name",
    "optionSetType",
    "introducedVersion"
})
@XmlSeeAlso({
    OptionSetMetadata.class,
    BooleanOptionSetMetadata.class
})
public class OptionSetMetadataBase
    extends MetadataBase {

    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "DisplayName", nillable = true)
    protected Label displayName;
    @XmlElement(name = "IsCustomOptionSet", nillable = true)
    protected Boolean isCustomOptionSet;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsGlobal", nillable = true)
    protected Boolean isGlobal;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OptionSetType", nillable = true)
    @XmlSchemaType(name = "string")
    protected OptionSetType optionSetType;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link Label }
     */
    public Label getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link Label }
     */
    public void setDescription(Label value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is {@link Label }
     */
    public Label getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value allowed object is {@link Label }
     */
    public void setDisplayName(Label value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isCustomOptionSet property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsCustomOptionSet() {
        return isCustomOptionSet;
    }

    /**
     * Sets the value of the isCustomOptionSet property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsCustomOptionSet(Boolean value) {
        this.isCustomOptionSet = value;
    }

    /**
     * Gets the value of the isCustomizable property.
     *
     * @return possible object is {@link BooleanManagedProperty }
     */
    public BooleanManagedProperty getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Sets the value of the isCustomizable property.
     *
     * @param value allowed object is {@link BooleanManagedProperty }
     */
    public void setIsCustomizable(BooleanManagedProperty value) {
        this.isCustomizable = value;
    }

    /**
     * Gets the value of the isGlobal property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * Sets the value of the isGlobal property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsGlobal(Boolean value) {
        this.isGlobal = value;
    }

    /**
     * Gets the value of the isManaged property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsManaged() {
        return isManaged;
    }

    /**
     * Sets the value of the isManaged property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsManaged(Boolean value) {
        this.isManaged = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the optionSetType property.
     *
     * @return possible object is {@link OptionSetType }
     */
    public OptionSetType getOptionSetType() {
        return optionSetType;
    }

    /**
     * Sets the value of the optionSetType property.
     *
     * @param value allowed object is {@link OptionSetType }
     */
    public void setOptionSetType(OptionSetType value) {
        this.optionSetType = value;
    }

    /**
     * Gets the value of the introducedVersion property.
     *
     * @return possible object is {@link String }
     */
    public String getIntroducedVersion() {
        return introducedVersion;
    }

    /**
     * Sets the value of the introducedVersion property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIntroducedVersion(String value) {
        this.introducedVersion = value;
    }

}
