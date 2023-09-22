package com.codedifferently.abstractClassExample;

abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();
}

