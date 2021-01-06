
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeRequiredLevel.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="AttributeRequiredLevel"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="SystemRequired"/&amp;gt; &amp;lt;enumeration
 * value="ApplicationRequired"/&amp;gt; &amp;lt;enumeration value="Recommended"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "AttributeRequiredLevel", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum AttributeRequiredLevel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SystemRequired")
    SYSTEM_REQUIRED("SystemRequired"),
    @XmlEnumValue("ApplicationRequired")
    APPLICATION_REQUIRED("ApplicationRequired"),
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended");
    private final String value;

    AttributeRequiredLevel(String v) {
        value = v;
    }

    public static AttributeRequiredLevel fromValue(String v) {
        for (AttributeRequiredLevel c : AttributeRequiredLevel.values()) {
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
