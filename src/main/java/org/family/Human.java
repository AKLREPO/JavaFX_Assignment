package org.family;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author angkokleong
 */
public class Human {
    
    private String first_name;
    private String birth_name;
    private String surname_after_marriage;
    
    public enum Relationship_Type{
        GRANDPARENT, FATHER, MOTHER, UNCLE, AUNT
    }

    public enum Gender_Type {
        MALE, FEMALE
    }
    private Gender_Type gender; 
    private Address address;
    private int Age;
    private String life_description;
    
    
    private HashMap<Relationship_Type, Human> immediate_relatives_list;
    private Human father;
    private Human mother;
    private Human spouse;
    private ArrayList<Human> children_list;
    private ArrayList<Human> grandchildren_list;
    
    public Human(){
        this.immediate_relatives_list = new HashMap<Relationship_Type, Human>();
        this.children_list = new ArrayList<Human>();
        this.grandchildren_list = new ArrayList<Human>();
    }
    
    public void Set_First_Name(String new_first_name){
        this.first_name = new_first_name;
    }
    
    public String Get_First_Name(){
        return this.first_name;
    }
    
    public void Set_Birth_Name(String new_birth_name){
        this.birth_name = new_birth_name;
    } 
    
    public String Get_Birth_Name(){
        return this.birth_name;
    }
    
    public void Set_Surname_After_Marriage(String new_surname_after_marriage){
        this.surname_after_marriage = new_surname_after_marriage;
    }
    
    public String Get_Surname_After_Marriage(){
        return this.surname_after_marriage;
    }
    
    public void Set_Gender(Gender_Type new_gender){
        this.gender = new_gender;
    }
    
    public Gender_Type Get_Gender(){
        return this.gender;
    }
    
    public void Set_Address(Address new_address){
        this.address = new_address;
    }
    
    public Address Get_Address(){
        return this.address;
    }
    
    public String Get_Life_Description(){
        return this.life_description;
    }
    
    public void Set_Life_Description(String new_life_description){
        this.life_description = new_life_description;
    }
    
    public void Set_Father(Human new_father){
        this.father = new_father;
    }
    
    public Human Get_Father(){
        return this.father;
    }
    
    public Human Get_Mother(){
        return this.mother;
    }
    
    public void Set_Mother(Human new_mother){
        this.mother = new_mother;
    }
    
    public void Set_Spouse(Human new_spouse){
        this.spouse = new_spouse;
    }
    
    public Human Get_Spouse(){
        return this.spouse;
    }
    
    public HashMap<Relationship_Type, Human> Get_Immediate_Relatives_List(){
        return this.immediate_relatives_list;
    }
    
    public boolean Add_Immediate_Relatives_List(Relationship_Type relation, Human new_relatives){
        this.immediate_relatives_list.put(relation, new_relatives);
        return true;
    }
    
    public void Remove_Immediate_Relatives(Human new_relatives){
        this.immediate_relatives_list.remove(new_relatives);
    }
    
    public void List_Immediate_Relatives_List(){
        this.immediate_relatives_list.forEach((relationship, value) -> {
            
        });
    }
    
    public boolean Add_Children(Human new_children){
        for(Human e: this.children_list){
            if(e.equals(new_children))
                return false;
        }
        
        this.children_list.add(new_children);
        return true;
    }
    
    public void Remove_Children(Human new_children){
        this.children_list.remove(new_children);
    }
    
    public boolean Add_GrandChildren(Human new_grandchildren){
        
        
        this.grandchildren_list.add(new_grandchildren);
        return true;
    }
    
    public void Remove_Grandchildren(Human new_grandchildren){
        this.grandchildren_list.remove(new_grandchildren);
    }
    
}
