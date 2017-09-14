//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 11:09:23 AM CEST 
//


package org.iana.idmef;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reference-origin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reference-origin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="vendor-specific"/>
 *     &lt;enumeration value="user-specific"/>
 *     &lt;enumeration value="bugtraqid"/>
 *     &lt;enumeration value="cve"/>
 *     &lt;enumeration value="osvdb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reference-origin")
@XmlEnum
public enum ReferenceOrigin {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vendor-specific")
    VENDOR_SPECIFIC("vendor-specific"),
    @XmlEnumValue("user-specific")
    USER_SPECIFIC("user-specific"),
    @XmlEnumValue("bugtraqid")
    BUGTRAQID("bugtraqid"),
    @XmlEnumValue("cve")
    CVE("cve"),
    @XmlEnumValue("osvdb")
    OSVDB("osvdb");
    private final String value;

    ReferenceOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceOrigin fromValue(String v) {
        for (ReferenceOrigin c: ReferenceOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
