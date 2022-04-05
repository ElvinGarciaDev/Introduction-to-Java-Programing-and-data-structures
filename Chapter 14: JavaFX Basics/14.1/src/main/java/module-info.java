module garcia.elvin.myjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens garcia.elvin.myjavafx to javafx.fxml;
    exports garcia.elvin.myjavafx;
}