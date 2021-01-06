
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EndpointAccessType.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="EndpointAccessType"&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="Default"/&amp;gt; &amp;lt;enumeration value="Internet"/&amp;gt; &amp;lt;enumeration
 * value="Intranet"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "EndpointAccessType", namespace = "http://schemas.microsoft.com/xrm/2014/Contracts")
@XmlEnum
public enum EndpointAccessType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("Intranet")
    INTRANET("Intranet");
    private final String value;

    EndpointAccessType(String v) {
        value = v;
    }

    public static EndpointAccessType fromValue(String v) {
        for (EndpointAccessType c : EndpointAccessType.values()) {
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
