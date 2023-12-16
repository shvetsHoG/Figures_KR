package figures;

import point.Point;

public class Circle extends Figure {

    public Circle(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 2) {
            return "The figure is invalid";
        }

        if (
                this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
        ) {
            return "The figure is invalid";
        }

        return "The figure is valid";
    }

    public double getSide() {
        int[] firstPoint = this.points.getPoints().get(0);
        int[] secondPoint = this.points.getPoints().get(1);
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public String getSquare() {
        double distance = getSide();
        double square = Math.PI * Math.pow(distance, 2);
        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double distance = getSide();
        double perimeter = distance * 2 * Math.PI;

        return Double.toString(perimeter);
    }
}
