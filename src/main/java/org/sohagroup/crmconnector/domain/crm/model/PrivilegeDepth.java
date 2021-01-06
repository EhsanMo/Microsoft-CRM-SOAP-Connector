
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrivilegeDepth.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="PrivilegeDepth"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Basic"/&amp;gt; &amp;lt;enumeration value="Local"/&amp;gt; &amp;lt;enumeration
 * value="Deep"/&amp;gt; &amp;lt;enumeration value="Global"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "PrivilegeDepth")
@XmlEnum
public enum PrivilegeDepth {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Deep")
    DEEP("Deep"),
    @XmlEnumValue("Global")
    GLOBAL("Global");
    private final String value;

    PrivilegeDepth(String v) {
        value = v;
    }

    public static PrivilegeDepth fromValue(String v) {
        for (PrivilegeDepth c : PrivilegeDepth.values()) {
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
