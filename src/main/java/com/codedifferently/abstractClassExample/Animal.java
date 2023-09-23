// Declare that this class "Animal" is part of the package "com.codedifferently.abstractClassExample"
package com.codedifferently.abstractClassExample;

// Define an abstract class named "Animal"
public abstract class Animal {
    // Declare a public property "name" that can be accessed by subclasses
    public String name;

    // Constructor: When creating a new Animal object, it requires a "name" as a parameter
    public Animal(String name) {
        // Initialize the "name" property with the value provided as a parameter
        this.name = name;
    }

    // A non-abstract method named "eat" with an implementation
    public void eat() {
        // Print a message indicating that the animal is eating, including its name
        System.out.println(name + " occasionally eats people food.");
    }

    // An abstract method named "makeSound" declared without an implementation
    public abstract void makeSound();

}



