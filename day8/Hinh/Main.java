package day8.Hinh;

public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong(4);
        HinhTron ht = new HinhTron(4);

        Drawable drawable = new Drawable();
        drawable.draw(hv);
        drawable.draw(ht);
    }
}
