package com.example.snakes_and_ladders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Snakes and Ladders");
        // set images.jpg in resources as icon
        stage.getIcons().add(new Image("file:resources/images.jpg"));     
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch();
    }
}