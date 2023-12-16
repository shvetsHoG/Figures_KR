package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class CylinderGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {0, 0, 3};
        int[] thirdPoint = new int[] {3, 0, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cylinder cylinder = new Cylinder(points);

        then(String.format("%.2f", Double.parseDouble(cylinder.getSquare()))).isEqualTo("113,10");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {0, 0, 12};
        int[] thirdPoint = new int[] {4, 0, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cylinder cylinder = new Cylinder(points);

        then(String.format("%.2f", Double.parseDouble(cylinder.getSquare()))).isEqualTo("402,12");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {0, 0, 43};
        int[] thirdPoint = new int[] {32, 0, 0};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        Cylinder cylinder = new Cylinder(points);

        then(String.format("%.2f", Double.parseDouble(cylinder.getSquare()))).isEqualTo("15079,64");
    }
}
