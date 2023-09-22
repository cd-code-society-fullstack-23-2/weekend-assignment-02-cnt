package com.codedifferently.interfaceExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @Test
    public void testCircleArea01() {
        // Create a Circle with a radius of 5 units
        Circle circle = new Circle(5.0);

        // Calculate the expected area (PI * r^2)
        double expectedArea = Math.PI * 5.0 * 5.0;

        // Test if the calculated area matches the expected area
        assertEquals(expectedArea, circle.area(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testCircleArea02() {
        Circle circle = new Circle(2.5);
        double expectedArea = Math.PI * 2.5 * 2.5;
        assertEquals(expectedArea, circle.area(), 0.001);
    }
}