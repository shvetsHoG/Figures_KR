package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class TriangleGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 1};
        int[] thirdPoint = new int[] {1, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Triangle triangle = new Triangle(points);

        then(String.format("%.2f", Double.parseDouble(triangle.getSquare()))).isEqualTo("0,50");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 7};
        int[] thirdPoint = new int[] {7, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Triangle triangle = new Triangle(points);

        then(String.format("%.2f", Double.parseDouble(triangle.getSquare()))).isEqualTo("24,50");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {9, 0};
        int[] thirdPoint = new int[] {0, 12};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Triangle triangle = new Triangle(points);

        then(String.format("%.2f", Double.parseDouble(triangle.getSquare()))).isEqualTo("54,00");
    }
}
