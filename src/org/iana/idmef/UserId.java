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
 * Java class for UserId complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserId"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="type" type="{http://iana.org/idmef}id-type" default="original-user" /&gt;
 *       &lt;attribute name="tty" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserId", propOrder = { "content" })
public class UserId implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = -4465870091337100978L;
    @XmlElementRefs({
            @XmlElementRef(name = "name", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "number", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false) })
    protected List<JAXBElement<? extends Serializable>> content;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "type")
    protected IdType type;
    @XmlAttribute(name = "tty")
    protected String tty;
    
    /**
     * Gets the rest of the content model.
     * 
     * 
     * You are getting this "catch-all" property because of the following
     * reason:
     * The field name "Number" is used by two different parts of a schema. See:
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
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
     * Gets the value of the type property.
     * 
     * @return
     *         possible object is
     *         {@link IdType }
     * 
     */
    public IdType getType() {
        if (type == null) {
            return IdType.ORIGINAL_USER;
        }
        else {
            return type;
        }
    }
    
    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is
     *            {@link IdType }
     * 
     */
    public void setType(IdType value) {
        this.type = value;
    }
    
    /**
     * Gets the value of the tty property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTty() {
        return tty;
    }
    
    /**
     * Sets the value of the tty property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setTty(String value) {
        this.tty = value;
    }
    
}
