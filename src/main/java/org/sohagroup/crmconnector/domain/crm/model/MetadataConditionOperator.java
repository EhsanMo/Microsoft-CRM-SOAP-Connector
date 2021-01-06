
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MetadataConditionOperator.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="MetadataConditionOperator"&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt; &amp;lt;enumeration value="Equals"/&amp;gt;
 * &amp;lt;enumeration value="NotEquals"/&amp;gt; &amp;lt;enumeration value="In"/&amp;gt; &amp;lt;enumeration
 * value="NotIn"/&amp;gt; &amp;lt;enumeration value="GreaterThan"/&amp;gt; &amp;lt;enumeration value="LessThan"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "MetadataConditionOperator", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query")
@XmlEnum
public enum MetadataConditionOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("NotIn")
    NOT_IN("NotIn"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan");
    private final String value;

    MetadataConditionOperator(String v) {
        value = v;
    }

    public static MetadataConditionOperator fromValue(String v) {
        for (MetadataConditionOperator c : MetadataConditionOperator.values()) {
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
