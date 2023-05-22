package day8.SoPhuc;

public class App {
    public static void main(String[] args) {
        MayTinh<Double> mayTinh = new DoubleMayTinh();
        System.out.println(mayTinh.cong(1.0,5.0));
        System.out.println(mayTinh.tru(5.0, 2.0));

        SoPhuc s1 = new SoPhuc(3,4);
        SoPhuc s2 = new SoPhuc(5, 6);
        // can dịnh nghĩa cộng số phức

        MayTinh<SoPhuc> soPhucMayTinh = new MayTinhSoPhuc();
        System.out.println(soPhucMayTinh.cong(s1,s2));

        SoPhuc tich = soPhucMayTinh.nhan(s1,s2);
        System.out.println(tich);

        SoPhuc thuong = soPhucMayTinh.chia(s1,s2);
        System.out.println(thuong);
    }
}
