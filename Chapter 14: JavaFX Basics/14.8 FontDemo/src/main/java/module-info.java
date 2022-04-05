module com.example.fontdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fontdemo to javafx.fxml;
    exports com.example.fontdemo;
}