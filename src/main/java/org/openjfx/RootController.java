/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Popup;
import org.system.Context;
import org.system.State_Collection;


/**
 * @author angkokleong
 */


/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */


public class RootController implements Initializable {

    @FXML
    private Label lblRootPersonDescription;

    @FXML
    private Button btnAddRootPerson;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblRootPersonDescription.setFont(new Font("Arial", 20));
    }

    @FXML
    void handleAddRootPersonEvent(ActionEvent event) {
        //change the application state after user key in information
        Context.getInstance().get_current_state_collection().Set_Current_State(State_Collection.State.ACTIVATED_STATE);
    }

}
