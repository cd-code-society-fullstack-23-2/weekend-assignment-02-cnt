package com.codedifferently.ListExample;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        java.util.List<String> names = new ArrayList<>();

//    Adding elements to the list
        names.add("Candice"); //index 0
        names.add("Na'im");   //Index 1
        names.add("Trevor");  //Index 2

//    Accessing elements by index
        System.out.println("First name;" + names.get(0));

//    iterating through the list. (: is like saying "for each")
        for (String name : names) {
            System.out.println(name);
        }
//    Removing an element by index
        names.remove(1);
        {
            System.out.println(names);
        }

//    Checking if the list contains an element
        System.out.println("Contains 'Candice': " + names.contains(("Candice")));

    }

    public void addName(String jacqueline) {

    }

    public List<String> getNames() {
        return getNames();

    }



}




