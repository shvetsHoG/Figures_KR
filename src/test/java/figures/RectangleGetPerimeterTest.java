package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class RectangleGetPerimeterTest {
    @Test
    @DisplayName("first perimeter test")
    public void firstPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 1};
        int[] fourthPoint = new int[] {1, 1};
        int[] thirdPoint = new int[] {1, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getPerimeter()))).isEqualTo("4,00");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 7};
        int[] thirdPoint = new int[] {12, 0};
        int[] fourthPoint = new int[] {12, 7};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getPerimeter()))).isEqualTo("38,00");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 11};
        int[] thirdPoint = new int[] {11, 0};
        int[] fourthPoint = new int[] {11, 11};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getPerimeter()))).isEqualTo("44,00");
    }
}
