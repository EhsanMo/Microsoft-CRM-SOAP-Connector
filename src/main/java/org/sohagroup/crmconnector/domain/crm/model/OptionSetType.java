
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OptionSetType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="OptionSetType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Picklist"/&amp;gt; &amp;lt;enumeration value="State"/&amp;gt; &amp;lt;enumeration
 * value="Status"/&amp;gt; &amp;lt;enumeration value="Boolean"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "OptionSetType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum OptionSetType {

    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    OptionSetType(String v) {
        value = v;
    }

    public static OptionSetType fromValue(String v) {
        for (OptionSetType c : OptionSetType.values()) {
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
