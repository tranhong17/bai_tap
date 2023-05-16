package day6.Cafe.caphe;

import day6.Cafe.caphe.CaPhe;

public class Denda implements CaPhe {
    private String loaiHat;
    private int luongDuong;
    private int LuongCaPhe;
    private int LuongNuoc;

    public Denda(String loaiHat, int luongDuong, int luongCaPhe, int luongNuoc) {
        this.loaiHat = loaiHat;
        this.luongDuong = luongDuong;
        LuongCaPhe = luongCaPhe;
        LuongNuoc = luongNuoc;
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

    public int getLuongCaPhe() {
        return LuongCaPhe;
    }

    public void setLuongCaPhe(int luongCaPhe) {
        LuongCaPhe = luongCaPhe;
    }

    public int getLuongNuoc() {
        return LuongNuoc;
    }

    public void setLuongNuoc(int luongNuoc) {
        LuongNuoc = luongNuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Den da");
    }
}
