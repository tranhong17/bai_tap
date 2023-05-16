package day6.BaiTap;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = CardFactory.getCard("MoneyBack");
        if(creditCard != null){
            System.out.println("Loai the: " + creditCard.getCardType());
            System.out.println("Gioi han tin dung: " + creditCard.getCreaditLimit());
            System.out.println("The tin dung: " + creditCard.getAnnualCharge());
        }
    }
}
