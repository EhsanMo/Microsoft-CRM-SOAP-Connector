
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EntityState.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="EntityState"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Unchanged"/&amp;gt; &amp;lt;enumeration value="Created"/&amp;gt; &amp;lt;enumeration
 * value="Changed"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "EntityState", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum EntityState {

    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Changed")
    CHANGED("Changed");
    private final String value;

    EntityState(String v) {
        value = v;
    }

    public static EntityState fromValue(String v) {
        for (EntityState c : EntityState.values()) {
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
