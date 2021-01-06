
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BusinessNotificationSeverity.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="BusinessNotificationSeverity"&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt; &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration
 * value="Error"/&amp;gt; &amp;lt;enumeration value="Warning"/&amp;gt; &amp;lt;enumeration value="Information"/&amp;gt;
 * &amp;lt;enumeration value="UserDefined"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlType(name = "BusinessNotificationSeverity", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages")
@XmlEnum
public enum BusinessNotificationSeverity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined");
    private final String value;

    BusinessNotificationSeverity(String v) {
        value = v;
    }

    public static BusinessNotificationSeverity fromValue(String v) {
        for (BusinessNotificationSeverity c : BusinessNotificationSeverity.values()) {
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
