package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Loading css file
        String cssFile = getClass().getResource("/fxml/Login.css").toExternalForm();
        // Loading FXML file
        URL fxmlFile = getClass().getResource("/fxml/Login.fxml");
        GridPane root = FXMLLoader.load(fxmlFile);

        Scene scene = new Scene(root, 350, 400);
        scene.getStylesheets().add(cssFile);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
