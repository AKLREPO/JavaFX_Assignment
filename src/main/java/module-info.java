module main {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;

    requires java.xml.bind;
    requires java.xml;


}
