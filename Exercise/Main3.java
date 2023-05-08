package Exercise;

public class Main3 {
    public static void main(String[] args){
        HinhChuNhat3 hcn1 = new HinhChuNhat3(1.2f, 3.4f);
        System.out.println(hcn1);
        HinhChuNhat3 hcn2 = new HinhChuNhat3();
        System.out.println(hcn2);

        hcn1.setLength(5.6f);
        hcn1.setWidth(7.8f);
        System.out.println(hcn1);
        System.out.println("length is: " + hcn1.getLength());
        System.out.println("width is: " + hcn1.getWidth());

        System.out.printf("Area is: %.2f%n", hcn1.getArea());
        System.out.printf("perimeter is: %.2f%n", hcn1.getPerimeter());
    }
}
