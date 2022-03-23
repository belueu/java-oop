package dev.belueu.masterclass.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello inheritance examples!");

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yokie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
