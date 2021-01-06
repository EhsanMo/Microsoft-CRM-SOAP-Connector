
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IntegerFormat.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="IntegerFormat"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="Duration"/&amp;gt; &amp;lt;enumeration
 * value="TimeZone"/&amp;gt; &amp;lt;enumeration value="Language"/&amp;gt; &amp;lt;enumeration value="Locale"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "IntegerFormat", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum IntegerFormat {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("TimeZone")
    TIME_ZONE("TimeZone"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("Locale")
    LOCALE("Locale");
    private final String value;

    IntegerFormat(String v) {
        value = v;
    }

    public static IntegerFormat fromValue(String v) {
        for (IntegerFormat c : IntegerFormat.values()) {
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
