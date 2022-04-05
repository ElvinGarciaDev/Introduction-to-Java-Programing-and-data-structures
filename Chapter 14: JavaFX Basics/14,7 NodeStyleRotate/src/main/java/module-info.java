module com.example.nodestylerotatedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nodestylerotatedemo to javafx.fxml;
    exports com.example.nodestylerotatedemo;
}