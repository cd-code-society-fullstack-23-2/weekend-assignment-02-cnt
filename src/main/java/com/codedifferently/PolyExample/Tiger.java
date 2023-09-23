package com.codedifferently.PolyExample;

public class Tiger extends Animal { //Child class
    private int breed;

    public void hunt() {
        System.out.println("growl growl");
    }

//    public void hunt(int numberOfTimes) { //Method overloading
//        for (int i = 0; i < numberOfTimes; i++) {
//            System.out.println("growl growl");
//
//        }
//    }


        public int getBreed () {
            return breed;
        }

        public void setBreed ( int breed){
            this.breed = breed;
        }

    }




