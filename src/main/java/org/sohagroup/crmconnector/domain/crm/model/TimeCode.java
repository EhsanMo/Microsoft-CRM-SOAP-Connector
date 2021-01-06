
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TimeCode.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="TimeCode"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Available"/&amp;gt; &amp;lt;enumeration value="Busy"/&amp;gt; &amp;lt;enumeration
 * value="Unavailable"/&amp;gt; &amp;lt;enumeration value="Filter"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "TimeCode")
@XmlEnum
public enum TimeCode {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Filter")
    FILTER("Filter");
    private final String value;

    TimeCode(String v) {
        value = v;
    }

    public static TimeCode fromValue(String v) {
        for (TimeCode c : TimeCode.values()) {
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
