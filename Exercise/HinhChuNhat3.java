package Exercise;

public class HinhChuNhat3 {
    private float length = 1.0f;
    private float width = 1.0f;

    public HinhChuNhat3() {
    }

    public HinhChuNhat3(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Exercise.HinhChuNhat{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
