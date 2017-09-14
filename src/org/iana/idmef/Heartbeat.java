//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 11:09:23 AM CEST 
//


package org.iana.idmef;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Heartbeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Heartbeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Analyzer" type="{http://iana.org/idmef}Analyzer"/>
 *         &lt;element name="CreateTime" type="{http://iana.org/idmef}TimeWithNtpstamp"/>
 *         &lt;element name="HeartbeatInterval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AnalyzerTime" type="{http://iana.org/idmef}TimeWithNtpstamp" minOccurs="0"/>
 *         &lt;element name="AdditionalData" type="{http://iana.org/idmef}AdditionalData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="messageid" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Heartbeat", propOrder = {
    "analyzer",
    "createTime",
    "heartbeatInterval",
    "analyzerTime",
    "additionalData"
})
public class Heartbeat {

    @XmlElement(name = "Analyzer", required = true)
    protected Analyzer analyzer;
    @XmlElement(name = "CreateTime", required = true)
    protected TimeWithNtpstamp createTime;
    @XmlElement(name = "HeartbeatInterval")
    protected BigInteger heartbeatInterval;
    @XmlElement(name = "AnalyzerTime")
    protected TimeWithNtpstamp analyzerTime;
    @XmlElement(name = "AdditionalData")
    protected List<AdditionalData> additionalData;
    @XmlAttribute(name = "messageid")
    protected String messageid;

    /**
     * Gets the value of the analyzer property.
     * 
     * @return
     *     possible object is
     *     {@link Analyzer }
     *     
     */
    public Analyzer getAnalyzer() {
        return analyzer;
    }

    /**
     * Sets the value of the analyzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Analyzer }
     *     
     */
    public void setAnalyzer(Analyzer value) {
        this.analyzer = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeWithNtpstamp }
     *     
     */
    public TimeWithNtpstamp getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeWithNtpstamp }
     *     
     */
    public void setCreateTime(TimeWithNtpstamp value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the heartbeatInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * Sets the value of the heartbeatInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeartbeatInterval(BigInteger value) {
        this.heartbeatInterval = value;
    }

    /**
     * Gets the value of the analyzerTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeWithNtpstamp }
     *     
     */
    public TimeWithNtpstamp getAnalyzerTime() {
        return analyzerTime;
    }

    /**
     * Sets the value of the analyzerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeWithNtpstamp }
     *     
     */
    public void setAnalyzerTime(TimeWithNtpstamp value) {
        this.analyzerTime = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData }
     * 
     * 
     */
    public List<AdditionalData> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<AdditionalData>();
        }
        return this.additionalData;
    }

    /**
     * Gets the value of the messageid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageid() {
        if (messageid == null) {
            return "0";
        } else {
            return messageid;
        }
    }

    /**
     * Sets the value of the messageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageid(String value) {
        this.messageid = value;
    }

}
