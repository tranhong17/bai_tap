package day6.Cafe.caphe;

import day6.Cafe.caphe.CaPhe;

public class BacXiu implements CaPhe {
    private String luongHat;
    private int luongDuong;

    public BacXiu(String luongHat, int luongDuong) {
        this.luongHat = luongHat;
        this.luongDuong = luongDuong;
    }

    public String getLuongHat() {
        return luongHat;
    }

    public void setLuongHat(String luongHat) {
        this.luongHat = luongHat;
    }

    public int getLuongDuong() {
        return luongDuong;
    }

    public void setLuongDuong(int luongDuong) {
        this.luongDuong = luongDuong;
    }

    @Override
    public void taoCaPhe() {

    }
}
