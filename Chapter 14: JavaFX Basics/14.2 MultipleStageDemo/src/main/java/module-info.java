module com.example.multiplestagedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiplestagedemo to javafx.fxml;
    exports com.example.multiplestagedemo;
}