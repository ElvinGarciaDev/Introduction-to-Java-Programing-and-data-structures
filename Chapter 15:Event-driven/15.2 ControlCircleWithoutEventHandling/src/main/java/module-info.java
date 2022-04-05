module com.example.controlcirclewithouteventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlcirclewithouteventhandling to javafx.fxml;
    exports com.example.controlcirclewithouteventhandling;
}