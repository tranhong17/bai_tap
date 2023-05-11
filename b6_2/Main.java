package OOP.b6_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> ge = new ArrayList<>();

        Circle cr = new Circle(4);
        Rectangle re = new Rectangle(2, 3);
        ge.add(cr);
        ge.add(re);

        for(GeometricObject g : ge){
            System.out.println(g);
        }
    }

}
