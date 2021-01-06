
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AssociatedMenuGroup.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="AssociatedMenuGroup"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Details"/&amp;gt; &amp;lt;enumeration value="Sales"/&amp;gt; &amp;lt;enumeration
 * value="Service"/&amp;gt; &amp;lt;enumeration value="Marketing"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "AssociatedMenuGroup", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum AssociatedMenuGroup {

    @XmlEnumValue("Details")
    DETAILS("Details"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Marketing")
    MARKETING("Marketing");
    private final String value;

    AssociatedMenuGroup(String v) {
        value = v;
    }

    public static AssociatedMenuGroup fromValue(String v) {
        for (AssociatedMenuGroup c : AssociatedMenuGroup.values()) {
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
