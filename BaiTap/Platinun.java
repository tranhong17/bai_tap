package day6.BaiTap;

public class Platinun implements CreditCard{
    @Override
    public String getCardType() {
        return "Platinun";
    }

    @Override
    public int getCreaditLimit() {
        return 1500000;
    }

    @Override
    public int getAnnualCharge() {
        return 5000;
    }
}
