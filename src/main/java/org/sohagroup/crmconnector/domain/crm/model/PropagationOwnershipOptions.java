
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PropagationOwnershipOptions.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="PropagationOwnershipOptions"&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt; &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration
 * value="Caller"/&amp;gt; &amp;lt;enumeration value="ListMemberOwner"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "PropagationOwnershipOptions")
@XmlEnum
public enum PropagationOwnershipOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Caller")
    CALLER("Caller"),
    @XmlEnumValue("ListMemberOwner")
    LIST_MEMBER_OWNER("ListMemberOwner");
    private final String value;

    PropagationOwnershipOptions(String v) {
        value = v;
    }

    public static PropagationOwnershipOptions fromValue(String v) {
        for (PropagationOwnershipOptions c : PropagationOwnershipOptions.values()) {
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
