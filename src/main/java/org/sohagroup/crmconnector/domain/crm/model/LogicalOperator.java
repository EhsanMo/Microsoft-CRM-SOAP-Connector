
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LogicalOperator.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="LogicalOperator"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="And"/&amp;gt; &amp;lt;enumeration value="Or"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "LogicalOperator", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum LogicalOperator {

    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    LogicalOperator(String v) {
        value = v;
    }

    public static LogicalOperator fromValue(String v) {
        for (LogicalOperator c : LogicalOperator.values()) {
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
