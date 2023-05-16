package day6.Cafe.caphe;

import day6.Cafe.caphe.CaPhe;

public class Espresso implements CaPhe {
    private String LoaiHat;
    private int luongCaPhe;
    private int LuongDuong;
    private int apSuat;

    public Espresso(String loaiHat, int luongCaPhe, int luongDuong, int apSuat) {
        LoaiHat = loaiHat;
        this.luongCaPhe = luongCaPhe;
        LuongDuong = luongDuong;
        this.apSuat = apSuat;
    }

    public String getLoaiHat() {
        return LoaiHat;
    }

    public void setLoaiHat(String loaiHat) {
        LoaiHat = loaiHat;
    }

    public int getLuongCaPhe() {
        return luongCaPhe;
    }

    public void setLuongCaPhe(int luongCaPhe) {
        this.luongCaPhe = luongCaPhe;
    }

    public int getLuongDuong() {
        return LuongDuong;
    }

    public void setLuongDuong(int luongDuong) {
        LuongDuong = luongDuong;
    }

    public int getApSuat() {
        return apSuat;
    }

    public void setApSuat(int apSuat) {
        this.apSuat = apSuat;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Caf Phe");
    }
}
