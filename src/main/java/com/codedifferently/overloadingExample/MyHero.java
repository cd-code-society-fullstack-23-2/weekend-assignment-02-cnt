package com.codedifferently.overloadingExample;

public class MyHero {
    //creating a MyHero class
    private String firstPower;
    //creating instance variables for class "type and name class variables"
    private String secondPower;
    private String thirdPower;
    private String alias;
    private String enemy;

    public MyHero(String firstPower, String secondPower, String thirdPower, String alias, String enemy){
      //constructor for MyHero class  with assigned parameter variables
        this.firstPower = firstPower;
        this.secondPower = secondPower;
        this.thirdPower = thirdPower;
        this.alias = alias;
        this.enemy = enemy;
        //assigning the private class with "this." to be equal to the parameter value
    }
    public MyHero(String secondPower, String thirdPower, String alias, String enemy){
        this.secondPower = secondPower;
        this.thirdPower = thirdPower;
        this.alias = alias;
        this.enemy = enemy;
    }
    public MyHero(String secondPower, String thirdPower, String alias ){
        this.secondPower = secondPower;
        this.thirdPower = thirdPower;
        this.alias = alias;

    }

    public static void main(String[] args) {

        MyHero myHero = new MyHero("Flight","Strength","Lasers","LaserFace","TazorFace");
        //creating a new MyHero Object class with variable name of myHero
        System.out.println("powers: ");
        //prints code to terminal
        System.out.println(myHero.firstPower);
        System.out.println(myHero.secondPower);
        System.out.println(myHero.thirdPower);
        System.out.println(myHero.alias);
        System.out.println(myHero.enemy);
    }
}
