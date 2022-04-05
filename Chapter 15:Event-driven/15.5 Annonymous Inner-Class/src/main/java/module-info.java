module com.example.annonymousinnerclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.annonymousinnerclass to javafx.fxml;
    exports com.example.annonymousinnerclass;
}