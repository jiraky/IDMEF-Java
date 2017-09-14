//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 11:09:23 AM CEST 
//


package org.iana.idmef;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SNMPService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SNMPService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageProcessingModel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="securityModel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="securityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contextName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextEngineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNMPService", propOrder = {
    "oid",
    "messageProcessingModel",
    "securityModel",
    "securityName",
    "securityLevel",
    "contextName",
    "contextEngineID",
    "command"
})
public class SNMPService {

    protected String oid;
    protected BigInteger messageProcessingModel;
    protected BigInteger securityModel;
    protected String securityName;
    protected BigInteger securityLevel;
    protected String contextName;
    protected String contextEngineID;
    protected String command;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the messageProcessingModel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageProcessingModel() {
        return messageProcessingModel;
    }

    /**
     * Sets the value of the messageProcessingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageProcessingModel(BigInteger value) {
        this.messageProcessingModel = value;
    }

    /**
     * Gets the value of the securityModel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecurityModel() {
        return securityModel;
    }

    /**
     * Sets the value of the securityModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecurityModel(BigInteger value) {
        this.securityModel = value;
    }

    /**
     * Gets the value of the securityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityName() {
        return securityName;
    }

    /**
     * Sets the value of the securityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityName(String value) {
        this.securityName = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecurityLevel(BigInteger value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextName(String value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the contextEngineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextEngineID() {
        return contextEngineID;
    }

    /**
     * Sets the value of the contextEngineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextEngineID(String value) {
        this.contextEngineID = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

}
