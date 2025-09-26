package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TestStackPane extends StackPane {

    public TestStackPane() {

        Box b1 = new Box().withText("1");
        Box b2 = new Box().withText("2");
        Box b3 = new Box().withText("3");
        Box b4 = new Box().withText("4");
        Box b5 = new Box().withText("5");
        Box b6 = new Box().withText("6");

        getChildren().addAll(b2, b3, b4, b5, b6, b1);

        setOnMouseClicked(e -> {
            if(e.getSceneX() > getScene().getWidth() / 2) {
                getChildren().get(0).toFront(); // Move the first box to the front
            } else {
                getChildren().get(5).toBack(); // Move the last box to the back
            }
        });

        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);

                    Platform.runLater(() -> {
                        getChildren().get(0).toFront();
                    }); // Run on the JavaFX Application Thread. Without this, it will throw an exception and the thread will not run
                } catch (Exception e) {
                }
            }
        });

        t.setDaemon(true); //If the main thread (application) ends, this thread will end too
        t.start();
    }
}
