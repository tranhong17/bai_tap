package Exercise;

public class Bt1_2 {
    private double radius;

    public Bt1_2() {
    }

    public Bt1_2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI *radius;
    }

    @Override
    public String toString() {
        return "Exercise.Bt1_2{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", circumference=" + getCircumference() +
                '}';
    }
}
