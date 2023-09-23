package com.codedifferently.PolyExample;

public class Main {
    public static void main(String[] args) {


        Animal myAnimal = new Animal();
        myAnimal.hunt();

        Tiger myTiger = new Tiger();
        myTiger.hunt();
        //myTiger.hunt(3);//Method Overloading

        Lion mylion = new Lion();
        mylion.hunt();

    }
}
