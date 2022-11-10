package com.doxalearn.LearnJava;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Math
        double a;
        double b;
        double sum;
        double difference;
        double product;
        double quotient;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //Addition
//        System.out.println("Addition");
//
//        System.out.println("Please enter a number: ");
//        a = scanner.nextInt();
//
//        System.out.println("Please enter a second number: ");
//        b = scanner.nextInt();
//
//        sum = a+b;

        //Subtraction
//        System.out.println("Subtraction");
//
//        System.out.println("Please enter a number: ");
//        a = scanner.nextInt();
//
//        System.out.println("Please enter a second number: ");
//        b = scanner.nextInt();
//
//        difference = a-b;

        //Multiplication
//        System.out.println("Multiplication");
//
//        System.out.println("Please enter a number: ");
//        a = scanner.nextInt();
//
//        System.out.println("Please enter a second number: ");
//        b = scanner.nextInt();
//
//        product = a*b;

        //Division
        System.out.println("Division");

        System.out.println("Please enter a number: ");
        a = scanner.nextInt();

        System.out.println("Please enter a second number: ");
        b = scanner.nextInt();

        quotient = a/b;
		
		        //Modulus - Remainder
        System.out.println("Modulus");

        System.out.println("Please enter a number: ");
        a = scanner.nextInt();

        System.out.println("Please enter a second number: ");
        b = scanner.nextInt();

        modulus = a%b;

        System.out.println("The quotient is: " + df.format(quotient));
        System.out.printf("The quotient is: %.2f", quotient);
    }
}