//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.googlecode.sardine.model;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{DAV:}allprop"/>
 *         &lt;element ref="{DAV:}propname"/>
 *         &lt;element ref="{DAV:}prop"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "allprop",
//    "propname",
//    "prop"
//})
//@XmlRootElement(name = "propfind")
public class Propfind {

    protected Allprop allprop;
    protected Propname propname;
    protected Prop prop;

    /**
     * Gets the value of the allprop property.
     * 
     * @return
     *     possible object is
     *     {@link Allprop }
     *     
     */
    public Allprop getAllprop() {
        return allprop;
    }

    /**
     * Sets the value of the allprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allprop }
     *     
     */
    public void setAllprop(Allprop value) {
        this.allprop = value;
    }

    /**
     * Gets the value of the propname property.
     * 
     * @return
     *     possible object is
     *     {@link Propname }
     *     
     */
    public Propname getPropname() {
        return propname;
    }

    /**
     * Sets the value of the propname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Propname }
     *     
     */
    public void setPropname(Propname value) {
        this.propname = value;
    }

    /**
     * Gets the value of the prop property.
     * 
     * @return
     *     possible object is
     *     {@link Prop }
     *     
     */
    public Prop getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prop }
     *     
     */
    public void setProp(Prop value) {
        this.prop = value;
    }

}
