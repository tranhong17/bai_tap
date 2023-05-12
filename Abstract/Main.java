package day4.Abstract;

public class Main {
    public static void main(String[] args) {
        NganHang nh = new Agri();
        System.out.println(" Lai suat: " + nh.laylaisuat() + "%");
        NganHang n = new VCB();
        System.out.println(" lai suat: " + n.laylaisuat() + "%");
    }
}
