package com.codedifferently.PloyExampleTest;

import com.codedifferently.PolyExample.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class AnimalTest {

    private final Animal animal = new Animal();

    @BeforeEach

    public void setUp() {
        Animal animal = new Animal("Simba","Orange" ); }

    @Test
    public void testGetName(){
        animal.setName("Scar");
        Assertions.assertEquals("Scar",animal.getName());

    }

    @Test
    public void testGetColor(){
        animal.setColor("Orange");
        Assertions.assertEquals("Orange",animal.getColor());
    }


}
