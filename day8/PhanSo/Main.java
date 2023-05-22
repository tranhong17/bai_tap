package day8.PhanSo;

public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(4,8);
        PhanSo p2 = new PhanSo(5,6);
        PhanSo p3 = new PhanSo(2,5);

        ITinhToan<PhanSo> tinhToanPhanSo = new TinhToanPhanSo();
        PhanSo tong = tinhToanPhanSo.cong(p1,p2,p3);
        PhanSo tich = tinhToanPhanSo.nhan(p1,p2,p3);
        System.out.println(tong);
        System.out.println(tich);
    }
}
