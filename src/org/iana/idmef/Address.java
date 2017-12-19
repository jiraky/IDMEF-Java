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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Address complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="netmask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="category" type="{http://iana.org/idmef}address-category" default="unknown" /&gt;
 *       &lt;attribute name="vlan-name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vlan-num" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = { "address", "netmask" })
public class Address implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = -7820373924694011595L;
    @XmlElement(required = true)
    protected String address;
    protected String netmask;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "category")
    protected AddressCategory category;
    @XmlAttribute(name = "vlan-name")
    protected String vlanName;
    @XmlAttribute(name = "vlan-num")
    protected String vlanNum;
    
    /**
     * Gets the value of the address property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Sets the value of the address property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setAddress(String value) {
        this.address = value;
    }
    
    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNetmask() {
        return netmask;
    }
    
    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setNetmask(String value) {
        this.netmask = value;
    }
    
    /**
     * Gets the value of the ident property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getIdent() {
        if (ident == null) {
            return "0";
        }
        else {
            return ident;
        }
    }
    
    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setIdent(String value) {
        this.ident = value;
    }
    
    /**
     * Gets the value of the category property.
     * 
     * @return
     *         possible object is
     *         {@link AddressCategory }
     * 
     */
    public AddressCategory getCategory() {
        if (category == null) {
            return AddressCategory.UNKNOWN;
        }
        else {
            return category;
        }
    }
    
    /**
     * Sets the value of the category property.
     * 
     * @param value
     *            allowed object is
     *            {@link AddressCategory }
     * 
     */
    public void setCategory(AddressCategory value) {
        this.category = value;
    }
    
    /**
     * Gets the value of the vlanName property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getVlanName() {
        return vlanName;
    }
    
    /**
     * Sets the value of the vlanName property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setVlanName(String value) {
        this.vlanName = value;
    }
    
    /**
     * Gets the value of the vlanNum property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getVlanNum() {
        return vlanNum;
    }
    
    /**
     * Sets the value of the vlanNum property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setVlanNum(String value) {
        this.vlanNum = value;
    }
    
}
