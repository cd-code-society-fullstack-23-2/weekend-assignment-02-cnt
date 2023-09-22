package com.codedifferently.comparableExample.spice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiceTest {

    private Spice spice1;
    private Spice spice2;
    private Spice spice3;

    @BeforeEach
    public void setup() {
        spice1 = new Spice("Pepper", "Black", HeatLevel.MEDIUM, SpiceGrade.WHOLE);
        spice2 = new Spice("Chili", "Red", HeatLevel.HOT, SpiceGrade.POWDER);
        spice3 = new Spice("Paprika", "Red", HeatLevel.MILD, SpiceGrade.POWDER);
    }

    @Test
    public void testDefaultConstructor() {
        Spice defaultSpice = new Spice();
        assertEquals("pumpkin", defaultSpice.getName());
        assertEquals("brown", defaultSpice.getColor());
        assertEquals(HeatLevel.MILD, defaultSpice.getLevel());
        assertEquals(SpiceGrade.POWDER, defaultSpice.getGrade());
    }

    @Test
    public void testCompareTo() {
        assertEquals(-1, spice1.compareTo(spice2)); // MEDIUM is less than HOT
        assertEquals(1, spice1.compareTo(spice3));  // MEDIUM is greater than MILD
        assertEquals(0, spice1.compareTo(spice1));  // Equal to itself
    }

    @Test
    public void testToString() {
        assertEquals("Pepper MEDIUM", spice1.toString());
    }

}
