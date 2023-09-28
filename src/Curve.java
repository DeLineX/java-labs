import java.util.ArrayList;

public class Curve {
    ArrayList<Point> points;

    public Curve(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("Линия: %s", points);
    }
}
