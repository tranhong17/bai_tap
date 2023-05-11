package OOP.b6_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       GeometricObject ger = new Circle(5);
        GeometricObject g = new Rectangle(2,3);

        System.out.println("chu vi: " + ger.getArea());
        System.out.println("dien tich: " + ger.getPerimeter());

        System.out.println("chu vi: " + g.getArea());
        System.out.println("dien tich: " + g.getPerimeter());
    }

}
