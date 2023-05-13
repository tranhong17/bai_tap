package OOP.b7_2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x,y);
    }
}
