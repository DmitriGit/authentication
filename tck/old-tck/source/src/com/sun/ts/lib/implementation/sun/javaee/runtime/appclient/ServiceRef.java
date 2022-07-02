//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.29 at 09:57:39 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.appclient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceRefName",
    "portInfo",
    "callProperty",
    "wsdlOverride",
    "serviceImplClass",
    "serviceQname"
})
@XmlRootElement(name = "service-ref")
public class ServiceRef
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "service-ref-name", required = true)
    protected String serviceRefName;
    @XmlElement(name = "port-info")
    protected List<PortInfo> portInfo;
    @XmlElement(name = "call-property")
    protected List<CallProperty> callProperty;
    @XmlElement(name = "wsdl-override")
    protected String wsdlOverride;
    @XmlElement(name = "service-impl-class")
    protected String serviceImplClass;
    @XmlElement(name = "service-qname")
    protected ServiceQname serviceQname;

    /**
     * Gets the value of the serviceRefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRefName() {
        return serviceRefName;
    }

    /**
     * Sets the value of the serviceRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRefName(String value) {
        this.serviceRefName = value;
    }

    /**
     * Gets the value of the portInfo property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the portInfo property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPortInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PortInfo }
     * 
     * 
     */
    public List<PortInfo> getPortInfo() {
        if (portInfo == null) {
            portInfo = new ArrayList<PortInfo>();
        }
        return this.portInfo;
    }

    /**
     * Gets the value of the callProperty property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the callProperty property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCallProperty().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CallProperty }
     * 
     * 
     */
    public List<CallProperty> getCallProperty() {
        if (callProperty == null) {
            callProperty = new ArrayList<CallProperty>();
        }
        return this.callProperty;
    }

    /**
     * Gets the value of the wsdlOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlOverride() {
        return wsdlOverride;
    }

    /**
     * Sets the value of the wsdlOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlOverride(String value) {
        this.wsdlOverride = value;
    }

    /**
     * Gets the value of the serviceImplClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceImplClass() {
        return serviceImplClass;
    }

    /**
     * Sets the value of the serviceImplClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceImplClass(String value) {
        this.serviceImplClass = value;
    }

    /**
     * Gets the value of the serviceQname property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQname }
     *     
     */
    public ServiceQname getServiceQname() {
        return serviceQname;
    }

    /**
     * Sets the value of the serviceQname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQname }
     *     
     */
    public void setServiceQname(ServiceQname value) {
        this.serviceQname = value;
    }

}