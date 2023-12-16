package figures;

import point.Point;

public class Circle extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;

    public Circle(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != THIRD_POINT) {
            return INVALID;
        }

        if (
                this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
        ) {
            return INVALID;
        }

        return VALID;
    }

    public double getSide() {
        int[] firstPoint = this.points.getPoints().get(0);
        int[] secondPoint = this.points.getPoints().get(1);
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], THIRD_POINT) + Math.pow(firstPoint[1] - secondPoint[1], THIRD_POINT));
    }

    @Override
    public String getSquare() {
        double distance = getSide();
        double square = Math.PI * Math.pow(distance, THIRD_POINT);
        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double distance = getSide();
        double perimeter = distance * 2 * Math.PI;

        return Double.toString(perimeter);
    }
}
