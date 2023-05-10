package OOP.b4_6;

public class Mammal extends Animal{
    public String name;
    public Mammal(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "OOP.b4_6.Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
