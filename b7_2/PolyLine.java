package OOP.b7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<Point>();
    }
    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appeendPoint(int x, int y){
        Point p = new Point(x,y);
        points.add(p);
    }
    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point ap : points){
            sb.append(ap.toString());
        }
        sb.append("}");
        return sb.toString();
    }
    public double getLength(){
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++){
            length += points.get(i).distance(points.get(i+1));
        }
        return length;
    }

}
