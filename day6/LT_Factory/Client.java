package day6.LT_Factory;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("TPBank");
        if(bank != null) {
            System.out.println(bank.getBankname());
            bank.payment();
        }
    }
}
