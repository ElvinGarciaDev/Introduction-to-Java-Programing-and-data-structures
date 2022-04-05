package com.example.buttoninpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws IOException {
        // Create a scene
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("ok"));
        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("Button in a pane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}