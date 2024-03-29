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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WebService complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WebService"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;sequence&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="cgi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="http-method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebService", propOrder = { "url", "cgi", "httpMethod", "arg" })
public class WebService implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = -8853622445602660797L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected String cgi;
    @XmlElement(name = "http-method")
    protected String httpMethod;
    protected List<String> arg;
    
    /**
     * Gets the value of the url property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * Sets the value of the url property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setUrl(String value) {
        this.url = value;
    }
    
    /**
     * Gets the value of the cgi property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCgi() {
        return cgi;
    }
    
    /**
     * Sets the value of the cgi property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setCgi(String value) {
        this.cgi = value;
    }
    
    /**
     * Gets the value of the httpMethod property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getHttpMethod() {
        return httpMethod;
    }
    
    /**
     * Sets the value of the httpMethod property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setHttpMethod(String value) {
        this.httpMethod = value;
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
    
}
