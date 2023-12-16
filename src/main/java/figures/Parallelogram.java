package figures;

import point.Point;

public class Parallelogram extends Figure {

    public Parallelogram(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 4 && isNotOnOneSIde()) {
            return "The figure is invalid";
        }
        return "The figure is valid";
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    public boolean isNotOnOneSIde() {
        if ((this.points.getPoints().get(0)[0] == this.points.getPoints().get(1)[0]
                && this.points.getPoints().get(0)[0] == this.points.getPoints().get(2)[0]
                && this.points.getPoints().get(0)[0] == this.points.getPoints().get(3)[0])
                || (this.points.getPoints().get(0)[1] == this.points.getPoints().get(1)[1]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(2)[1]
                && this.points.getPoints().get(0)[1] == this.points.getPoints().get(3)[1])
        ) {

        }
        return true;
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(3));
        double height = this.points.getPoints().get(1)[1] - this.points.getPoints().get(0)[1];

        double square = firstSide * height;

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));

        double perimeter = (firstSide + secondSide) * 2;

        return Double.toString(perimeter);
    }
}
