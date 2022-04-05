module com.example.showcirclecentered {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.showcirclecentered to javafx.fxml;
    exports com.example.showcirclecentered;
}