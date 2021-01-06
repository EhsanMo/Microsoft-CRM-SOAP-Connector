
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelationshipType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="RelationshipType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="OneToManyRelationship"/&amp;gt; &amp;lt;enumeration value="ManyToManyRelationship"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "RelationshipType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum RelationshipType {

    @XmlEnumValue("OneToManyRelationship")
    ONE_TO_MANY_RELATIONSHIP("OneToManyRelationship"),
    @XmlEnumValue("ManyToManyRelationship")
    MANY_TO_MANY_RELATIONSHIP("ManyToManyRelationship");
    private final String value;

    RelationshipType(String v) {
        value = v;
    }

    public static RelationshipType fromValue(String v) {
        for (RelationshipType c : RelationshipType.values()) {
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
