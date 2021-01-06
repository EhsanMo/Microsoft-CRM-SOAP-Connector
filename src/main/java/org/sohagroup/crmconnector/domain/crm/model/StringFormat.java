
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StringFormat.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="StringFormat"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Email"/&amp;gt; &amp;lt;enumeration value="Text"/&amp;gt; &amp;lt;enumeration
 * value="TextArea"/&amp;gt; &amp;lt;enumeration value="Url"/&amp;gt; &amp;lt;enumeration value="TickerSymbol"/&amp;gt;
 * &amp;lt;enumeration value="PhoneticGuide"/&amp;gt; &amp;lt;enumeration value="VersionNumber"/&amp;gt;
 * &amp;lt;enumeration value="Phone"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "StringFormat", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum StringFormat {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("TickerSymbol")
    TICKER_SYMBOL("TickerSymbol"),
    @XmlEnumValue("PhoneticGuide")
    PHONETIC_GUIDE("PhoneticGuide"),
    @XmlEnumValue("VersionNumber")
    VERSION_NUMBER("VersionNumber"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    StringFormat(String v) {
        value = v;
    }

    public static StringFormat fromValue(String v) {
        for (StringFormat c : StringFormat.values()) {
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
