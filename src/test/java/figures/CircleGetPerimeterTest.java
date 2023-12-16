package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class CircleGetPerimeterTest {

    @Test
    @DisplayName("first perimeter test")
    public void firstPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getPerimeter()))).isEqualTo("6,28");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {3, 4};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getPerimeter()))).isEqualTo("31,42");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {7, 2};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);

        points.setPoints(intPoints);

        Circle circle = new Circle(points);

        then(String.format("%.2f", Double.parseDouble(circle.getPerimeter()))).isEqualTo("45,74");
    }
}
