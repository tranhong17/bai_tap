package day6.LT_Factory;

public class BankFactory {
    private BankFactory(){}
        public static Bank getBank(String bank){
            switch (bank){
                case "TPBank":
                    return new TPBank();
                case "VietcomBank":
                    return new VietcomBank("abc123");
                case "TechcomBank":
                    return new TechcomBank();
                default:
                    return null;
            }
    }
}
