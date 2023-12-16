package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class TriangleGetPerimeterTest {
    @Test
    @DisplayName("first perimeter test")
    public void firstPerimeterTest(){
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

        then(String.format("%.2f", Double.parseDouble(triangle.getPerimeter()))).isEqualTo("3,41");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {3, 3};
        int[] secondPoint = new int[] {0, 3};
        int[] thirdPoint = new int[] {3, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Triangle triangle = new Triangle(points);

        then(String.format("%.2f", Double.parseDouble(triangle.getPerimeter()))).isEqualTo("10,24");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {-3, 0};
        int[] thirdPoint = new int[] {0, -3};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Triangle triangle = new Triangle(points);

        then(String.format("%.2f", Double.parseDouble(triangle.getPerimeter()))).isEqualTo("10,24");
    }
}
