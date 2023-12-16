package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class SphereGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {0, 1, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Sphere sphere = new Sphere(points);

        then(String.format("%.2f", Double.parseDouble(sphere.getSquare()))).isEqualTo("12,57");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {3, 12, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Sphere sphere = new Sphere(points);

        then(String.format("%.2f", Double.parseDouble(sphere.getSquare()))).isEqualTo("1922,65");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {-3, 0, 12};
        int[] secondPoint = new int[] {3, 12, 2};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Sphere sphere = new Sphere(points);

        then(String.format("%.2f", Double.parseDouble(sphere.getSquare()))).isEqualTo("3518,58");
    }
}
