
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConditionOperator.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ConditionOperator"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Equal"/&amp;gt; &amp;lt;enumeration value="NotEqual"/&amp;gt; &amp;lt;enumeration
 * value="GreaterThan"/&amp;gt; &amp;lt;enumeration value="LessThan"/&amp;gt; &amp;lt;enumeration
 * value="GreaterEqual"/&amp;gt; &amp;lt;enumeration value="LessEqual"/&amp;gt; &amp;lt;enumeration
 * value="Like"/&amp;gt; &amp;lt;enumeration value="NotLike"/&amp;gt; &amp;lt;enumeration value="In"/&amp;gt;
 * &amp;lt;enumeration value="NotIn"/&amp;gt; &amp;lt;enumeration value="Between"/&amp;gt; &amp;lt;enumeration
 * value="NotBetween"/&amp;gt; &amp;lt;enumeration value="Null"/&amp;gt; &amp;lt;enumeration value="NotNull"/&amp;gt;
 * &amp;lt;enumeration value="Yesterday"/&amp;gt; &amp;lt;enumeration value="Today"/&amp;gt; &amp;lt;enumeration
 * value="Tomorrow"/&amp;gt; &amp;lt;enumeration value="Last7Days"/&amp;gt; &amp;lt;enumeration
 * value="Next7Days"/&amp;gt; &amp;lt;enumeration value="LastWeek"/&amp;gt; &amp;lt;enumeration
 * value="ThisWeek"/&amp;gt; &amp;lt;enumeration value="NextWeek"/&amp;gt; &amp;lt;enumeration
 * value="LastMonth"/&amp;gt; &amp;lt;enumeration value="ThisMonth"/&amp;gt; &amp;lt;enumeration
 * value="NextMonth"/&amp;gt; &amp;lt;enumeration value="On"/&amp;gt; &amp;lt;enumeration value="OnOrBefore"/&amp;gt;
 * &amp;lt;enumeration value="OnOrAfter"/&amp;gt; &amp;lt;enumeration value="LastYear"/&amp;gt; &amp;lt;enumeration
 * value="ThisYear"/&amp;gt; &amp;lt;enumeration value="NextYear"/&amp;gt; &amp;lt;enumeration
 * value="LastXHours"/&amp;gt; &amp;lt;enumeration value="NextXHours"/&amp;gt; &amp;lt;enumeration
 * value="LastXDays"/&amp;gt; &amp;lt;enumeration value="NextXDays"/&amp;gt; &amp;lt;enumeration
 * value="LastXWeeks"/&amp;gt; &amp;lt;enumeration value="NextXWeeks"/&amp;gt; &amp;lt;enumeration
 * value="LastXMonths"/&amp;gt; &amp;lt;enumeration value="NextXMonths"/&amp;gt; &amp;lt;enumeration
 * value="LastXYears"/&amp;gt; &amp;lt;enumeration value="NextXYears"/&amp;gt; &amp;lt;enumeration
 * value="EqualUserId"/&amp;gt; &amp;lt;enumeration value="NotEqualUserId"/&amp;gt; &amp;lt;enumeration
 * value="EqualBusinessId"/&amp;gt; &amp;lt;enumeration value="NotEqualBusinessId"/&amp;gt; &amp;lt;enumeration
 * value="ChildOf"/&amp;gt; &amp;lt;enumeration value="Mask"/&amp;gt; &amp;lt;enumeration value="NotMask"/&amp;gt;
 * &amp;lt;enumeration value="MasksSelect"/&amp;gt; &amp;lt;enumeration value="Contains"/&amp;gt; &amp;lt;enumeration
 * value="DoesNotContain"/&amp;gt; &amp;lt;enumeration value="EqualUserLanguage"/&amp;gt; &amp;lt;enumeration
 * value="NotOn"/&amp;gt; &amp;lt;enumeration value="OlderThanXMonths"/&amp;gt; &amp;lt;enumeration
 * value="BeginsWith"/&amp;gt; &amp;lt;enumeration value="DoesNotBeginWith"/&amp;gt; &amp;lt;enumeration
 * value="EndsWith"/&amp;gt; &amp;lt;enumeration value="DoesNotEndWith"/&amp;gt; &amp;lt;enumeration
 * value="ThisFiscalYear"/&amp;gt; &amp;lt;enumeration value="ThisFiscalPeriod"/&amp;gt; &amp;lt;enumeration
 * value="NextFiscalYear"/&amp;gt; &amp;lt;enumeration value="NextFiscalPeriod"/&amp;gt; &amp;lt;enumeration
 * value="LastFiscalYear"/&amp;gt; &amp;lt;enumeration value="LastFiscalPeriod"/&amp;gt; &amp;lt;enumeration
 * value="LastXFiscalYears"/&amp;gt; &amp;lt;enumeration value="LastXFiscalPeriods"/&amp;gt; &amp;lt;enumeration
 * value="NextXFiscalYears"/&amp;gt; &amp;lt;enumeration value="NextXFiscalPeriods"/&amp;gt; &amp;lt;enumeration
 * value="InFiscalYear"/&amp;gt; &amp;lt;enumeration value="InFiscalPeriod"/&amp;gt; &amp;lt;enumeration
 * value="InFiscalPeriodAndYear"/&amp;gt; &amp;lt;enumeration value="InOrBeforeFiscalPeriodAndYear"/&amp;gt;
 * &amp;lt;enumeration value="InOrAfterFiscalPeriodAndYear"/&amp;gt; &amp;lt;enumeration value="EqualUserTeams"/&amp;gt;
 * &amp;lt;enumeration value="EqualUserOrUserTeams"/&amp;gt; &amp;lt;enumeration value="Under"/&amp;gt;
 * &amp;lt;enumeration value="NotUnder"/&amp;gt; &amp;lt;enumeration value="UnderOrEqual"/&amp;gt; &amp;lt;enumeration
 * value="Above"/&amp;gt; &amp;lt;enumeration value="AboveOrEqual"/&amp;gt; &amp;lt;enumeration
 * value="EqualUserOrUserHierarchy"/&amp;gt; &amp;lt;enumeration value="EqualUserOrUserHierarchyAndTeams"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ConditionOperator", namespace = "http://schemas.microsoft.com/xrm/2011/Contracts")
