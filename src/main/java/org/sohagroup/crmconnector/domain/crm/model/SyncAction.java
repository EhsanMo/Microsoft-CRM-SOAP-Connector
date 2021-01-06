
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SyncAction.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="SyncAction"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="Insert"/&amp;gt; &amp;lt;enumeration
 * value="Delete"/&amp;gt; &amp;lt;enumeration value="Update"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "SyncAction")
@XmlEnum
public enum SyncAction {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Insert")
    INSERT("Insert"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    SyncAction(String v) {
        value = v;
    }

    public static SyncAction fromValue(String v) {
        for (SyncAction c : SyncAction.values()) {
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
