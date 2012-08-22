//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.22 at 05:08:24 PM MESZ 
//


package ch.ech.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/4}organisationMailAddressInfoType"/>
 *           &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/4}personMailAddressInfoType"/>
 *         &lt;/choice>
 *         &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/4}addressInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailAddressType", propOrder = {
    "organisation",
    "person",
    "addressInformation"
})
public class MailAddressType {

    protected OrganisationMailAddressInfoType organisation;
    protected PersonMailAddressInfoType person;
    @XmlElement(required = true)
    protected AddressInformationType addressInformation;

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public OrganisationMailAddressInfoType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public void setOrganisation(OrganisationMailAddressInfoType value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public PersonMailAddressInfoType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public void setPerson(PersonMailAddressInfoType value) {
        this.person = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

}