package figures;

import point.Point;

public class Cone extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int POINTS_SIZE = 3;

    public Cone(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        if (
                !(this.points.getPoints().get(0)[THIRD_POINT] == this.points.getPoints().get(1)[THIRD_POINT])
                || (this.points.getPoints().get(0)[THIRD_POINT] == this.points.getPoints().get(THIRD_POINT)[THIRD_POINT])
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
        double radius = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double side = getSide(this.points.getPoints().get(0), this.points.getPoints().get(THIRD_POINT));

        double square = Math.PI * radius * (radius + side);

        return Double.toString(square);
    }

}
