
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TargetFieldType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="TargetFieldType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="All"/&amp;gt; &amp;lt;enumeration value="ValidForCreate"/&amp;gt; &amp;lt;enumeration
 * value="ValidForUpdate"/&amp;gt; &amp;lt;enumeration value="ValidForRead"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "TargetFieldType")
@XmlEnum
public enum TargetFieldType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("ValidForCreate")
    VALID_FOR_CREATE("ValidForCreate"),
    @XmlEnumValue("ValidForUpdate")
    VALID_FOR_UPDATE("ValidForUpdate"),
    @XmlEnumValue("ValidForRead")
    VALID_FOR_READ("ValidForRead");
    private final String value;

    TargetFieldType(String v) {
        value = v;
    }

    public static TargetFieldType fromValue(String v) {
        for (TargetFieldType c : TargetFieldType.values()) {
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
