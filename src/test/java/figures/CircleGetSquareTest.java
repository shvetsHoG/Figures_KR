package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class CircleGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getSquare()))).isEqualTo("3,14");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {3, 12};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getSquare()))).isEqualTo("480,66");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {2, -3};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getSquare()))).isEqualTo("40,84");
    }
}
