package day6.LT_Factory;

public class TPBank implements Bank{

    @Override
    public String getBankname() {
        return "TPBank";
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua TPBank");
    }
}
