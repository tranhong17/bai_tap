package Exercise;

public class Main2 {
    public static void main(String[] args){
        // Test contructors and toString
        Bt1_2 b1 = new Bt1_2(1.1);
        System.out.println(b1);
        Bt1_2 b2 = new Bt1_2();
        System.out.println(b2);

        // Test setter and getter
        b1.setRadius(2.2);
        System.out.println(b1);
        System.out.println("bán kính là: " + b1.getRadius());

        // test getArea() và and Circumference()

        System.out.printf("area is: %.2f%n", b1.getArea());
        System.out.printf("circumference is: %.2f%n", b1.getCircumference());
    }
}
