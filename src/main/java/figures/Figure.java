package figures;

import point.Point;

public class Figure {
    public Point points;
    public String isValid() {
        return "The figure is figure";
    }

    public String getSquare() {
        return "The figure has no area";
    }

    public String getPerimeter() {
        return "The figure has no perimeter";
    }

    public Figure(Point points) {
        this.points = points;
    }
}
