module Assignment_02 {
    
    requires javafx.fxml;
    requires javafx.controls;
    
    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}
