
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntitySource.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="EntitySource"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Account"/&amp;gt; &amp;lt;enumeration value="Contact"/&amp;gt; &amp;lt;enumeration
 * value="Lead"/&amp;gt; &amp;lt;enumeration value="All"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "EntitySource")
@XmlEnum
public enum EntitySource {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Lead")
    LEAD("Lead"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    EntitySource(String v) {
        value = v;
    }

    public static EntitySource fromValue(String v) {
        for (EntitySource c : EntitySource.values()) {
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
