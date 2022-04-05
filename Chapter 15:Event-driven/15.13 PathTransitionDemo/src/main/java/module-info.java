module com.example.pathtransitiondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pathtransitiondemo to javafx.fxml;
    exports com.example.pathtransitiondemo;
}