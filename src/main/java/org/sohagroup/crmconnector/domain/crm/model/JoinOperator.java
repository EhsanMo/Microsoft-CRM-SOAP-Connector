
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for JoinOperator.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="JoinOperator"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Inner"/&amp;gt; &amp;lt;enumeration value="LeftOuter"/&amp;gt; &amp;lt;enumeration
 * value="Natural"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "JoinOperator", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum JoinOperator {

    @XmlEnumValue("Inner")
    INNER("Inner"),
    @XmlEnumValue("LeftOuter")
    LEFT_OUTER("LeftOuter"),
    @XmlEnumValue("Natural")
    NATURAL("Natural");
    private final String value;

    JoinOperator(String v) {
        value = v;
    }

    public static JoinOperator fromValue(String v) {
        for (JoinOperator c : JoinOperator.values()) {
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
