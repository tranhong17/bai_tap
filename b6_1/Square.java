package OOP.b6_1;

public class Square extends Rectangle{


    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public boolean getSide(){
        return false;
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public void setWidth(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public void setLength(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "OOP.b6_1.Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
