package com.example.proiectse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import java.io.IOException;

public class MainScene extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getClassLoader().getResource("mainscene-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(new RadialGradient(0,0,0,0,1, true, CycleMethod.NO_CYCLE,
                new Stop(0, Color.web("#2c4053")), new Stop(1, Color.web("#3391d1"))));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
