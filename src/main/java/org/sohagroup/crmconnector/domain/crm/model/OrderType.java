
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrderType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="OrderType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Ascending"/&amp;gt; &amp;lt;enumeration value="Descending"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "OrderType", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum OrderType {

    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    OrderType(String v) {
        value = v;
    }

    public static OrderType fromValue(String v) {
        for (OrderType c : OrderType.values()) {
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
