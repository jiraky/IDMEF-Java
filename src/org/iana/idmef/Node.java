//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.iana.idmef;

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
 * <p>Java class for Node complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Node">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Address" type="{http://iana.org/idmef}Address"/>
 *         &lt;/choice>
 *         &lt;element name="Address" type="{http://iana.org/idmef}Address" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ident" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="category" type="{http://iana.org/idmef}node-category" default="unknown" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node", propOrder = {
    "content"
})
public class Node {

    @XmlElementRefs({
        @XmlElementRef(name = "location", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Address", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://iana.org/idmef", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "ident")
    protected String ident;
    @XmlAttribute(name = "category")
    protected NodeCategory category;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Address" is used by two different parts of a schema. See: 
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
     *     {@link NodeCategory }
     *     
     */
    public NodeCategory getCategory() {
        if (category == null) {
            return NodeCategory.UNKNOWN;
        } else {
            return category;
        }
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeCategory }
     *     
     */
    public void setCategory(NodeCategory value) {
        this.category = value;
    }
    
    /**
     * Returns the IP address if the content is instance of Address class.
     * @return IP address in String format
     * @see org.iana.idmef.Address
     */
    public String getAddress() {
        String ip_address = null;
        
        List<JAXBElement<?>> node_element = this.getContent();
        if (node_element != null && !node_element.isEmpty()) {
            Object node_object = node_element.get(0).getValue();
            if (node_object instanceof Address)
                ip_address = ((Address) node_object).getAddress();
        }
        
        return ip_address;
    }

}