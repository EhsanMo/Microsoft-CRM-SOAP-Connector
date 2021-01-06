
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrivilegeType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="PrivilegeType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="Create"/&amp;gt; &amp;lt;enumeration
 * value="Read"/&amp;gt; &amp;lt;enumeration value="Write"/&amp;gt; &amp;lt;enumeration value="Delete"/&amp;gt;
 * &amp;lt;enumeration value="Assign"/&amp;gt; &amp;lt;enumeration value="Share"/&amp;gt; &amp;lt;enumeration
 * value="Append"/&amp;gt; &amp;lt;enumeration value="AppendTo"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "PrivilegeType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum PrivilegeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Write")
    WRITE("Write"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Assign")
    ASSIGN("Assign"),
    @XmlEnumValue("Share")
    SHARE("Share"),
    @XmlEnumValue("Append")
    APPEND("Append"),
    @XmlEnumValue("AppendTo")
    APPEND_TO("AppendTo");
    private final String value;

    PrivilegeType(String v) {
        value = v;
    }

    public static PrivilegeType fromValue(String v) {
        for (PrivilegeType c : PrivilegeType.values()) {
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
