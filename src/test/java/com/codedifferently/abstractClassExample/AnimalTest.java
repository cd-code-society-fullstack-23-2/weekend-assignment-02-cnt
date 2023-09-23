// Import necessary libraries for testing with JUnit
package com.codedifferently.abstractClassExample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Define a test class named "AnimalTest"
public class AnimalTest {

    // Declare variables to capture printed output during testing
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // This method is run before each test case
    @BeforeEach
    public void setUpStreams() {
        // Redirect the standard output (System.out) to the "outContent" stream
        System.setOut(new PrintStream(outContent));
    }

    // This test method checks if a Dog can make a sound
    @Test
    public void testDogMakeSound() {
        // Create a Dog object named "Buddy"
        Dog dog = new Dog("Buddy");
        // Call the "makeSound" method on the Dog object
        dog.makeSound();
        // Check if the printed output matches the expected message
        assertEquals("Buddy barks.\n", outContent.toString());
    }

    // This test method checks if a Cat can make a sound
    @Test
    public void testCatMakeSound() {
        // Create a Cat object named "Whiskers"
        Cat cat = new Cat("Whiskers");
        // Call the "makeSound" method on the Cat object
        cat.makeSound();
        // Check if the printed output matches the expected message
        assertEquals("Whiskers meows.\n", outContent.toString());
    }

    // This test method checks if a Dog can eat
    @Test
    public void testDogEat() {
        // Create a Dog object named "Fido"
        Dog dog = new Dog("Fido");
        // Call the "eat" method on the Dog object
        dog.eat();
        // Check if the printed output matches the expected message
        assertEquals("Fido is eating.\n", outContent.toString());
    }

    // This test method checks if a Cat can eat
    @Test
    public void testCatEat() {
        // Create a Cat object named "Socks"
        Cat cat = new Cat("Socks");
        // Call the "eat" method on the Cat object
        cat.eat();
        // Check if the printed output matches the expected message
        assertEquals("Socks is eating.\n", outContent.toString());
    }

    // This test method checks if the "name" property of a Dog is initialized correctly
    @Test
    public void testNameInitialization() {
        // Create a Dog object named "Max"
        Dog animal = new Dog("Max");
        // Check if the "name" property of the Dog object is "Max"
        assertEquals("Max", animal.name);
    }

    // This test method checks if an anonymous subclass of Animal can make a sound
    @Test
    public void testAbstractMethod() {
        // Create an anonymous subclass of Animal with a custom "makeSound" implementation
        Animal animal = new Animal("Anonymous") {
            @Override
            public void makeSound() {
                System.out.println(name + " makes a generic sound.");
            }
        };

        // Call the "makeSound" method on the anonymous Animal object
        animal.makeSound();
        // Check if the printed output matches the expected message
        assertEquals("Anonymous makes a generic sound.\n", outContent.toString());
    }

    // This method is run after each test case to restore the original standard output
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}


