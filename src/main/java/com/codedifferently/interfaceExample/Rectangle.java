// Declare that this code belongs to a package named "com.codedifferently.interfaceExample"
package com.codedifferently.interfaceExample;

// Define a class named "Rectangle" that implements the "Shape" interface
class Rectangle implements Shape {
    // Declare private instance variables for width and height
    private double width;
    private double height;

    // Constructor: When creating a new Rectangle object, it requires width and height as parameters
    public Rectangle(double width, double height) {
        // Initialize the "width" and "height" properties with the values provided as parameters
        this.width = width;
        this.height = height;
    }

    // Implement the "area" method as required by the "Shape" interface
    @Override
    public double area() {
        // Calculate and return the area of the rectangle (width * height)
        return width * height;
    }
}

