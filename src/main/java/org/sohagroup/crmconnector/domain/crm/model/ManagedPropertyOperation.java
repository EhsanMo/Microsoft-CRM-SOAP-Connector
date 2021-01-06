
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagedPropertyOperation.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ManagedPropertyOperation"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration value="Create"/&amp;gt; &amp;lt;enumeration
 * value="Update"/&amp;gt; &amp;lt;enumeration value="Delete"/&amp;gt; &amp;lt;enumeration value="CreateUpdate"/&amp;gt;
 * &amp;lt;enumeration value="UpdateDelete"/&amp;gt; &amp;lt;enumeration value="All"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ManagedPropertyOperation", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum ManagedPropertyOperation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("CreateUpdate")
    CREATE_UPDATE("CreateUpdate"),
    @XmlEnumValue("UpdateDelete")
    UPDATE_DELETE("UpdateDelete"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ManagedPropertyOperation(String v) {
        value = v;
    }

    public static ManagedPropertyOperation fromValue(String v) {
        for (ManagedPropertyOperation c : ManagedPropertyOperation.values()) {
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
