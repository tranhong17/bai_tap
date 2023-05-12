package day4.FactoryPattern;

public class BankFactory {
    private BankFactory() {

    }
    public static final Bank getBank(BankType BankType) {
        switch (BankType) {
            case TPBank:
                return new TPBank();

            case VPBank:
                return new VPBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
