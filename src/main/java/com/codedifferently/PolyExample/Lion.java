package com.codedifferently.PolyExample;

public class Lion extends Animal { //child class
    private String preyPreference;

    public Lion(String name, String color) {
        super(name, color);//Calling the constructor of the parent class,Animal
    }

    public Lion() {

    }

    public void hunt() {
        System.out.println("chomp chomp"); //hunt method extended from parent class Animal-Using polymorphism we override hunt method with chomp, vs hunt.
    }
 public String getPreyPreference() {
     return preyPreference;

    }

    public void setPreyPreference(String preyPreference) {
     this.preyPreference = preyPreference;
    }


}
