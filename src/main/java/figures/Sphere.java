package figures;

import point.Point;

public class Sphere extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int POINTS_SIZE = 2;

    public Sphere(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        if (
                this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
                && this.points.getPoints().get(0)[THIRD_POINT] == this.points.getPoints().get(1)[THIRD_POINT]
        ) {
            return INVALID;
        }

        return VALID;
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], THIRD_POINT)
                + Math.pow(firstPoint[1] - secondPoint[1], THIRD_POINT)
                + Math.pow(firstPoint[THIRD_POINT] - secondPoint[THIRD_POINT], THIRD_POINT));
    }

    @Override
    public String getSquare() {
        double side = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));

        double square = 4 * Math.PI * Math.pow(side, 2);

        return Double.toString(square);
    }

}
