
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CascadeType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="CascadeType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="NoCascade"/&amp;gt; &amp;lt;enumeration value="Cascade"/&amp;gt; &amp;lt;enumeration
 * value="Active"/&amp;gt; &amp;lt;enumeration value="UserOwned"/&amp;gt; &amp;lt;enumeration
 * value="RemoveLink"/&amp;gt; &amp;lt;enumeration value="Restrict"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "CascadeType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum CascadeType {

    @XmlEnumValue("NoCascade")
    NO_CASCADE("NoCascade"),
    @XmlEnumValue("Cascade")
    CASCADE("Cascade"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("UserOwned")
    USER_OWNED("UserOwned"),
    @XmlEnumValue("RemoveLink")
    REMOVE_LINK("RemoveLink"),
    @XmlEnumValue("Restrict")
    RESTRICT("Restrict");
    private final String value;

    CascadeType(String v) {
        value = v;
    }

    public static CascadeType fromValue(String v) {
        for (CascadeType c : CascadeType.values()) {
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
