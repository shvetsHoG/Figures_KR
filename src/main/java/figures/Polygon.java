package figures;

import point.Point;

public class Polygon extends Figure {

    public static String INVALID = "The figure is invalid";
    public static String VALID = "The figure is valid";
    public static int THIRD_POINT = 2;

    public Polygon(Point points) {
        super(points);
    }

    @Override
    public String isValid() {
        if (!isOnOneSide()) {
            return INVALID;
        }
        return VALID;
    }

    public double getSide(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], THIRD_POINT) + Math.pow(firstPoint[1] - secondPoint[1], THIRD_POINT));
    }

    public boolean isOnOneSide() {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < points.getSize(); i++) {
            if (points.getPoints().get(0)[0] == points.getPoints().get(i)[0]) {
                countX++;
            }

            if (points.getPoints().get(0)[1] == points.getPoints().get(i)[1]) {
                countY++;
            }
        }

        if (countX == points.getSize() || countY == points.getSize()) {
            return false;
        }
        return true;
    }


    @Override
    public String getSquare() {
        int n = this.points.getSize();

        double summ = 0;

        for (int i = 0; i < n - 1; i++) {
            summ += this.points.getPoints().get(i)[0] * this.points.getPoints().get(i+1)[1];
        }

        summ += this.points.getPoints().get(n-1)[0] * this.points.getPoints().get(0)[1];

        for (int i = 1; i < n; i++) {
            summ -= this.points.getPoints().get(i)[0] * this.points.getPoints().get(i-1)[1];
        }

        summ -= this.points.getPoints().get(0)[0] * this.points.getPoints().get(n-1)[1];

        summ *= 0.5;

        if (summ > 0) {
            return Double.toString(summ);
        } else {
            return Double.toString(-summ);
        }
    }

    @Override
    public String getPerimeter() {
        int size = this.points.getSize();
        double[] sides = new double[size];

        for (int i = 1; i < size; i++) {
            sides[i - 1] = getSide(this.points.getPoints().get(i - 1), this.points.getPoints().get(i));
        }

        sides[size - 1] = getSide(this.points.getPoints().get(0), this.points.getPoints().get(size - 1));

        double perimeter = 0;

        for (int i = 0; i < size; i++) {
            perimeter += sides[i];
        }

        return Double.toString(perimeter);
    }
}
