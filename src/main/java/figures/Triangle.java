package figures;

import point.Point;

public class Triangle extends Figure {

    public Triangle(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 3) {
            return "The figure is invalid";
        }

        if (
            (this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
            && this.points.getPoints().get(0)[0] == this.points.getPoints().get(2)[0])
            || (this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
            && this.points.getPoints().get(0)[1] == this.points.getPoints().get(2)[1])
        ) {
            return "The figure is invalid";
        }
        return "The figure is valid";
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));
        double thirdSide = getSide(this.points.getPoints().get(2), this.points.getPoints().get(0));
        String stringP = getPerimeter();
        double perimeter = Double.parseDouble(stringP) / 2;

        double square = Math.sqrt(perimeter * (perimeter - firstSide)
                * (perimeter - secondSide) * (perimeter - thirdSide));

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));
        double thirdSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(2));

        double perimeter = firstSide + secondSide + thirdSide;

        return Double.toString(perimeter);
    }
}
