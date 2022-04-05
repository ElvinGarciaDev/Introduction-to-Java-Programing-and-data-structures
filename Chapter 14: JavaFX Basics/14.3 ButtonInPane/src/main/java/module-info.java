module com.example.buttoninpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttoninpane to javafx.fxml;
    exports com.example.buttoninpane;
}