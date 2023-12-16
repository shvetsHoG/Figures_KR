package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class ConeGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {1, 0, 0};
        int[] thirdPoint = new int[] {0, 0, 1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cone cone = new Cone(points);

        then(String.format("%.2f", Double.parseDouble(cone.getSquare()))).isEqualTo("6,28");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 3, 0};
        int[] secondPoint = new int[] {-7, 3, 0};
        int[] thirdPoint = new int[] {0, 3, 8};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cone cone = new Cone(points);

        then(String.format("%.2f", Double.parseDouble(cone.getSquare()))).isEqualTo("329,87");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 24, 0};
        int[] secondPoint = new int[] {15, 24, 0};
        int[] thirdPoint = new int[] {0, 24, 28};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cone cone = new Cone(points);

        then(String.format("%.2f", Double.parseDouble(cone.getSquare()))).isEqualTo("2026,33");
    }
}
