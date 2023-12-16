package figures;

import point.Point;

public class Square extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int FOURTH_POINT = 3;
    public static int POINTS_SIZE = 4;

    public Square(Point points) {
        super(points);
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));
        double thirdSide = getSide(this.points.getPoints().get(THIRD_POINT), this.points.getPoints().get(FOURTH_POINT));
        double fourthSide = getSide(this.points.getPoints().get(FOURTH_POINT), this.points.getPoints().get(0));

        if (
                firstSide != secondSide
                && firstSide != thirdSide
                && firstSide != fourthSide
        ) {
            return INVALID;
        }
        return VALID;
    }

    @Override
    public String getSquare() {
        double side = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double square = Math.pow(side, 2);

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double side = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double perimeter = side * POINTS_SIZE;

        return Double.toString(perimeter);
    }
}
