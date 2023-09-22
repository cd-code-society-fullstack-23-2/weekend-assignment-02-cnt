package com.codedifferently.comparableExample.spice;


public class Spice implements Comparable<Spice> {

    private String name;
    private String color;
    private HeatLevel level;
    private SpiceGrade grade;

    public Spice() {
        this.name = "pumpkin";
        this.color = "brown";
        this.level = HeatLevel.MILD;
        this.grade = SpiceGrade.POWDER;
    }

    public Spice(String name,
                 String color,
                 HeatLevel level,
                 SpiceGrade grade) {
        this.name = name;
        this.color = color;
        this.level = level;
        this.grade = grade;

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

    public HeatLevel getLevel() {
        return level;
    }

    public void setLevel(HeatLevel level) {
        this.level = level;
    }

    public SpiceGrade getGrade() {
        return grade;
    }

    public void setGrade(SpiceGrade grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Spice o) {
        return level.compareTo(o.level);
    }

    public String toString(){
        return String.format("%s %s", name, level);
    }
}

