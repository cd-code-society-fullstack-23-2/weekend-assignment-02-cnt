// Declare that this class "Cat" is part of the package "com.codedifferently.abstractClassExample"
package com.codedifferently.abstractClassExample;

// Define a class named "Cat" that extends (inherits from) another class "Animal"
public class Cat extends Animal {
    // Constructor: When creating a new Cat object, it requires a "name" as a parameter
    public Cat(String name) {
        // Call the constructor of the parent class "Animal" and pass the "name" parameter to it
        super(name);
    }

    // Override the abstract method "makeSound" that is defined in the parent class "Animal"
    @Override
    public void makeSound() {
        // Implement the "makeSound" method to print a message indicating the cat's sound
        System.out.println(name + " meows.");
    }
}

