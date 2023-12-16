package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class ParallelogramGetPerimeterTest {
    @Test
    @DisplayName("first perimeter test")
    public void firstPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {1, 1};
        int[] thirdPoint = new int[] {2, 1};
        int[] fourthPoint = new int[] {1, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);
        intPoints.add(fourthPoint);

        points.setPoints(intPoints);

        Parallelogram parallelogram = new Parallelogram(points);

        then(String.format("%.2f", Double.parseDouble(parallelogram.getPerimeter()))).isEqualTo("4,83");
    }

    @Test
    @DisplayName("second perimeter test")
    public void secondPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0};
        int[] secondPoint = new int[] {2, 2};
        int[] thirdPoint = new int[] {4, 2};
        int[] fourthPoint = new int[] {2, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);
        intPoints.add(fourthPoint);

        points.setPoints(intPoints);

        Parallelogram parallelogram = new Parallelogram(points);

        then(String.format("%.2f", Double.parseDouble(parallelogram.getPerimeter()))).isEqualTo("9,66");
    }

    @Test
    @DisplayName("third perimeter test")
    public void thirdPerimeterTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {-1, -1};
        int[] secondPoint = new int[] {0, 0};
        int[] thirdPoint = new int[] {1, 0};
        int[] fourthPoint = new int[] {0, -1};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);
        intPoints.add(fourthPoint);

        points.setPoints(intPoints);

        Parallelogram parallelogram = new Parallelogram(points);

        then(String.format("%.2f", Double.parseDouble(parallelogram.getPerimeter()))).isEqualTo("4,83");
    }
}
