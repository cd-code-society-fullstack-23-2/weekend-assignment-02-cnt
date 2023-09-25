package com.codedifferently.overloadingExample;

public class Calculator{
    public static void main(String[] args) {
        Double adding = add(3.0 ,1.0);
        int adding1 = add(2,1);
        Double subtracting = subtract(9.0,8.2);
        int subtracting1 = subtract(4,7);
        String concatenate = "Over" + "loading";
        System.out.println(adding1);
        System.out.println(adding);
        System.out.println(subtracting);
        System.out.println(subtracting1);
        System.out.println(concatenate);
    }
    public static Double add(Double a, Double b){
        return a + b;
    }
        //public method add with type double
     public static int add(int a, int b){
            return  a + b;
    }
    public static String add(String a, String b){
        return a+ b;
    }
    public static Double subtract(Double a, Double b){
        return a -b;
    }
    public static int subtract(int a, int b ){
        return a-b;
    }




}
