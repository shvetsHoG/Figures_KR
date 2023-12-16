package figures;

import point.Point;

public class Cylinder extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int POINTS_SIZE = 3;

    public Cylinder(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        if (
                !(this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0])
                || (this.points.getPoints().get(0)[THIRD_POINT] == this.points.getPoints().get(THIRD_POINT)[THIRD_POINT])
                || !(this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1])
                || (!(this.points.getPoints().get(THIRD_POINT)[THIRD_POINT] == this.points.getPoints().get(0)[THIRD_POINT])
                && !(this.points.getPoints().get(THIRD_POINT)[THIRD_POINT] == this.points.getPoints().get(1)[THIRD_POINT]))
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
        double height = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double radius;
        if (this.points.getPoints().get(THIRD_POINT)[THIRD_POINT] == this.points.getPoints().get(1)[THIRD_POINT]) {
            radius = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));
        } else {
            radius = getSide(this.points.getPoints().get(0), this.points.getPoints().get(THIRD_POINT));
        }

        double square = 2 * radius * Math.PI * (radius + height);

        return Double.toString(square);
    }
}
