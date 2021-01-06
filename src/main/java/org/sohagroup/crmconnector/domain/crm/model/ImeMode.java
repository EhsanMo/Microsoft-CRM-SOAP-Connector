
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ImeMode.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ImeMode"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Auto"/&amp;gt; &amp;lt;enumeration value="Inactive"/&amp;gt; &amp;lt;enumeration
 * value="Active"/&amp;gt; &amp;lt;enumeration value="Disabled"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ImeMode", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum ImeMode {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    ImeMode(String v) {
        value = v;
    }

    public static ImeMode fromValue(String v) {
        for (ImeMode c : ImeMode.values()) {
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
