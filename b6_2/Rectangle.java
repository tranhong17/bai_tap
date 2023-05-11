package OOP.b6_2;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "OOP.b6_2.Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
