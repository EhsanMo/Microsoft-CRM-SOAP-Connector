
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AssociatedMenuBehavior.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="AssociatedMenuBehavior"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="UseCollectionName"/&amp;gt; &amp;lt;enumeration value="UseLabel"/&amp;gt;
 * &amp;lt;enumeration value="DoNotDisplay"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlType(name = "AssociatedMenuBehavior", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum AssociatedMenuBehavior {

    @XmlEnumValue("UseCollectionName")
    USE_COLLECTION_NAME("UseCollectionName"),
    @XmlEnumValue("UseLabel")
    USE_LABEL("UseLabel"),
    @XmlEnumValue("DoNotDisplay")
    DO_NOT_DISPLAY("DoNotDisplay");
    private final String value;

    AssociatedMenuBehavior(String v) {
        value = v;
    }

    public static AssociatedMenuBehavior fromValue(String v) {
        for (AssociatedMenuBehavior c : AssociatedMenuBehavior.values()) {
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
