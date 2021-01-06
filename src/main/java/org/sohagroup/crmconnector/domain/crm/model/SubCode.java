
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SubCode.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="SubCode"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Unspecified"/&amp;gt; &amp;lt;enumeration value="Schedulable"/&amp;gt; &amp;lt;enumeration
 * value="Committed"/&amp;gt; &amp;lt;enumeration value="Uncommitted"/&amp;gt; &amp;lt;enumeration
 * value="Break"/&amp;gt; &amp;lt;enumeration value="Holiday"/&amp;gt; &amp;lt;enumeration value="Vacation"/&amp;gt;
 * &amp;lt;enumeration value="Appointment"/&amp;gt; &amp;lt;enumeration value="ResourceStartTime"/&amp;gt;
 * &amp;lt;enumeration value="ResourceServiceRestriction"/&amp;gt; &amp;lt;enumeration value="ResourceCapacity"/&amp;gt;
 * &amp;lt;enumeration value="ServiceRestriction"/&amp;gt; &amp;lt;enumeration value="ServiceCost"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "SubCode")
@XmlEnum
public enum SubCode {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Schedulable")
    SCHEDULABLE("Schedulable"),
    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Uncommitted")
    UNCOMMITTED("Uncommitted"),
    @XmlEnumValue("Break")
    BREAK("Break"),
    @XmlEnumValue("Holiday")
    HOLIDAY("Holiday"),
    @XmlEnumValue("Vacation")
    VACATION("Vacation"),
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),
    @XmlEnumValue("ResourceStartTime")
    RESOURCE_START_TIME("ResourceStartTime"),
    @XmlEnumValue("ResourceServiceRestriction")
    RESOURCE_SERVICE_RESTRICTION("ResourceServiceRestriction"),
    @XmlEnumValue("ResourceCapacity")
    RESOURCE_CAPACITY("ResourceCapacity"),
    @XmlEnumValue("ServiceRestriction")
    SERVICE_RESTRICTION("ServiceRestriction"),
    @XmlEnumValue("ServiceCost")
    SERVICE_COST("ServiceCost");
    private final String value;

    SubCode(String v) {
        value = v;
    }

    public static SubCode fromValue(String v) {
        for (SubCode c : SubCode.values()) {
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
