module com.example.showcircle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.showcircle to javafx.fxml;
    exports com.example.showcircle;
}