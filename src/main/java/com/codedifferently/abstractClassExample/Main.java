package com.codedifferently.abstractClassExample;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Oakland");
        Dog dog = new Dog("Lucy");

        cat.makeSound();
        cat.eat();
        dog.makeSound();
        dog.eat();
    }
}
