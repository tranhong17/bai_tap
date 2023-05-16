package day6.BaiTap;

public class CardFactory {
    private CardFactory(){}
    public static CreditCard getCard(String card) {
        switch (card) {
            case "MoneyBack":
                return new MoneyBack();
            case "Plattinun":
                return new Platinun();
            case "Titaniun":
                return new Titaniun();
            default:
                return null;
        }
    }
}
