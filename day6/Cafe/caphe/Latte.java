package day6.Cafe.caphe;

import day6.Cafe.caphe.CaPhe;

public class Latte implements CaPhe {
    private String loaiHat;
    private int luongDuong;

    public Latte(String loaiHat, int luongDuong) {
        this.loaiHat = loaiHat;
        this.luongDuong = luongDuong;
    }

    public String getLoaiHat() {
        return loaiHat;
    }

    public void setLoaiHat(String loaiHat) {
        this.loaiHat = loaiHat;
    }

    public int getLuongDuong() {
        return luongDuong;
    }

    public void setLuongDuong(int luongDuong) {
        this.luongDuong = luongDuong;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Latte");
    }
}
