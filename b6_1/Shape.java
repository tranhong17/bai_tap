package OOP.b6_1;

public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "OOP.b6_1.Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
