package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TestTilePane extends TilePane {

    public TestTilePane() {
        List<Square> squares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            squares.add(new Square(i * 10));
        }

        setPadding(new Insets(20, 10, 20, 10));
        setVgap(10);
        setHgap(10);

        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);

        getChildren().addAll(squares);
    }
}
