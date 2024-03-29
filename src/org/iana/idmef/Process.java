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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Process complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Process"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="env" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Process", propOrder = { "name", "pid", "path", "arg", "env" })
public class Process implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = -4743785750304032702L;
    @XmlElement(required = true)
    protected String name;
    protected BigInteger pid;
    protected String path;
    protected List<String> arg;
    protected List<String> env;
    @XmlAttribute(name = "ident")
    protected String ident;
    
    /**
     * Gets the value of the name property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }
    
    /**
     * Gets the value of the pid property.
     * 
     * @return
     *         possible object is
     *         {@link BigInteger }
     * 
     */
    public BigInteger getPid() {
        return pid;
    }
    
    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *            allowed object is
     *            {@link BigInteger }
     * 
     */
    public void setPid(BigInteger value) {
        this.pid = value;
    }
    
    /**
     * Gets the value of the path property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Sets the value of the path property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setPath(String value) {
        this.path = value;
    }
    
    /**
     * Gets the value of the arg property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getArg().add(newItem);
     * </pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArg() {
        if (arg == null) {
            arg = new ArrayList<String>();
        }
        return this.arg;
    }
    
    /**
     * Gets the value of the env property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the env property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEnv().add(newItem);
     * </pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnv() {
        if (env == null) {
            env = new ArrayList<String>();
        }
        return this.env;
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
    
}
