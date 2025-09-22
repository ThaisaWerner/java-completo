package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Create three buttons
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");

        // Set actions for the buttons
        buttonA.setOnAction(e -> System.out.println("A"));
        buttonB.setOnAction(e -> System.out.println("B"));
        buttonC.setOnAction(e -> System.exit(0));

        // Arrange buttons in a horizontal box
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().addAll(buttonA, buttonB, buttonC);

        // Create a scene
        Scene scene = new Scene(box, 150, 100);

        //Place the cene in the stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
