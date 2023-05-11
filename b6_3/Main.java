package OOP.b6_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0,0,2,1);
        p.moveUp();
        System.out.println(p);
        p.moveRight();
        System.out.println(p);
        p.moveDown();
        System.out.println(p);
        p.moveLeft();
        System.out.println(p);
    }
}
