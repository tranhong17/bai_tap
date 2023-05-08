package Exercise;

public class Account6 {
    private String id;
    private String name;
    private int balance = 0;

    public Account6(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account6(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

}
