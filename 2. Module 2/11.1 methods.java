package com.doxalearn.LearnJava;

import java.util.Locale;

/** Methods
 *
 * modifier returnType nameOfMethod (Parameter List) {
 *    // method body
 *    return resultVariable
 * }
 */

public class Main {

    static void Greeting(String name){
        System.out.println("Hello " + name + " Jetson");
    }

    static void Greeting(String fname, String lname){
        System.out.println("Hello " + fname + " " + lname);
    }

    public static double CalculateAverage(double num1, double num2){
        return (num1 + num2)/2;
    }

    public static int FindMin(int num1, int num2){
        int min;
        if (num1 > num2) {
            min = num2;
        }else{
            min = num1;
        }
        return min;
    }

    public static String ConvertToUpper(String text){
        return text.toUpperCase();
    }

    public static void main(String[] args) {

        double x = 26;
        double y = 104;
        double average = 0;

        String myText = "the sun will come out tomorrow";

        System.out.println(ConvertToUpper(myText));

        //System.out.println(FindMin((int)x, (int)y));

//        average = CalculateAverage(x, y);
//        System.out.println(average);

//        Greeting("George");
//        Greeting("Jane");
//        Greeting("Judy");
//        Greeting("Elroy");
//
//        //overloaded function call
//        Greeting("Fred", "Flintstone");
//        Greeting("Pebbles", "Flintstone");
    }
}