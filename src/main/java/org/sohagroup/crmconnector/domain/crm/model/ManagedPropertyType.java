
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagedPropertyType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ManagedPropertyType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Operation"/&amp;gt; &amp;lt;enumeration value="Attribute"/&amp;gt; &amp;lt;enumeration
 * value="CustomEvaluator"/&amp;gt; &amp;lt;enumeration value="Custom"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ManagedPropertyType", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum ManagedPropertyType {

    @XmlEnumValue("Operation")
    OPERATION("Operation"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),
    @XmlEnumValue("CustomEvaluator")
    CUSTOM_EVALUATOR("CustomEvaluator"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ManagedPropertyType(String v) {
        value = v;
    }

    public static ManagedPropertyType fromValue(String v) {
        for (ManagedPropertyType c : ManagedPropertyType.values()) {
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
