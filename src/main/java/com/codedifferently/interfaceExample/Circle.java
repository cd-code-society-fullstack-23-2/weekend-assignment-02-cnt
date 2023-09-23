// Declare that this code belongs to a package named "com.codedifferently.interfaceExample"
package com.codedifferently.interfaceExample;

// Define a class named "Circle" that implements the "Shape" interface
class Circle implements Shape {
    // Declare a private instance variable for the radius
    private double radius;

    // Constructor: When creating a new Circle object, it requires the radius as a parameter
    public Circle(double radius) {
        // Initialize the "radius" property with the value provided as a parameter
        this.radius = radius;
    }

    // Implement the "area" method as required by the "Shape" interface
    @Override
    public double area() {
        // Calculate and return the area of the circle (π * radius * radius)
        return Math.PI * radius * radius;
    }
}

