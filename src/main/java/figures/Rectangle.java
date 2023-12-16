package figures;

import point.Point;

import java.util.List;

public class Rectangle extends Figure {

    public Rectangle(Point points) {
        super(points);
    }

    public boolean isOnOneSide (List<int[]> points) {
        int count = 0;

        for (int i = 0; i < points.size(); i++) {

            boolean flagForX = false;
            boolean flagForY = false;
            for (int j = 0; j < points.size(); j++) {
                if (i == j) {
                    continue;
                }

                if (points.get(i)[0] == points.get(j)[0]) {
                    flagForX = true;
                }

                if (points.get(i)[1] == points.get(j)[1]) {
                    flagForY = true;
                }
            }

            if (flagForX && flagForY) {
                count++;
            }
        }

        return count == 4;
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != 4) {
            return "The figure is invalid";
        }

        if (!isOnOneSide(points.getPoints())) {
            return "The figure is invalid";
        }

        return "The figure is valid";
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(Math.abs(firstPoint[0]) - Math.abs(secondPoint[0]), 2)
                + Math.pow(Math.abs(firstPoint[1]) - Math.abs(secondPoint[1]), 2));
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));

        double square = firstSide * secondSide;

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(2));
        double thirdSide = getSide(this.points.getPoints().get(2), this.points.getPoints().get(3));
        double fourthSide = getSide(this.points.getPoints().get(3), this.points.getPoints().get(0));


        double perimeter = firstSide + secondSide + thirdSide + fourthSide;

        return Double.toString(perimeter);
    }
}
