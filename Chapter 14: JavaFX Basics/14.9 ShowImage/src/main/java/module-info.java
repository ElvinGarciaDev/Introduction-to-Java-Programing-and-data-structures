module com.example.showimage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.showimage to javafx.fxml;
    exports com.example.showimage;
}