
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FaultType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="FaultType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="CrmException"/&amp;gt; &amp;lt;enumeration value="ClrException"/&amp;gt;
 * &amp;lt;enumeration value="Assertion"/&amp;gt; &amp;lt;enumeration value="Watson"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "FaultType")
@XmlEnum
public enum FaultType {

    @XmlEnumValue("CrmException")
    CRM_EXCEPTION("CrmException"),
    @XmlEnumValue("ClrException")
    CLR_EXCEPTION("ClrException"),
    @XmlEnumValue("Assertion")
    ASSERTION("Assertion"),
    @XmlEnumValue("Watson")
    WATSON("Watson");
    private final String value;

    FaultType(String v) {
        value = v;
    }

    public static FaultType fromValue(String v) {
        for (FaultType c : FaultType.values()) {
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
