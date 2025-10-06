package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

//Box adjust in the layout, is flexible in width and height
//Square has fixed width and height
public class Square extends Rectangle {

    private static int i = 0;

    private String[] colors = {"#c33c5e", "#39aac6", "#28d79a", "#fb750e", "#6657a8", "#f9060e"};

    public Square() {
        this(100);
    }

    public Square(int size) {

        setWidth(size);
        setHeight(size);

        setFill(Color.web(colors[i]));

        i++;
        if(i == 6) i = 0;
    }
}
