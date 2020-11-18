/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.system;

/**
 * @author angkokleong
 */

/*
*a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
*javadoc and other comments giving useful low-level documentation and describing each component;
*well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


public class Context {

    private final static Context instance = new Context();
    private System system_object = new System();
    private Family_Tree family_tree_object = new Family_Tree();
    private State_Collection state_collection = new State_Collection();

    public static Context getInstance() {
        return instance;
    }

    public State_Collection get_current_state_collection() {
        return state_collection;
    }

    public System get_system_instance() {
        return system_object;
    }

    public Family_Tree get_family_tree_instance(){return family_tree_object;}
}
