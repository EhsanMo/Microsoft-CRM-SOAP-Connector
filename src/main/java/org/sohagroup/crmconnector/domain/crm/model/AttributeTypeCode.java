
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeTypeCode.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="AttributeTypeCode"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Boolean"/&amp;gt; &amp;lt;enumeration value="Customer"/&amp;gt; &amp;lt;enumeration
 * value="DateTime"/&amp;gt; &amp;lt;enumeration value="Decimal"/&amp;gt; &amp;lt;enumeration value="Double"/&amp;gt;
 * &amp;lt;enumeration value="Integer"/&amp;gt; &amp;lt;enumeration value="Lookup"/&amp;gt; &amp;lt;enumeration
 * value="Memo"/&amp;gt; &amp;lt;enumeration value="Money"/&amp;gt; &amp;lt;enumeration value="Owner"/&amp;gt;
 * &amp;lt;enumeration value="PartyList"/&amp;gt; &amp;lt;enumeration value="Picklist"/&amp;gt; &amp;lt;enumeration
 * value="State"/&amp;gt; &amp;lt;enumeration value="Status"/&amp;gt; &amp;lt;enumeration value="String"/&amp;gt;
 * &amp;lt;enumeration value="Uniqueidentifier"/&amp;gt; &amp;lt;enumeration value="CalendarRules"/&amp;gt;
 * &amp;lt;enumeration value="Virtual"/&amp;gt; &amp;lt;enumeration value="BigInt"/&amp;gt; &amp;lt;enumeration
 * value="ManagedProperty"/&amp;gt; &amp;lt;enumeration value="EntityName"/&amp;gt; &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "AttributeTypeCode", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum AttributeTypeCode {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Lookup")
    LOOKUP("Lookup"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("PartyList")
    PARTY_LIST("PartyList"),
    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Uniqueidentifier")
    UNIQUEIDENTIFIER("Uniqueidentifier"),
    @XmlEnumValue("CalendarRules")
    CALENDAR_RULES("CalendarRules"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("BigInt")
    BIG_INT("BigInt"),
    @XmlEnumValue("ManagedProperty")
    MANAGED_PROPERTY("ManagedProperty"),
    @XmlEnumValue("EntityName")
    ENTITY_NAME("EntityName");
    private final String value;

    AttributeTypeCode(String v) {
        value = v;
    }

    public static AttributeTypeCode fromValue(String v) {
        for (AttributeTypeCode c : AttributeTypeCode.values()) {
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
