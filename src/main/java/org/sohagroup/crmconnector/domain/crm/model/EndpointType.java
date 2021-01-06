
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EndpointType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="EndpointType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="OrganizationService"/&amp;gt; &amp;lt;enumeration value="OrganizationDataService"/&amp;gt;
 * &amp;lt;enumeration value="WebApplication"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlType(name = "EndpointType", namespace = "http://schemas.microsoft.com/xrm/2014/Contracts")
@XmlEnum
public enum EndpointType {

    @XmlEnumValue("OrganizationService")
    ORGANIZATION_SERVICE("OrganizationService"),
    @XmlEnumValue("OrganizationDataService")
    ORGANIZATION_DATA_SERVICE("OrganizationDataService"),
    @XmlEnumValue("WebApplication")
    WEB_APPLICATION("WebApplication");
    private final String value;

    EndpointType(String v) {
        value = v;
    }

    public static EndpointType fromValue(String v) {
        for (EndpointType c : EndpointType.values()) {
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
