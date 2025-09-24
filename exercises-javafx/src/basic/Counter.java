package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    private int counter = 0;

    private void updateNumberLabel(Label label) {
        label.setText(Integer.toString(counter));

        // Remove previous color styles
        label.getStyleClass().remove("green");
        label.getStyleClass().remove("red");

        if(counter > 0) {
            label.getStyleClass().add("green");
        } else if(counter < 0) {
            label.getStyleClass().add("red");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label titleLabel = new Label("Counter");
        //Get the style class "title" from the CSS file
        titleLabel.getStyleClass().add("title");

        Label numberLabel = new Label("0");
        numberLabel.getStyleClass().add("number");

        Button decrementButton = new Button("-");
        decrementButton.getStyleClass().add("buttons");
        decrementButton.setOnAction(e -> {
            counter--;
            //Call the method to update the number label color
            updateNumberLabel(numberLabel);
        });

        Button incrementButton = new Button("+");
        incrementButton.getStyleClass().add("buttons");
        incrementButton.setOnAction(e -> {
            counter++;
            updateNumberLabel(numberLabel);
        });

        //Arrange buttons in a horizontal box
        HBox buttonsBox = new HBox();
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(10);
        buttonsBox.getChildren().addAll(decrementButton, incrementButton);

        //Arrange all elements in a vertical box
        VBox contentBox = new VBox();
        contentBox.getStyleClass().add("content");
        contentBox.setSpacing(10);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.getChildren().addAll(titleLabel, numberLabel, buttonsBox);


        String cssPath = getClass().getResource("/basic/Counter.css").toExternalForm(); //Path to the CSS file
        //Create the scene and add the CSS file
        Scene primaryScene = new Scene(contentBox, 400, 400);
        primaryScene.getStylesheets().add(cssPath);
        primaryScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=SUSE+Mono:ital,wght@0,100..800;1,100..800");

        //Place the scene on the stage
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Counter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
