package com.doxalearn.LearnJava;

/**https://www.golinuxcloud.com/java-type-casting-examples/
*Implicit & Explicit - Type Casting
*/

public class Main {

    public static void main(String[] args) {

        //explicit
        //byte x = 7;
        double x = 333.14159;
        short s = (short)x;
        int i = (int)x;
        float f = (float)x;
        byte b = (byte)x;

        //Convert int to String
//        System.out.println("The integer value is: " + i);
//
//        String intValueToString = String.valueOf(i);
//        System.out.println("The string value is: " + intValueToString);

        //Convert String to int
        String myString = "24";
        System.out.println("The string value is: " + (myString + 6));

        int num = Integer.parseInt(myString);
        System.out.println("The integer value is: " + (num + 6));


//        System.out.println("Value of x before conversion: " + x);
//        System.out.println("Value of x converted to short: " + s);
//        System.out.println("Value of x converted to int: " + i);
//        System.out.println("Value of x converted to float: " + f);
//        System.out.println("Value of x converted to bytes: " + b);
    }
}