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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Service complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Service"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="portlist" type="{http://iana.org/idmef}port-list"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SNMPService" type="{http://iana.org/idmef}SNMPService" minOccurs="0"/&gt;
 *         &lt;element name="WebService" type="{http://iana.org/idmef}WebService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="ip_version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="iana_protocol_number" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="iana_protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = { "content" })
public class Service implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = -1324492138474154409L;
    @XmlElementRefs({
            @XmlElementRef(name = "SNMPService", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "protocol", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "port", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "WebService", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "name", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "portlist", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false) })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "ip_version")
    protected BigInteger ipVersion;
    @XmlAttribute(name = "iana_protocol_number")
    protected BigInteger ianaProtocolNumber;
    @XmlAttribute(name = "iana_protocol_name")
    protected String ianaProtocolName;
    
    /**
     * Gets the rest of the content model.
     * 
     * 
     * You are getting this "catch-all" property because of the following
     * reason:
     * The field name "Port" is used by two different parts of a schema. See:
     * 
     * To get rid of this property, apply a property customization to one
     * of both of the following declarations to change their names:
     * Gets the value of the content property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content
     * property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link SNMPService }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link WebService }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String
     * }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
     * Gets the value of the ipVersion property.
     * 
     * @return
     *         possible object is
     *         {@link BigInteger }
     * 
     */
    public BigInteger getIpVersion() {
        return ipVersion;
    }
    
    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *            allowed object is
     *            {@link BigInteger }
     * 
     */
    public void setIpVersion(BigInteger value) {
        this.ipVersion = value;
    }
    
    /**
     * Gets the value of the ianaProtocolNumber property.
     * 
     * @return
     *         possible object is
     *         {@link BigInteger }
     * 
     */
    public BigInteger getIanaProtocolNumber() {
        return ianaProtocolNumber;
    }
    
    /**
     * Sets the value of the ianaProtocolNumber property.
     * 
     * @param value
     *            allowed object is
     *            {@link BigInteger }
     * 
     */
    public void setIanaProtocolNumber(BigInteger value) {
        this.ianaProtocolNumber = value;
    }
    
    /**
     * Gets the value of the ianaProtocolName property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getIanaProtocolName() {
        return ianaProtocolName;
    }
    
    /**
     * Sets the value of the ianaProtocolName property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setIanaProtocolName(String value) {
        this.ianaProtocolName = value;
    }
    
}
