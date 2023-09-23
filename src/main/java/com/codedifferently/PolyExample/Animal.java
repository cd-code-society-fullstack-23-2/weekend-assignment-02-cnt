package com.codedifferently.PolyExample;

public class Animal { //Parent class
    private String name;
    private String color;


    public void hunt() {
        System.out.println("attack");
    }

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
