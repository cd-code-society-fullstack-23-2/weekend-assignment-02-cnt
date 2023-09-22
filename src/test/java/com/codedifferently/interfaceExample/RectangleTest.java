package com.codedifferently.interfaceExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testRectangleArea01() {
        // Create a Rectangle with width 4 units and height 6 units
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculate the expected area (width * height)
        double expectedArea = 4.0 * 6.0;

        // Test if the calculated area matches the expected area
        assertEquals(expectedArea, rectangle.area(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testRectangleArea02() {
        Rectangle rectangle = new Rectangle(5, 2.5);
        double expectedArea = 5.0 * 2.5;
        assertEquals(expectedArea, rectangle.area(), 0.001);
    }
}
