
package org.sohagroup.crmconnector.domain.crm.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagedPropertyEvaluationPriority.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class. &lt;pre&gt;
 * &amp;lt;simpleType name="ManagedPropertyEvaluationPriority"&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt; &amp;lt;enumeration value="None"/&amp;gt; &amp;lt;enumeration
 * value="Low"/&amp;gt; &amp;lt;enumeration value="Normal"/&amp;gt; &amp;lt;enumeration value="High"/&amp;gt;
 * &amp;lt;enumeration value="Essential"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt; &lt;/pre&gt;
 */
@XmlType(name = "ManagedPropertyEvaluationPriority", namespace = "http://schemas.microsoft.com/xrm/2011/Metadata")
@XmlEnum
public enum ManagedPropertyEvaluationPriority {

  @XmlEnumValue("None")
  NONE("None"),
  @XmlEnumValue("Low")
  LOW("Low"),
  @XmlEnumValue("Normal")
  NORMAL("Normal"),
  @XmlEnumValue("High")
  HIGH("High"),
  @XmlEnumValue("Essential")
  ESSENTIAL("Essential");
  private final String value;

  ManagedPropertyEvaluationPriority(String v) {
    value = v;
  }

  public static ManagedPropertyEvaluationPriority fromValue(String v) {
    for (ManagedPropertyEvaluationPriority c : ManagedPropertyEvaluationPriority.values()) {
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
