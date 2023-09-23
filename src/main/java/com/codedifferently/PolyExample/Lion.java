package com.codedifferently.PolyExample;

public class Lion extends Animal { //child class
    private String preyPreference;

    public void hunt() {
        System.out.println("roar roar"); //is overriding the hunt method from animal class
    }
 public String getPreyPreference() {
     return preyPreference;

    }

    public void setPreyPreference(String preyPreference) {
     this.preyPreference = preyPreference;
    }


}
