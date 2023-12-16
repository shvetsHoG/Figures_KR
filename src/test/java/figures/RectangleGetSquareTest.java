package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class RectangleGetSquareTest {
    @Test
    @DisplayName("first perimeter test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {0, 1};
        int[] thirdPoint = new int[] {1, 0};
        int[] fourthPoint = new int[] {1, 1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getSquare()))).isEqualTo("1,00");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {3, 3};
        int[] secondPoint = new int[] {0, 3};
        int[] thirdPoint = new int[] {3, 0};
        int[] fourthPoint = new int[] {0, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getSquare()))).isEqualTo("9,00");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {-3, 0};
        int[] thirdPoint = new int[] {0, -3};
        int[] fourthPoint = new int[] {-3, -3};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(fourthPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Rectangle rectangle = new Rectangle(points);

        then(String.format("%.2f", Double.parseDouble(rectangle.getSquare()))).isEqualTo("9,00");
    }
}
