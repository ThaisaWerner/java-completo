package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Testing VBox with Box and Square
//        VBox temp = new VBox();
//        temp.getChildren().add(new Box().withText("Box 1"));
//        temp.getChildren().add(new Box().withText("Box 2"));
//        temp.getChildren().add(new Box().withText("Box 3"));
//        temp.getChildren().add(new Box().withText("Box 4"));
//        temp.getChildren().add(new Box().withText("Box 5"));
//        temp.getChildren().add(new Box().withText("Box 6"));
//        temp.getChildren().add(new Box().withText("Box 7"));

//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());
//        temp.getChildren().add(new Square());

//        Scene mainScene = new Scene(temp, 800, 600);

//        primaryStage.setScene(mainScene);

        // Testing AnchorPane
//        Scene mainScene = new Scene(new TestAnchorPane(), 800, 600);

        // Testing BorderPane
//        Scene mainScene = new Scene(new TestBorderPane(), 800, 600);

        // Testing FlowPane
//        Scene mainScene = new Scene(new TestFlowPane(), 800, 600);

        // Testing GridPane
        Scene mainScene = new Scene(new TestGridPane(), 800, 600);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Layout Managers");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
