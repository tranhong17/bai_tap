package Exercise;

public class Main {
    public static void main(String[] args){
        Circle1 cr1 = new Circle1();
        System.out.println("Hình tròn có bán kính là: " + cr1.getRadius() + " và diện tích là: "+ cr1.getArea());
        Circle1 cr2 = new Circle1(2.0);
        System.out.println("Hình tròn có bán kính là: " + cr2.getRadius() + " và diện tích là: " + cr2.getArea());
    }
}
