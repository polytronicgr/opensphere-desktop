//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.26 at 02:04:22 PM MST 
//


package net.opengis.gml._311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AesheticCriteriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AesheticCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIN_CROSSINGS"/>
 *     &lt;enumeration value="MIN_AREA"/>
 *     &lt;enumeration value="MIN_BENDS"/>
 *     &lt;enumeration value="MAX_BENDS"/>
 *     &lt;enumeration value="UNIFORM_BENDS"/>
 *     &lt;enumeration value="MIN_SLOPES"/>
 *     &lt;enumeration value="MIN_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_EDGE_LENGTH"/>
 *     &lt;enumeration value="UNIFORM_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_ANGULAR_RESOLUTION"/>
 *     &lt;enumeration value="MIN_ASPECT_RATIO"/>
 *     &lt;enumeration value="MAX_SYMMETRIES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AesheticCriteriaType")
@XmlEnum
public enum AesheticCriteriaType {

    MIN_CROSSINGS,
    MIN_AREA,
    MIN_BENDS,
    MAX_BENDS,
    UNIFORM_BENDS,
    MIN_SLOPES,
    MIN_EDGE_LENGTH,
    MAX_EDGE_LENGTH,
    UNIFORM_EDGE_LENGTH,
    MAX_ANGULAR_RESOLUTION,
    MIN_ASPECT_RATIO,
    MAX_SYMMETRIES;

    public String value() {
        return name();
    }

    public static AesheticCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}
