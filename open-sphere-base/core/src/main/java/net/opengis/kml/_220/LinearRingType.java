//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.30 at 02:21:16 PM MDT 
//


package net.opengis.kml._220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearRingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearRingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}extrude" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}tessellate" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}altitudeModeGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}coordinates" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinearRingSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinearRingObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearRingType", propOrder = {
    "extrude",
    "tessellate",
    "altitudeModeGroup",
    "coordinates",
    "linearRingSimpleExtensionGroup",
    "linearRingObjectExtensionGroup"
})
public class LinearRingType
    extends AbstractGeometryType
{

    @XmlElement(defaultValue = "0")
    protected Boolean extrude;
    @XmlElement(defaultValue = "0")
    protected Boolean tessellate;
    @XmlElementRef(name = "altitudeModeGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false)
    protected JAXBElement<?> altitudeModeGroup;
    @XmlList
    protected List<String> coordinates;
    @XmlElement(name = "LinearRingSimpleExtensionGroup")
    protected List<Object> linearRingSimpleExtensionGroup;
    @XmlElement(name = "LinearRingObjectExtensionGroup")
    protected List<AbstractObjectType> linearRingObjectExtensionGroup;

    /**
     * Gets the value of the extrude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrude() {
        return extrude;
    }

    /**
     * Sets the value of the extrude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrude(Boolean value) {
        this.extrude = value;
    }

    public boolean isSetExtrude() {
        return (this.extrude!= null);
    }

    /**
     * Gets the value of the tessellate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTessellate() {
        return tessellate;
    }

    /**
     * Sets the value of the tessellate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTessellate(Boolean value) {
        this.tessellate = value;
    }

    public boolean isSetTessellate() {
        return (this.tessellate!= null);
    }

    /**
     * Gets the value of the altitudeModeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getAltitudeModeGroup() {
        return altitudeModeGroup;
    }

    /**
     * Sets the value of the altitudeModeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltitudeModeEnumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAltitudeModeGroup(JAXBElement<?> value) {
        this.altitudeModeGroup = value;
    }

    public boolean isSetAltitudeModeGroup() {
        return (this.altitudeModeGroup!= null);
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<String>();
        }
        return this.coordinates;
    }

    public boolean isSetCoordinates() {
        return ((this.coordinates!= null)&&(!this.coordinates.isEmpty()));
    }

    public void unsetCoordinates() {
        this.coordinates = null;
    }

    /**
     * Gets the value of the linearRingSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearRingSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearRingSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLinearRingSimpleExtensionGroup() {
        if (linearRingSimpleExtensionGroup == null) {
            linearRingSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.linearRingSimpleExtensionGroup;
    }

    public boolean isSetLinearRingSimpleExtensionGroup() {
        return ((this.linearRingSimpleExtensionGroup!= null)&&(!this.linearRingSimpleExtensionGroup.isEmpty()));
    }

    public void unsetLinearRingSimpleExtensionGroup() {
        this.linearRingSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the linearRingObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearRingObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearRingObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getLinearRingObjectExtensionGroup() {
        if (linearRingObjectExtensionGroup == null) {
            linearRingObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.linearRingObjectExtensionGroup;
    }

    public boolean isSetLinearRingObjectExtensionGroup() {
        return ((this.linearRingObjectExtensionGroup!= null)&&(!this.linearRingObjectExtensionGroup.isEmpty()));
    }

    public void unsetLinearRingObjectExtensionGroup() {
        this.linearRingObjectExtensionGroup = null;
    }

}
