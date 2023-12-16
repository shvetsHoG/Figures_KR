package figures;

import point.Point;

public class Cylinder extends Figure {

    public Cylinder(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 3) {
            return "The figure is invalid";
        }

        if (
                !(this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0])
                || (this.points.getPoints().get(0)[2] == this.points.getPoints().get(2)[2])
                || !(this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1])
                || (!(this.points.getPoints().get(2)[2] == this.points.getPoints().get(0)[2])
                && !(this.points.getPoints().get(2)[2] == this.points.getPoints().get(1)[2]))
        ) {
            return "The figure is invalid";
        }

        return "The figure is valid";
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2)
                + Math.pow(firstPoint[1] - secondPoint[1], 2)
                + Math.pow(firstPoint[2] - secondPoint[2], 2));
    }


    @Override
    public String getSquare() {
        double height = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double radius;
        if (this.points.getPoints().get(2)[2] == this.points.getPoints().get(1)[2]) {
            radius = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));
        } else {
            radius = getSide(this.points.getPoints().get(0), this.points.getPoints().get(2));
        }

        double square = 2 * radius * Math.PI * (radius + height);

        return Double.toString(square);
    }
}
