package org.system;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;
import org.family.Human;
import javax.xml.*;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXB;

/**
 * @author angkokleong
 */


/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).



 */


public class System {

    private Human family_tree;

    public System() {}

    public void Create_Family_Tree() {
        this.family_tree = new Human();
    }

    public void Load_Data_From_File(File file_to_load) {
        try {
            //JAXB unmarshal = read file
            this.family_tree = JAXB.unmarshal(file_to_load, Human.class);

        } catch (Exception ex) { }
    }

    public void Save_Data_To_File(File file_to_save) {
        //JAXB marshal = write to file
        try{
            //extract every single element in TreeSet
            JAXB.marshal(this.family_tree, file_to_save);

        }catch(DataBindingException ex){

        }catch(Exception ex){

        }

    }

    public Human Get_Family_Tree(){
        return this.family_tree;
    }
}
