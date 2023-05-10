package OOP.b4_6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "OOP.b4_6.Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
