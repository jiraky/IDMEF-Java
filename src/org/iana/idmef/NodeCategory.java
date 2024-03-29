/**
 * IDMEF Package for JAVA
 * 
 * License Notice
 * 
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 * 
 * Copyright Notice
 *
 * Edits and bug-fixes:
 * Copyright (c) 2017 Mattia Zago. All rights reserved.
 *
 * Auto-generated files:
 * This file was generated by the JavaTM Architecture for XML Binding(JAXB)
 * Reference Implementation, v2.2.8-b130911.1802
 * See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
 *
 * IDMEF Schema:
 * Copyright (c) 2008 IETF Trust and the persons identified as the
 * IDMEF document authors. All rights reserved.
 * See https://tools.ietf.org/html/bcp78 for the complete license
 * document.
 *
 * @author Mattia Zago - dev [at] zagomattia [dot] it
 * @version 0.0.1
 * @since 14/09/2017
 */

package org.iana.idmef;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for node-category.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="node-category"&gt;
 *
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ads"/&gt;
 *     &lt;enumeration value="afs"/&gt;
 *     &lt;enumeration value="coda"/&gt;
 *     &lt;enumeration value="dfs"/&gt;
 *     &lt;enumeration value="dns"/&gt;
 *     &lt;enumeration value="hosts"/&gt;
 *     &lt;enumeration value="kerberos"/&gt;
 *     &lt;enumeration value="nds"/&gt;
 *     &lt;enumeration value="nis"/&gt;
 *     &lt;enumeration value="nisplus"/&gt;
 *     &lt;enumeration value="nt"/&gt;
 *     &lt;enumeration value="wfw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "node-category")
@XmlEnum
public enum NodeCategory implements Serializable {
    
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"), @XmlEnumValue("ads")
    ADS("ads"), @XmlEnumValue("afs")
    AFS("afs"), @XmlEnumValue("coda")
    CODA("coda"), @XmlEnumValue("dfs")
    DFS("dfs"), @XmlEnumValue("dns")
    DNS("dns"), @XmlEnumValue("hosts")
    HOSTS("hosts"), @XmlEnumValue("kerberos")
    KERBEROS("kerberos"), @XmlEnumValue("nds")
    NDS("nds"), @XmlEnumValue("nis")
    NIS("nis"), @XmlEnumValue("nisplus")
    NISPLUS("nisplus"), @XmlEnumValue("nt")
    NT("nt"), @XmlEnumValue("wfw")
    WFW("wfw");
    private final String value;
    
    NodeCategory(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static NodeCategory fromValue(String v) {
        for (NodeCategory c : NodeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
