package org.family;

/**
 *
 * @author angkokleong
 */
public class Address {
    
    private String street_number;
    private String street_name;
    private String suburb;
    private String postcode;
    
    public Address(){}
    
    public void Set_Street_Number(String new_street_number){
        this.street_number = new_street_number;
    }
    
    public String Get_Street_Number(){
        return this.street_number;
    }
    
    public void Set_Street_Name(String new_street_name){
        this.street_name = new_street_name;
    }
    
    public String Get_Street_Name(){
        return this.street_name;
    }
    
    public void Set_Suburb(String new_suburb){
        this.suburb = new_suburb;
    }
    
    public String Get_Suburb(){
        return this.suburb;
    }
    
    public void Set_PostCode(String new_postcode){
        this.postcode = new_postcode;
    }
    
    public String Get_PostCode(){
        return this.postcode;
    }
}
