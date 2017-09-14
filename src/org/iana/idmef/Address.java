//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 11:09:23 AM CEST 
//


package org.iana.idmef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netmask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="category" type="{http://iana.org/idmef}address-category" default="unknown" />
 *       &lt;attribute name="vlan-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vlan-num" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "address",
    "netmask"
})
public class Address {

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
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetmask() {
        return netmask;
    }

    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetmask(String value) {
        this.netmask = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        if (ident == null) {
            return "0";
        } else {
            return ident;
        }
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCategory }
     *     
     */
    public AddressCategory getCategory() {
        if (category == null) {
            return AddressCategory.UNKNOWN;
        } else {
            return category;
        }
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCategory }
     *     
     */
    public void setCategory(AddressCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the vlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanName() {
        return vlanName;
    }

    /**
     * Sets the value of the vlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanName(String value) {
        this.vlanName = value;
    }

    /**
     * Gets the value of the vlanNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanNum() {
        return vlanNum;
    }

    /**
     * Sets the value of the vlanNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanNum(String value) {
        this.vlanNum = value;
    }

}
