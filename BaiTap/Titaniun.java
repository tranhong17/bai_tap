package day6.BaiTap;

public class Titaniun implements CreditCard{
    @Override
    public String getCardType() {
        return "Titaniun";
    }

    @Override
    public int getCreaditLimit() {
        return 1500000;
    }

    @Override
    public int getAnnualCharge() {
        return 3000;
    }
}
