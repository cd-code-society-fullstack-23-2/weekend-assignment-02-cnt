package com.codedifferently.EnumExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Day of the Week");
        String userInput = scanner.nextLine().toUpperCase();

        Day today = null;

        try {
            today = Day.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Tomorrow is a New Day");
        }

        if (today != null) {
            System.out.println("Today is " + today);
            switch (today) {

                case SUNDAY:
                    System.out.println("Brace ahead for the week");
                    break;
                case MONDAY:
                    System.out.println("Case of the Mondays. /:");
                    break;
                case TUESDAY:
                    System.out.println("Taco Tuesday!");
                    break;
                case WEDNESDAY:
                    System.out.println("Hump Day");
                case THURSDAY:
                    System.out.println("Friday is around");
                    break;
                case FRIDAY:
                    System.out.println("Thank God it's Friday!");
                    break;
                case SATURDAY:
                    System.out.println("Today Was a Good Day");
                    break;
            }


//        System.out.println("All days of the week:");
//        for (Day day : Day.values()) {
//            System.out.println(day);
        }
        scanner.close();
    }

}

