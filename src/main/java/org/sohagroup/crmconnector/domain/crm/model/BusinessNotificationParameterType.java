
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BusinessNotificationParameterType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="BusinessNotificationParameterType"&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt; &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration
 * value="String"/&amp;gt; &amp;lt;enumeration value="Attribute"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "BusinessNotificationParameterType", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages")
@XmlEnum
public enum BusinessNotificationParameterType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute");
    private final String value;

    BusinessNotificationParameterType(String v) {
        value = v;
    }

    public static BusinessNotificationParameterType fromValue(String v) {
        for (BusinessNotificationParameterType c : BusinessNotificationParameterType.values()) {
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
