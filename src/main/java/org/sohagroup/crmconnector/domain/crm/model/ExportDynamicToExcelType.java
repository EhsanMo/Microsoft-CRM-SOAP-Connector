
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExportDynamicToExcelType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ExportDynamicToExcelType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Dynamic"/&amp;gt; &amp;lt;enumeration value="Pivot"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ExportDynamicToExcelType")
@XmlEnum
public enum ExportDynamicToExcelType {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("Pivot")
    PIVOT("Pivot");
    private final String value;

    ExportDynamicToExcelType(String v) {
        value = v;
    }

    public static ExportDynamicToExcelType fromValue(String v) {
        for (ExportDynamicToExcelType c : ExportDynamicToExcelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
