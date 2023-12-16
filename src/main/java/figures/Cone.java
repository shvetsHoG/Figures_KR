package figures;

import point.Point;

public class Cone extends Figure {

    public Cone(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 3) {
            return "The figure is invalid";
        }

        if (
                !(this.points.getPoints().get(0)[2] == this.points.getPoints().get(1)[2])
                || (this.points.getPoints().get(0)[2] == this.points.getPoints().get(2)[2])
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
        double radius = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double side = getSide(this.points.getPoints().get(0), this.points.getPoints().get(2));

        double square = Math.PI * radius * (radius + side);

        return Double.toString(square);
    }

}
