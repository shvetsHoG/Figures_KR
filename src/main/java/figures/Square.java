package figures;

import point.Point;

public class Square extends Figure {

    public Square(Point points) {
        super(points);
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 4) {
            return "The figure is invalid";
        }

        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));
        double thirdSide = getSide(this.points.getPoints().get(2), this.points.getPoints().get(3));
        double fourthSide = getSide(this.points.getPoints().get(3), this.points.getPoints().get(0));

        if (
                firstSide != secondSide
                && firstSide != thirdSide
                && firstSide != fourthSide
        ) {
            return "The figure is invalid";
        }
        return "The figure is valid";
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
        double perimeter = side * 4;

        return Double.toString(perimeter);
    }
}
