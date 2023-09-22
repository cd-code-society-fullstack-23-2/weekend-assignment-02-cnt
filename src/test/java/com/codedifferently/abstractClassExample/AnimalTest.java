package com.codedifferently.abstractClassExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnimalTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testDogMakeSound() {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        assertEquals("Buddy barks.\n", outContent.toString());
    }

    @Test
    public void testCatMakeSound() {
        Cat cat = new Cat("Whiskers");
        cat.makeSound();
        assertEquals("Whiskers meows.\n", outContent.toString());
    }

    @Test
    public void testDogEat() {
        Dog dog = new Dog("Fido");
        dog.eat();
        assertEquals("Fido is eating.\n", outContent.toString());
    }

    @Test
    public void testCatEat() {
        Cat cat = new Cat("Socks");
        cat.eat();
        assertEquals("Socks is eating.\n", outContent.toString());
    }

    @Test
    public void testNameInitialization() {
        Dog animal = new Dog("Max");
        assertEquals("Max", animal.name);
    }

    @Test
    public void testAbstractMethod() {
        Animal animal = new Animal("Anonymous") {
            @Override
            public void makeSound() {
                System.out.println(name + " makes a generic sound.");
            }
        };

        animal.makeSound();
        assertEquals("Anonymous makes a generic sound.\n", outContent.toString());
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}

