package figures;

import point.Point;

public class Triangle extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int POINTS_SIZE = 3;

    public Triangle(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        if (
            (this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
            && this.points.getPoints().get(0)[0] == this.points.getPoints().get(THIRD_POINT)[0])
            || (this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
            && this.points.getPoints().get(0)[1] == this.points.getPoints().get(THIRD_POINT)[1])
        ) {
            return INVALID;
        }
        return VALID;
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], THIRD_POINT) + Math.pow(firstPoint[1] - secondPoint[1], THIRD_POINT));
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));
        double thirdSide = getSide(this.points.getPoints().get(THIRD_POINT), this.points.getPoints().get(0));
        String stringP = getPerimeter();
        double perimeter = Double.parseDouble(stringP) / THIRD_POINT;

        double square = Math.sqrt(perimeter * (perimeter - firstSide)
                * (perimeter - secondSide) * (perimeter - thirdSide));

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));
        double thirdSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(THIRD_POINT));

        double perimeter = firstSide + secondSide + thirdSide;

        return Double.toString(perimeter);
    }
}
