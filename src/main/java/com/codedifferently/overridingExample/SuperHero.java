package com.codedifferently.overridingExample;

public class SuperHero {
    String name;
    String power;

    public SuperHero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =  name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    @Override
    public String toString(){
    return String.format("%s %s", name, power);
    }
}
