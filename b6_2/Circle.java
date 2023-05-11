package OOP.b6_2;

import java.util.PrimitiveIterator;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "OOP.b6_2.Circle{" +
                "r=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
