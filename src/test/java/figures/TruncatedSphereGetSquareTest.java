package figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

public class TruncatedSphereGetSquareTest {
    @Test
    @DisplayName("first square test")
    public void firstSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {3, 0, 0};
        int[] thirdPoint = new int[] {0, 0, 3};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        TruncatedSphere truncatedSphere = new TruncatedSphere(points);

        then(String.format("%.2f", Double.parseDouble(truncatedSphere.getSquare()))).isEqualTo("84,82");
    }

    @Test
    @DisplayName("second square test")
    public void secondSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {12, 0, 0};
        int[] thirdPoint = new int[] {0, 0, 4};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        TruncatedSphere truncatedSphere = new TruncatedSphere(points);

        then(String.format("%.2f", Double.parseDouble(truncatedSphere.getSquare()))).isEqualTo("552,92");
    }

    @Test
    @DisplayName("third square test")
    public void thirdSquareTest(){
        Point points = new Point();
        List<int[]> intPoints = new ArrayList<>();

        int[] firstPoint = new int[] {0, 0, 0};
        int[] secondPoint = new int[] {32, 0, 0};
        int[] thirdPoint = new int[] {0, 0, 54};

        intPoints.add(firstPoint);
        intPoints.add(secondPoint);
        intPoints.add(thirdPoint);

        points.setPoints(intPoints);

        TruncatedSphere truncatedSphere = new TruncatedSphere(points);

        then(String.format("%.2f", Double.parseDouble(truncatedSphere.getSquare()))).isEqualTo("12553,80");
    }
}
