package com.codedifferently.interfaceExample;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(8,4);
        Shape circle = new Circle(23);

        double rectangleArea = rectangle.area();
        double circleArea = circle.area();

        System.out.println("This rectangle has an area of: " + rectangleArea);
        System.out.println("This circle has an area of: " + circleArea);
    }
}
