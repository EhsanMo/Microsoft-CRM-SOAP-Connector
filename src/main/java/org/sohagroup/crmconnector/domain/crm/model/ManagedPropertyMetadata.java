
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagedPropertyMetadata complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ManagedPropertyMetadata"&amp;gt; &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase"&amp;gt;
 * &amp;lt;sequence&amp;gt; &amp;lt;element name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="DisplayName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EnablesAttributeName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EnablesEntityName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="EvaluationPriority" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ManagedPropertyEvaluationPriority"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsGlobalForOperation" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="LogicalName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="ManagedPropertyType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ManagedPropertyType"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="Operation" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ManagedPropertyOperation"
 * minOccurs="0"/&amp;gt; &amp;lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;/extension&amp;gt; &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt; &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedPropertyMetadata", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata", propOrder = {
    "description",
    "displayName",
    "enablesAttributeName",
    "enablesEntityName",
    "errorCode",
    "evaluationPriority",
    "isGlobalForOperation",
    "isPrivate",
    "logicalName",
    "managedPropertyType",
    "operation",
    "introducedVersion"
})
public class ManagedPropertyMetadata
    extends MetadataBase {

    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "DisplayName", nillable = true)
    protected Label displayName;
    @XmlElement(name = "EnablesAttributeName", nillable = true)
    protected String enablesAttributeName;
    @XmlElement(name = "EnablesEntityName", nillable = true)
    protected String enablesEntityName;
    @XmlElement(name = "ErrorCode", nillable = true)
    protected Integer errorCode;
    @XmlElement(name = "EvaluationPriority", nillable = true)
    @XmlSchemaType(name = "string")
    protected ManagedPropertyEvaluationPriority evaluationPriority;
    @XmlElement(name = "IsGlobalForOperation", nillable = true)
    protected Boolean isGlobalForOperation;
    @XmlElement(name = "IsPrivate", nillable = true)
    protected Boolean isPrivate;
    @XmlElement(name = "LogicalName", nillable = true)
    protected String logicalName;
    @XmlElement(name = "ManagedPropertyType", nillable = true)
    @XmlSchemaType(name = "string")
    protected ManagedPropertyType managedPropertyType;
    @XmlElement(name = "Operation", nillable = true)
    @XmlSchemaType(name = "string")
    protected ManagedPropertyOperation operation;
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
     * Gets the value of the enablesAttributeName property.
     *
     * @return possible object is {@link String }
     */
    public String getEnablesAttributeName() {
        return enablesAttributeName;
    }

    /**
     * Sets the value of the enablesAttributeName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEnablesAttributeName(String value) {
        this.enablesAttributeName = value;
    }

    /**
     * Gets the value of the enablesEntityName property.
     *
     * @return possible object is {@link String }
     */
    public String getEnablesEntityName() {
        return enablesEntityName;
    }

    /**
     * Sets the value of the enablesEntityName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEnablesEntityName(String value) {
        this.enablesEntityName = value;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the evaluationPriority property.
     *
     * @return possible object is {@link ManagedPropertyEvaluationPriority }
     */
    public ManagedPropertyEvaluationPriority getEvaluationPriority() {
        return evaluationPriority;
    }

    /**
     * Sets the value of the evaluationPriority property.
     *
     * @param value allowed object is {@link ManagedPropertyEvaluationPriority }
     */
    public void setEvaluationPriority(ManagedPropertyEvaluationPriority value) {
        this.evaluationPriority = value;
    }

    /**
     * Gets the value of the isGlobalForOperation property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsGlobalForOperation() {
        return isGlobalForOperation;
    }

    /**
     * Sets the value of the isGlobalForOperation property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsGlobalForOperation(Boolean value) {
        this.isGlobalForOperation = value;
    }

    /**
     * Gets the value of the isPrivate property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the logicalName property.
     *
     * @return possible object is {@link String }
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLogicalName(String value) {
        this.logicalName = value;
    }

    /**
     * Gets the value of the managedPropertyType property.
     *
     * @return possible object is {@link ManagedPropertyType }
     */
    public ManagedPropertyType getManagedPropertyType() {
        return managedPropertyType;
    }

    /**
     * Sets the value of the managedPropertyType property.
     *
     * @param value allowed object is {@link ManagedPropertyType }
     */
    public void setManagedPropertyType(ManagedPropertyType value) {
        this.managedPropertyType = value;
    }

    /**
     * Gets the value of the operation property.
     *
     * @return possible object is {@link ManagedPropertyOperation }
     */
    public ManagedPropertyOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     *
     * @param value allowed object is {@link ManagedPropertyOperation }
     */
    public void setOperation(ManagedPropertyOperation value) {
        this.operation = value;
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
