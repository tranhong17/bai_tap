package OOP.b4_6;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Mammal[Animal[name=\"%s\"]]", super.getName());
    }


}
