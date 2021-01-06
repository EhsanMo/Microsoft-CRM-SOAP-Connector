
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BulkOperationSource.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="BulkOperationSource"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="QuickCampaign"/&amp;gt; &amp;lt;enumeration value="CampaignActivity"/&amp;gt;
 * &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "BulkOperationSource")
@XmlEnum
public enum BulkOperationSource {

    @XmlEnumValue("QuickCampaign")
    QUICK_CAMPAIGN("QuickCampaign"),
    @XmlEnumValue("CampaignActivity")
    CAMPAIGN_ACTIVITY("CampaignActivity");
    private final String value;

    BulkOperationSource(String v) {
        value = v;
    }

    public static BulkOperationSource fromValue(String v) {
        for (BulkOperationSource c : BulkOperationSource.values()) {
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
