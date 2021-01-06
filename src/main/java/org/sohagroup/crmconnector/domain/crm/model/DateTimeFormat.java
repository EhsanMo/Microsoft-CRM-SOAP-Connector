
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DateTimeFormat.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="DateTimeFormat"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="DateOnly"/&amp;gt; &amp;lt;enumeration value="DateAndTime"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "DateTimeFormat", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum DateTimeFormat {

    @XmlEnumValue("DateOnly")
    DATE_ONLY("DateOnly"),
    @XmlEnumValue("DateAndTime")
    DATE_AND_TIME("DateAndTime");
    private final String value;

    DateTimeFormat(String v) {
        value = v;
    }

    public static DateTimeFormat fromValue(String v) {
        for (DateTimeFormat c : DateTimeFormat.values()) {
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
