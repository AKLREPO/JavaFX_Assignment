package org.system;


/*
 *a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
 *javadoc and other comments giving useful low-level documentation and describing each component;
 *well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


import javafx.scene.control.TreeItem;

public class Family_Tree {

    private final static Family_Tree instance = new Family_Tree();

    public Family_Tree(){}

    public static Family_Tree getInstance() {
        return instance;
    }

    public TreeItem<String> Create_Family_Member(String name){
        return new TreeItem<String>(name);
    }


}
