package day6.LT_Factory;

public class VietcomBank implements Bank{
    private String privateKey;

    public VietcomBank(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String getBankname() {
        return "VietcomBank";
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua Vietcombank");
    }
}
