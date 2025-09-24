package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TestGridPane extends GridPane {

    public TestGridPane() {

        Box b1 = new Box().withText("1");
        Box b2 = new Box().withText("2");
        Box b3 = new Box().withText("3");
        Box b4 = new Box().withText("4");
        Box b5 = new Box().withText("5");
        Box b6 = new Box().withText("6");

        setGridLinesVisible(true); // Set the grid lines to visible to be seen

        // Creating the columns in the grid, each cc() is a column with 20% of the width
        getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
        // Creating the rows in the grid, each rc() is a row with 20% of the height
        getRowConstraints().addAll(rc(), rc(), frc(), rc(), rc());

        // Setting the gap between the boxes and the padding of the grid
        setVgap(10);
        setHgap(10);

        // Adding the boxes to the grid, the parameters are (node, columnIndex, rowIndex, colspan (how many columns will take), rowspan (how many rows will take))
        add(b1, 0, 0, 2, 2);// b1 will span 2 columns and 1 row
        add(b2, 1, 1, 2, 2);// b2 will span 2 columns and 2 rows, but it will be under b1 in one spot
        add(b3, 4, 2, 1, 3);
        add(b4, 3, 1);
        add(b5, 0, 4, 2, 1);
        add(b6, 3, 3);
    }

    // How the columns and rows will behave when the window is resized
    // Can be created a constrain for each column and row
    private ColumnConstraints cc() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20); // Each column will take 20% of the width
        cc.setFillWidth(true); // The column will fill the width available
        return cc;
    }

    // Fixed size column constraint, so when I use it, the column will have a fixed size, and the rest of the columns will adjust
    private ColumnConstraints fcc() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setMinWidth(50);
        cc.setMaxWidth(50);
        cc.setFillWidth(true); // The column will fill the width available
        return cc;
    }

    private RowConstraints rc() {
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20); // Each row will take 20% of the height
        rc.setFillHeight(true); // The row will fill the height available
        return rc;
    }

    // Fixed size row constraint, so when I use it, the row will have a fixed size, and the rest of the rows will adjust
    private RowConstraints frc() {
        RowConstraints rc = new RowConstraints();
        rc.setMinHeight(20);
        rc.setMaxHeight(20);
        rc.setFillHeight(true); // The row will fill the height available
        return rc;
    }
}
