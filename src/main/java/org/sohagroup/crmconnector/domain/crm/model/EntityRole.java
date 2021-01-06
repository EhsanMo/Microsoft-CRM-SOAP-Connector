
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntityRole.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="EntityRole"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Referencing"/&amp;gt; &amp;lt;enumeration value="Referenced"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "EntityRole", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum EntityRole {

    @XmlEnumValue("Referencing")
    REFERENCING("Referencing"),
    @XmlEnumValue("Referenced")
    REFERENCED("Referenced");
    private final String value;

    EntityRole(String v) {
        value = v;
    }

    public static EntityRole fromValue(String v) {
        for (EntityRole c : EntityRole.values()) {
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
