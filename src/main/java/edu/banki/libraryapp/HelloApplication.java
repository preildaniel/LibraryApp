package edu.banki.libraryapp;

import javafx.scene.Scene;
import javafx.stage.Stage;import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createbook-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Könyvtár nyílvántartó");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}