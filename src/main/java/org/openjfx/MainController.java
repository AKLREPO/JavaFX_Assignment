package org.openjfx;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static java.util.Collections.list;

import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import org.family.Human;
import org.system.Context;
import org.system.Family_Tree;
import org.system.State_Collection;

/**
 * @author angkokleong
 */

/*
a beginning comment clearly stating title, author, date, file name, purpose and any assumptions or conditions on the form of input and expected output;
javadoc and other comments giving useful low-level documentation and describing each component;
well-formatted readable code with meaningful identifier names and blank lines between components (like methods and classes).
 */

public class MainController implements Initializable {

    private URL fxml_path;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label label;

    @FXML
    private Button btnLoadTree;

    @FXML
    private Button btnSaveTree;

    @FXML
    private HBox center;

    @FXML
    private VBox content;

    @FXML
    private TreeView<String> family_tree;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXMLLoader loader = new FXMLLoader();

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");


        //use the name in this TreeItem and then search the existing data
        TreeItem<String> family_members = new TreeItem<String>("Family Root");
        family_members.getChildren().add(new TreeItem<String>("TESTESTEST"));

        family_members.getChildren().add(new TreeItem<String>("SDSDSD"));
        family_members.getChildren().get(1).getChildren().add(new TreeItem<String>("SDSDSDWEWE"));

        family_members.getChildren().get(1).setExpanded(true);
        family_members.setExpanded(true);


        if(Context.getInstance().get_current_state_collection().Get_Current_State().equals(State_Collection.State.INITIAL_STATE)){
            //disable the Save Button
            btnSaveTree.setDisable(true);

            //set the view of the right content to root_person.fxml
            try {
                fxml_path = getClass().getResource("root_person.fxml");
                loader.setLocation(fxml_path);
                content = (VBox) loader.load();
                center.getChildren().add(content);
            }catch(IOException ex){
                //use apache log 4j 2 for logging

                //System.out.println("Error Occurred");
                System.out.println("Problem encountered from line 80 to 95");
                System.out.println("Function: initialize(), + Class: FXMLController");
                System.out.println(ex.getMessage());
            }
        }


        family_tree.setRoot(family_members);
        EventHandler<MouseEvent> mouseEventHandle = (MouseEvent event) -> {
            Node node = event.getPickResult().getIntersectedNode();
            // Accept clicks only on node cells, and not on empty spaces of the TreeView
            String name = (String) ((TreeItem) family_tree.getSelectionModel().getSelectedItem()).getValue();

            //get parent
            TreeItem<String> new_family_members = Family_Tree.getInstance().Create_Family_Member("asdasd");

            family_tree.getSelectionModel().getSelectedItem().getChildren().add(new_family_members);
            //list all child object in parent

            System.out.println(name);
            //https://stackoverflow.com/questions/15792090/javafx-treeview-item-action-event/26714930#26714930

            //when user click on the treeview, change the state in State_Collection 
            //search the data structure in Context for the other information that is matched to the data structure
        };
        family_tree.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEventHandle);
    }

    @FXML
    public void Click_Load_Tree_Button(ActionEvent event) {
        //load data from file to data structure
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        fileChooser.setInitialDirectory(new File("."));
        File file = fileChooser.showOpenDialog(borderPane.getScene().getWindow());
        if(file != null){
            //System class for load data method
            Context.getInstance().get_system_instance().Load_Data_From_File(file);
            Human family_tree = Context.getInstance().get_system_instance().Get_Family_Tree();
            //populate the data into TreeView
            //loop the arraylist
                //create an treeitem for each object
                //add the treeitem to the treeview
        }else{
            //show error message
            //using popup
            //Select file or directory
        }
    }

    @FXML
    public void Click_Save_Tree_Button(ActionEvent event) {
        //save file
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        fileChooser.setInitialDirectory(new File("."));
        File file = fileChooser.showOpenDialog(borderPane.getScene().getWindow());
        Context.getInstance().get_system_instance().Save_Data_To_File(file);
    }

    @FXML
    public void Click_Create_Tree_Button(ActionEvent event) {
        Context.getInstance().get_system_instance().Create_Family_Tree();
    }

}