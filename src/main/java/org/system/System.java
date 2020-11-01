package org.system;

import java.util.TreeSet;
import org.family.Human;

/**
 *
 * @author angkokleong
 */
public class System {
    
    
    private TreeSet<Human> family_tree;
    //save all data to binary file
    
    //load all data to system
    
    public System(){

    }
    
    public void Create_Family_Tree(){
        this.family_tree = new TreeSet<Human>();
    }
    
    
    
}
