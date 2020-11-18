/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.system;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author angkokleong
 */

/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


public class State_Collection {

    private State current_state;

    public enum State {
        INITIAL_STATE,
        ACTIVATED_STATE
    }

    public State_Collection() {
        current_state = State.INITIAL_STATE;
    }

    public void Set_Current_State(State new_current_state) {
        this.current_state = new_current_state;
    }

    public State Get_Current_State() {
        return this.current_state;
    }
}
