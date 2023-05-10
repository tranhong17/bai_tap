package OOP.b4_6;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("meo meo");
    }

    @Override
    public String toString() {
        return "OOP.b4_6.Cat{" +
                "name='" + name + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
