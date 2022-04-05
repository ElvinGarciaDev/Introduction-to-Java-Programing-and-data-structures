package com.example.handleevent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        // Create a pane and set it's properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);

        // Button
        Button btOK = new Button("OK");

        // second button
        Button btCancel = new Button("Cancel");

        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);

        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);

        // Add to pane
        pane.getChildren().addAll(btCancel, btOK);


        Scene scene = new Scene(pane);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}