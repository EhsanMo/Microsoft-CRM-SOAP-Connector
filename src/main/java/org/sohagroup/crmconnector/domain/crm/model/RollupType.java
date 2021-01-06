
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RollupType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="RollupType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="Related"/&amp;gt; &amp;lt;enumeration
 * value="Extended"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "RollupType")
@XmlEnum
public enum RollupType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Related")
    RELATED("Related"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    RollupType(String v) {
        value = v;
    }

    public static RollupType fromValue(String v) {
        for (RollupType c : RollupType.values()) {
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
