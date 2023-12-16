package figures;

import point.Point;

import java.util.List;

public class Rectangle extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;
    public static int FOURTH_POINT = 3;
    public static int POINTS_SIZE = 4;

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

        return count == POINTS_SIZE;
    }

    @Override
    public String isValid() {
        if (this.points.getSize() != POINTS_SIZE) {
            return INVALID;
        }

        if (!isOnOneSide(points.getPoints())) {
            return INVALID;
        }

        return VALID;
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(Math.abs(firstPoint[0]) - Math.abs(secondPoint[0]), THIRD_POINT)
                + Math.pow(Math.abs(firstPoint[1]) - Math.abs(secondPoint[1]), THIRD_POINT));
    }

    @Override
    public String getSquare() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));

        double square = firstSide * secondSide;

        return Double.toString(square);
    }

    @Override
    public String getPerimeter() {
        double firstSide = getSide(this.points.getPoints().get(0), this.points.getPoints().get(1));
        double secondSide = getSide(this.points.getPoints().get(1), this.points.getPoints().get(THIRD_POINT));
        double thirdSide = getSide(this.points.getPoints().get(THIRD_POINT), this.points.getPoints().get(FOURTH_POINT));
        double fourthSide = getSide(this.points.getPoints().get(FOURTH_POINT), this.points.getPoints().get(0));


        double perimeter = firstSide + secondSide + thirdSide + fourthSide;

        return Double.toString(perimeter);
    }
}
