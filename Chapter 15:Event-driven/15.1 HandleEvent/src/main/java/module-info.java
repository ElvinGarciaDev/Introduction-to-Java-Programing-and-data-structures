module com.example.handleevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.handleevent to javafx.fxml;
    exports com.example.handleevent;
}