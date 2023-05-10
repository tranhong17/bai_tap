package OOP.b4_6;

public class Main {
    public static void main(String[] args) {

        Animal animals = new Animal("Trau");
        System.out.println(animals);
        Mammal mammal = new Mammal("dong vat co vu");
        System.out.println(mammal);
        Dog d1 = new Dog("dog1");
        System.out.println(d1);
        d1.greets();
        Dog d2 = new Dog("dog2");
        System.out.println(d2);
        d2.greets(d2);
        Cat c1 = new Cat("cat1");
        System.out.println(c1);
        d2.greets();

    }
}
