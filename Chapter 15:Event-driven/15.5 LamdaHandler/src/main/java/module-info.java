module com.example.lamdahandler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lamdahandler to javafx.fxml;
    exports com.example.lamdahandler;
}