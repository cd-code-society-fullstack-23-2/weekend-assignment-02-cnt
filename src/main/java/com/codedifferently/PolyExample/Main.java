package com.codedifferently.PolyExample;

public class Main {
    public static void main(String[] args) {
        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        //Method Overloading = when you have 2 methods ina class that
        // have exactly the same method name but take in different parameters

        Animal myAnimal = new Animal();
        myAnimal.hunt();

        Tiger myTiger = new Tiger();
        myTiger.hunt();
//        myTiger.hunt(3);//Method Overloading

        Lion mylion = new Lion();
        mylion.hunt();

    }
}
