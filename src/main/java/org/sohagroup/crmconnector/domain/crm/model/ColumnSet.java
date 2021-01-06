
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ColumnSet complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt; &amp;lt;complexType name="ColumnSet"&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element name="AllColumns"
 * type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt; &amp;lt;element name="Columns"
 * type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnSet", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts", propOrder = {
    "allColumns",
    "columns"
})
public class ColumnSet {

    @XmlElement(name = "AllColumns")
    protected Boolean allColumns;
    @XmlElement(name = "Columns", nillable = true)
    protected ArrayOfstring columns;

    /**
     * Gets the value of the allColumns property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAllColumns() {
        return allColumns;
    }

    /**
     * Sets the value of the allColumns property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAllColumns(Boolean value) {
        this.allColumns = value;
    }

    /**
     * Gets the value of the columns property.
     *
     * @return possible object is {@link ArrayOfstring }
     */
    public ArrayOfstring getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     *
     * @param value allowed object is {@link ArrayOfstring }
     */
    public void setColumns(ArrayOfstring value) {
        this.columns = value;
    }

}
