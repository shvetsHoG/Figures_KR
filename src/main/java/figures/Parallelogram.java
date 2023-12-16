package figures;

import point.Point;

public class Parallelogram extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int FOURTH_POINT = 3;
    public static int POINTS_SIZE = 4;

    public Parallelogram(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE && isNotOnOneSIde()) {
            return INVALID;
        }
        return VALID;
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], THIRD_POINT) + Math.pow(firstPoint[1] - secondPoint[1], THIRD_POINT));
    }

    public boolean isNotOnOneSIde() {
        if ((this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
                && this.points.getPoints().get(0)[0] == this.points.getPoints().get(THIRD_POINT)[0]
                && this.points.getPoints().get(0)[0] == this.points.getPoints().get(FOURTH_POINT)[0])
                || (this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(THIRD_POINT)[1]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(FOURTH_POINT)[1])
        ) {

        }
        return true;
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(FOURTH_POINT));
        double height = this.points.getPoints().get(1)[1] - this.points.getPoints().get(0)[1];

        double square = firstSide * height;

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));

        double perimeter = (firstSide + secondSide) * THIRD_POINT;

        return Double.toString(perimeter);
    }
}
