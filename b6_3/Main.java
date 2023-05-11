package OOP.b6_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movable> mo = new ArrayList<>();
        MovablePoint m = new MovablePoint(2,5, 5,6);
        mo.add(m);


        for(Movable b: mo){
            System.out.println(b);
        }
    }
}
