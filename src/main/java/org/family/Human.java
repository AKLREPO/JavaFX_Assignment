package org.family;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author angkokleong
 */


/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


@XmlRootElement
@XmlType(propOrder = {})
public class Human {

    private String first_name;
    private String birth_name;
    private String surname_after_marriage;

    @XmlEnum
    public enum Relationship_Type {
        GRANDPARENT, FATHER, MOTHER, WIFE ,UNCLE, AUNT, COUSIN, BROTHER, SISTER, SON , DAUGHTER, GRANDCHILDREN
    }

    @XmlEnum
    public enum Gender_Type {
        MALE, FEMALE
    }

    private Relationship_Type relationship;
    private Gender_Type gender;
    private Address address;
    private int Age;
    private String life_description;


    private Human father;
    private Human mother;
    private Human spouse;
    private HashMap<Relationship_Type, ArrayList<Human>> immediate_relatives_list;
    private ArrayList<Human> children_list;
    private ArrayList<Human> grandchildren_list;

    public Human() {
        this.immediate_relatives_list = new HashMap<Relationship_Type, ArrayList<Human>>();
        this.children_list = new ArrayList<Human>();
        this.grandchildren_list = new ArrayList<Human>();
    }

    @XmlElement
    public void Set_First_Name(String new_first_name) {
        this.first_name = new_first_name;
    }

    public String Get_First_Name() {
        return this.first_name;
    }

    @XmlElement
    public void Set_Birth_Name(String new_birth_name) {
        this.birth_name = new_birth_name;
    }

    public String Get_Birth_Name() {
        return this.birth_name;
    }

    @XmlElement
    public void Set_Surname_After_Marriage(String new_surname_after_marriage) {
        this.surname_after_marriage = new_surname_after_marriage;
    }

    public String Get_Surname_After_Marriage() {
        return this.surname_after_marriage;
    }

    @XmlElement
    public void Set_Gender(Gender_Type new_gender) {
        this.gender = new_gender;
    }

    public Gender_Type Get_Gender() {
        return this.gender;
    }

    @XmlElement
    public void Set_Address(Address new_address) {
        this.address = new_address;
    }

    public Address Get_Address() {
        return this.address;
    }

    public String Get_Life_Description() {
        return this.life_description;
    }

    @XmlElement
    public void Set_Life_Description(String new_life_description) {
        this.life_description = new_life_description;
    }

    @XmlElement
    public void Set_Father(Human new_father) {
        this.father = new_father;
    }


    public Human Get_Father() {
        return this.father;
    }

    public Human Get_Mother() {
        return this.mother;
    }

    @XmlElement
    public void Set_Mother(Human new_mother) {
        this.mother = new_mother;
    }

    @XmlElement
    public void Set_Spouse(Human new_spouse) {
        this.spouse = new_spouse;
    }

    public Human Get_Spouse() {
        return this.spouse;
    }

    public HashMap<Relationship_Type, ArrayList<Human>> Get_Immediate_Relatives_List() {
        return this.immediate_relatives_list;
    }

    @XmlElementWrapper(name = "immediateRelativeList")
    @XmlElement
    public void Set_Immediate_Relatives_List(HashMap<Relationship_Type, ArrayList<Human>> new_immediate_relatives_list){
        this.immediate_relatives_list = new_immediate_relatives_list;
    }

    public boolean Add_Immediate_Relatives_List(Relationship_Type relation, Human new_relatives) {
        if(!this.immediate_relatives_list.get(relation).contains(new_relatives)){
            this.immediate_relatives_list.get(relation).add(new_relatives);
            return true;
        }
        return false;
    }

    public void Remove_Immediate_Relatives(Relationship_Type relation, Human new_relatives) {
        if(this.immediate_relatives_list.get(relation).contains(new_relatives)){
            this.immediate_relatives_list.get(relation).remove(new_relatives);
        }
    }

    public void List_Immediate_Relatives_List() {
        this.immediate_relatives_list.forEach((relationship, value) -> {

        });
    }

    public boolean Add_Children(Human new_children) {
        if(!this.children_list.contains(new_children)){
            this.children_list.add(new_children);
            return true;
        }
        return false;
    }

    public void Remove_Children(Human new_children) {
        if(this.children_list.contains(new_children)){
            this.children_list.remove(new_children);
        }
    }

    @XmlElementWrapper(name = "childrenList")
    @XmlElement
    public void Set_Children_List(ArrayList<Human> new_children_list){
        this.children_list = new_children_list;
    }


    public boolean Add_GrandChildren(Human new_grandchildren) {
        if(!this.grandchildren_list.contains(new_grandchildren)){
            this.grandchildren_list.add(new_grandchildren);
            return true;
        }
        return false;
    }

    public void Remove_Grandchildren(Human new_grandchildren) {
        if(this.grandchildren_list.contains(new_grandchildren)){
            this.grandchildren_list.remove(new_grandchildren);
        }
    }

    @XmlElementWrapper(name = "grandchildrenList")
    @XmlElement
    public void Set_GrandChildren_List(ArrayList<Human> new_grandchildren_list){
        this.grandchildren_list = new_grandchildren_list;
    }


}
