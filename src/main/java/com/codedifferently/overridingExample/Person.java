package com.codedifferently.overridingExample;

public class Person extends SuperHero{
    String name;
    String power;

    public Person(String name, String power, String name1, String power1) {
        super(name, power);
        this.name = name1;
        this.power = power1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
