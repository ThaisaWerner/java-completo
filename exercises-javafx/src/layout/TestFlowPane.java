package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane {

    public TestFlowPane() {
        Square s1 = new Square();
        Square s2 = new Square();
        Square s3 = new Square();
        Square s4 = new Square();
        Square s5 = new Square();

        setHgap(10); // horizontal gap between elements
        setVgap(10); // vertical gap between elements
        setPadding(new Insets(10)); // padding around the pane

        setOrientation(Orientation.VERTICAL); // Puts elements in a vertical column, default is horizontal
        setAlignment(Pos.CENTER_RIGHT);

        getChildren().addAll(s1, s2, s3, s4, s5);
    }
}
