package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TestAnchorPane extends AnchorPane {

    public TestAnchorPane() {

        Square s1 = new Square();
        setTopAnchor(s1, 10.0);
        setLeftAnchor(s1, 10.0);

        Square s2 = new Square();
        setTopAnchor(s2, 10.0);
        setRightAnchor(s2, 10.0);

        Square s3 = new Square();
        setBottomAnchor(s3, 10.0);
        setLeftAnchor(s3, 10.0);

        Square s4 = new Square();
        setBottomAnchor(s4, 10.0);
        setRightAnchor(s4, 10.0);

        // Center square, to do it with AnchorPane we need to use HBox or VBox, placing it in the center and the s5 inside HBox
        Square s5 = new Square();

        HBox centerBox = new HBox();
        centerBox.setAlignment(Pos.CENTER);
        setTopAnchor(centerBox, 110.0);
        setBottomAnchor(centerBox, 110.0);
        setLeftAnchor(centerBox, 110.0);
        setRightAnchor(centerBox, 110.0);
        centerBox.getChildren().add(s5);

        getChildren().addAll(s1, s2, s3, s4, centerBox);
    }
}
