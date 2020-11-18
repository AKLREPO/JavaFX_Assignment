package org.family;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author angkokleong
 */

/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


@XmlRootElement
public class Address {

    private String street_number;
    private String street_name;
    private String suburb;
    private String postcode;

    public Address() {
    }

    @XmlElement
    public void Set_Street_Number(String new_street_number) {
        this.street_number = new_street_number;
    }

    public String Get_Street_Number() {
        return this.street_number;
    }

    @XmlElement
    public void Set_Street_Name(String new_street_name) {
        this.street_name = new_street_name;
    }

    public String Get_Street_Name() {
        return this.street_name;
    }

    @XmlElement
    public void Set_Suburb(String new_suburb) {
        this.suburb = new_suburb;
    }

    public String Get_Suburb() {
        return this.suburb;
    }

    @XmlElement
    public void Set_PostCode(String new_postcode) {
        this.postcode = new_postcode;
    }

    public String Get_PostCode() {
        return this.postcode;
    }
}
