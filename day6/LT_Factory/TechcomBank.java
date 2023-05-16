package day6.LT_Factory;

public class TechcomBank implements Bank{

    @Override
    public String getBankname() {
        return "Techcombank";
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua Techcombank");
    }
}
