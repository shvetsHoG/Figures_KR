package point;

import java.util.ArrayList;
import java.util.List;

public class Point {
    private List<int[]> points;

    public List<int[]> getPoints() {
        return points;
    };

    public void setPoints(List<int[]> points) {
        this.points = points;
    };

    public int getSize() {
        return this.points.size();
    }

    public Point() {
        this.points = new ArrayList<>();
    };
}
