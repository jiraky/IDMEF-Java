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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for AdditionalData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalData"&gt;
 *
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *
 *       &lt;choice&gt;
 *         &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="byte" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="character"&gt;
 *
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="date-time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="integer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ntpstamp" type="{http://iana.org/idmef}ntpstamp"/&gt;
 *         &lt;element name="portlist" type="{http://iana.org/idmef}port-list"/&gt;
 *         &lt;element name="real" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="byte-string" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *         &lt;element name="xml" type="{http://iana.org/idmef}xmltext"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="type" type="{http://iana.org/idmef}additionaldata-type" /&gt;
 *       &lt;attribute name="meaning" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalData", propOrder = { "_boolean", "_byte", "character", "dateTime", "integer", "ntpstamp",
        "portlist", "real", "string", "byteString", "xml" })
public class AdditionalData implements Serializable {
    
    /**
     * Generated Serial Version UID.
     */
    private static final long serialVersionUID = 8230454453990444024L;
    @XmlElement(name = "boolean")
    protected Boolean _boolean;
    @XmlElement(name = "byte")
    protected Byte _byte;
    protected String character;
    @XmlElement(name = "date-time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected BigInteger integer;
    protected String ntpstamp;
    @XmlList
    protected List<String> portlist;
    protected BigDecimal real;
    protected String string;
    @XmlElement(name = "byte-string", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] byteString;
    protected Xmltext xml;
    @XmlAttribute(name = "type")
    protected AdditionaldataType type;
    @XmlAttribute(name = "meaning")
    protected String meaning;
    
    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isBoolean() {
        return _boolean;
    }
    
    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *            allowed object is
     *            {@link Boolean }
     * 
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }
    
    /**
     * Gets the value of the byte property.
     * 
     * @return
     *         possible object is
     *         {@link Byte }
     * 
     */
    public Byte getByte() {
        return _byte;
    }
    
    /**
     * Sets the value of the byte property.
     * 
     * @param value
     *            allowed object is
     *            {@link Byte }
     * 
     */
    public void setByte(Byte value) {
        this._byte = value;
    }
    
    /**
     * Gets the value of the character property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCharacter() {
        return character;
    }
    
    /**
     * Sets the value of the character property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setCharacter(String value) {
        this.character = value;
    }
    
    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }
    
    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *            allowed object is
     *            {@link XMLGregorianCalendar }
     * 
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }
    
    /**
     * Gets the value of the integer property.
     * 
     * @return
     *         possible object is
     *         {@link BigInteger }
     * 
     */
    public BigInteger getInteger() {
        return integer;
    }
    
    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *            allowed object is
     *            {@link BigInteger }
     * 
     */
    public void setInteger(BigInteger value) {
        this.integer = value;
    }
    
    /**
     * Gets the value of the ntpstamp property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNtpstamp() {
        return ntpstamp;
    }
    
    /**
     * Sets the value of the ntpstamp property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setNtpstamp(String value) {
        this.ntpstamp = value;
    }
    
    /**
     * Gets the value of the portlist property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portlist
     * property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPortlist().add(newItem);
     * </pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * @return value of the portList property.
     */
    public List<String> getPortlist() {
        if (portlist == null) {
            portlist = new ArrayList<String>();
        }
        return this.portlist;
    }
    
    /**
     * Gets the value of the real property.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getReal() {
        return real;
    }
    
    /**
     * Sets the value of the real property.
     * 
     * @param value
     *            allowed object is
     *            {@link BigDecimal }
     * 
     */
    public void setReal(BigDecimal value) {
        this.real = value;
    }
    
    /**
     * Gets the value of the string property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getString() {
        return string;
    }
    
    /**
     * Sets the value of the string property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setString(String value) {
        this.string = value;
    }
    
    /**
     * Gets the value of the byteString property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public byte[] getByteString() {
        return byteString;
    }
    
    /**
     * Sets the value of the byteString property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setByteString(byte[] value) {
        this.byteString = value;
    }
    
    /**
     * Gets the value of the xml property.
     * 
     * @return
     *         possible object is
     *         {@link Xmltext }
     * 
     */
    public Xmltext getXml() {
        return xml;
    }
    
    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *            allowed object is
     *            {@link Xmltext }
     * 
     */
    public void setXml(Xmltext value) {
        this.xml = value;
    }
    
    /**
     * Gets the value of the type property.
     * 
     * @return
     *         possible object is
     *         {@link AdditionaldataType }
     * 
     */
    public AdditionaldataType getType() {
        return type;
    }
    
    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is
     *            {@link AdditionaldataType }
     * 
     */
    public void setType(AdditionaldataType value) {
        this.type = value;
    }
    
    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMeaning() {
        return meaning;
    }
    
    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setMeaning(String value) {
        this.meaning = value;
    }
    
}
