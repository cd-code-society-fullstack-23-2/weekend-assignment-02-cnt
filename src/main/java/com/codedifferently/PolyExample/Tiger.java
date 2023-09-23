package com.codedifferently.PolyExample;

public class Tiger extends Animal { //Child class
    private String breed;

    public void hunt() {
        System.out.println("growl growl");
    } //hunt method extended from parent class Animal-Using polymorphism we override hunt method with growl, vs hunt.

//   public void hunt(int numberOfTimes) { //Method overloading
//       for (int i = 0; i < numberOfTimes; i++) {
//           System.out.println("growl growl");
//
//      }
//    }


        public String getBreed () {
            return breed;
        }

        public void setBreed (String breed){ this.breed = breed; }

        }






