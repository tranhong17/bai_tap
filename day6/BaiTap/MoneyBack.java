package day6.BaiTap;

public class MoneyBack implements CreditCard{
    @Override
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCreaditLimit() {
        return 15000000;
    }

    @Override
    public int getAnnualCharge() {
        return 600;
    }
}
