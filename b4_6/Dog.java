package OOP.b4_6;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return String.format("Dog[Mammal[Animal[name=\"%s\"]]]", super.getName());
    }
}
