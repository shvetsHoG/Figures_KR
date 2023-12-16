package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class PolygonGetSquareTest {
    @Test
    @DisplayName("first perimeter test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {-1, 1};
        int[] thirdPoint = new int[] {0, 2};
        int[] fourthPoint = new int[] {1, 2};
        int[] fifthPoint = new int[] {2, 1};
        int[] sixthPoint = new int[] {1, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);
        intPoints.add(fourthPoint);
        intPoints.add(fifthPoint);
        intPoints.add(sixthPoint);

        points.setPoints(intPoints);

        Polygon polygon = new Polygon(points);

        then(String.format("%.2f", Double.parseDouble(polygon.getSquare()))).isEqualTo("4,00");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {1, 1};
        int[] thirdPoint = new int[] {2, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Polygon polygon = new Polygon(points);

        then(String.format("%.2f", Double.parseDouble(polygon.getSquare()))).isEqualTo("1,00");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {1, 0};
        int[] thirdPoint = new int[] {1, 1};
        int[] fourthPoint = new int[] {0, 1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);
        intPoints.add(fourthPoint);

        points.setPoints(intPoints);

        Polygon polygon = new Polygon(points);

        then(String.format("%.2f", Double.parseDouble(polygon.getSquare()))).isEqualTo("1,00");
    }
}