@XmlEnum
public enum ConditionOperator {

    @XmlEnumValue("Equal")
    EQUAL("Equal"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterEqual")
    GREATER_EQUAL("GreaterEqual"),
    @XmlEnumValue("LessEqual")
    LESS_EQUAL("LessEqual"),
    @XmlEnumValue("Like")
    LIKE("Like"),
    @XmlEnumValue("NotLike")
    NOT_LIKE("NotLike"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("NotIn")
    NOT_IN("NotIn"),
    @XmlEnumValue("Between")
    BETWEEN("Between"),
    @XmlEnumValue("NotBetween")
    NOT_BETWEEN("NotBetween"),
    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("NotNull")
    NOT_NULL("NotNull"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),
    @XmlEnumValue("Last7Days")
    LAST_7_DAYS("Last7Days"),
    @XmlEnumValue("Next7Days")
    NEXT_7_DAYS("Next7Days"),
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),
    @XmlEnumValue("ThisWeek")
    THIS_WEEK("ThisWeek"),
    @XmlEnumValue("NextWeek")
    NEXT_WEEK("NextWeek"),
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),
    @XmlEnumValue("ThisMonth")
    THIS_MONTH("ThisMonth"),
    @XmlEnumValue("NextMonth")
    NEXT_MONTH("NextMonth"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("OnOrBefore")
    ON_OR_BEFORE("OnOrBefore"),
    @XmlEnumValue("OnOrAfter")
    ON_OR_AFTER("OnOrAfter"),
    @XmlEnumValue("LastYear")
    LAST_YEAR("LastYear"),
    @XmlEnumValue("ThisYear")
    THIS_YEAR("ThisYear"),
    @XmlEnumValue("NextYear")
    NEXT_YEAR("NextYear"),
    @XmlEnumValue("LastXHours")
    LAST_X_HOURS("LastXHours"),
    @XmlEnumValue("NextXHours")
    NEXT_X_HOURS("NextXHours"),
    @XmlEnumValue("LastXDays")
    LAST_X_DAYS("LastXDays"),
    @XmlEnumValue("NextXDays")
    NEXT_X_DAYS("NextXDays"),
    @XmlEnumValue("LastXWeeks")
    LAST_X_WEEKS("LastXWeeks"),
    @XmlEnumValue("NextXWeeks")
    NEXT_X_WEEKS("NextXWeeks"),
    @XmlEnumValue("LastXMonths")
    LAST_X_MONTHS("LastXMonths"),
    @XmlEnumValue("NextXMonths")
    NEXT_X_MONTHS("NextXMonths"),
    @XmlEnumValue("LastXYears")
    LAST_X_YEARS("LastXYears"),
    @XmlEnumValue("NextXYears")
    NEXT_X_YEARS("NextXYears"),
    @XmlEnumValue("EqualUserId")
    EQUAL_USER_ID("EqualUserId"),
    @XmlEnumValue("NotEqualUserId")
    NOT_EQUAL_USER_ID("NotEqualUserId"),
    @XmlEnumValue("EqualBusinessId")
    EQUAL_BUSINESS_ID("EqualBusinessId"),
    @XmlEnumValue("NotEqualBusinessId")
    NOT_EQUAL_BUSINESS_ID("NotEqualBusinessId"),
    @XmlEnumValue("ChildOf")
    CHILD_OF("ChildOf"),
    @XmlEnumValue("Mask")
    MASK("Mask"),
    @XmlEnumValue("NotMask")
    NOT_MASK("NotMask"),
    @XmlEnumValue("MasksSelect")
    MASKS_SELECT("MasksSelect"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("EqualUserLanguage")
    EQUAL_USER_LANGUAGE("EqualUserLanguage"),
    @XmlEnumValue("NotOn")
    NOT_ON("NotOn"),
    @XmlEnumValue("OlderThanXMonths")
    OLDER_THAN_X_MONTHS("OlderThanXMonths"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("DoesNotBeginWith")
    DOES_NOT_BEGIN_WITH("DoesNotBeginWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("DoesNotEndWith")
    DOES_NOT_END_WITH("DoesNotEndWith"),
    @XmlEnumValue("ThisFiscalYear")
    THIS_FISCAL_YEAR("ThisFiscalYear"),
    @XmlEnumValue("ThisFiscalPeriod")
    THIS_FISCAL_PERIOD("ThisFiscalPeriod"),
    @XmlEnumValue("NextFiscalYear")
    NEXT_FISCAL_YEAR("NextFiscalYear"),
    @XmlEnumValue("NextFiscalPeriod")
    NEXT_FISCAL_PERIOD("NextFiscalPeriod"),
    @XmlEnumValue("LastFiscalYear")
    LAST_FISCAL_YEAR("LastFiscalYear"),
    @XmlEnumValue("LastFiscalPeriod")
    LAST_FISCAL_PERIOD("LastFiscalPeriod"),
    @XmlEnumValue("LastXFiscalYears")
    LAST_X_FISCAL_YEARS("LastXFiscalYears"),
    @XmlEnumValue("LastXFiscalPeriods")
    LAST_X_FISCAL_PERIODS("LastXFiscalPeriods"),
    @XmlEnumValue("NextXFiscalYears")
    NEXT_X_FISCAL_YEARS("NextXFiscalYears"),
    @XmlEnumValue("NextXFiscalPeriods")
    NEXT_X_FISCAL_PERIODS("NextXFiscalPeriods"),
    @XmlEnumValue("InFiscalYear")
    IN_FISCAL_YEAR("InFiscalYear"),
    @XmlEnumValue("InFiscalPeriod")
    IN_FISCAL_PERIOD("InFiscalPeriod"),
    @XmlEnumValue("InFiscalPeriodAndYear")
    IN_FISCAL_PERIOD_AND_YEAR("InFiscalPeriodAndYear"),
    @XmlEnumValue("InOrBeforeFiscalPeriodAndYear")
    IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR("InOrBeforeFiscalPeriodAndYear"),
    @XmlEnumValue("InOrAfterFiscalPeriodAndYear")
    IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR("InOrAfterFiscalPeriodAndYear"),
    @XmlEnumValue("EqualUserTeams")
    EQUAL_USER_TEAMS("EqualUserTeams"),
    @XmlEnumValue("EqualUserOrUserTeams")
    EQUAL_USER_OR_USER_TEAMS("EqualUserOrUserTeams"),
    @XmlEnumValue("Under")
    UNDER("Under"),
    @XmlEnumValue("NotUnder")
    NOT_UNDER("NotUnder"),
    @XmlEnumValue("UnderOrEqual")
    UNDER_OR_EQUAL("UnderOrEqual"),
    @XmlEnumValue("Above")
    ABOVE("Above"),
    @XmlEnumValue("AboveOrEqual")
    ABOVE_OR_EQUAL("AboveOrEqual"),
    @XmlEnumValue("EqualUserOrUserHierarchy")
    EQUAL_USER_OR_USER_HIERARCHY("EqualUserOrUserHierarchy"),
    @XmlEnumValue("EqualUserOrUserHierarchyAndTeams")
    EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS("EqualUserOrUserHierarchyAndTeams");
    private final String value;

    ConditionOperator(String v) {
        value = v;
    }

    public static ConditionOperator fromValue(String v) {
        for (ConditionOperator c : ConditionOperator.values()) {
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
