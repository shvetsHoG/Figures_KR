package figures;

import point.Point;

public class Figure {

    public static String FIGURE = "The figure is figure";
    public static String NO_AREA = "The figure has no area";
    public static String NO_PERIMETER = "The figure has no perimeter";

    public Point points;
    public String isValid() {
        return FIGURE;
    }

    public String getSquare() {
        return NO_AREA;
    }

    public String getPerimeter() {
        return NO_PERIMETER;
    }

    public Figure(Point points) {
        this.points = points;
    }
}
