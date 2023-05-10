package OOP.b4_6;

import day3.Truu_Tuong.Animal;
import day3.Truu_Tuong.Cat;
import day3.Truu_Tuong.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog("Chihuahua");
        animals[2] = new Dog("pitbull", "Blcak");
        animals[3] = new Cat();
        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
