package com.example.showimage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        // ImageView is a Node used for painting images loaded with Images

        // Image = photograph

        // ImageView = picture frame

        // Create a pane to hold the image views
        Pane pane = new HBox(10); // HBox is a pane that places all nodes horizontally in one row
        pane.setPadding(new Insets(5, 5, 5, 5));

        // Create image
        Image image = new Image("http://liveexample.pearsoncmg.com/book/image/us.gif");

        // Create a new ImageView(frame) and add the image. Also add the ImageView to the pane
        pane.getChildren().add(new ImageView(image));

        // Create a second imahe
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);

        // Create a scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}