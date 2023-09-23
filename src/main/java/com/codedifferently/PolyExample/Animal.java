package com.codedifferently.PolyExample;

public class Animal { //Parent class
    private String name; //variable name declared private
    private String color; //variable color declared private


    public Animal (String name, String color) { //Constructor for class animal taking in parameter name & color
        this.name = name; //referring to the name prop of current animal
        this.color = color;//referring to the color prop of current animal
    }

    public Animal() {

    }


    public void hunt() { //method is overridden in Lion and Tiger
        System.out.println("attack");
    } //hunt method will be extended to child class using poly

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
