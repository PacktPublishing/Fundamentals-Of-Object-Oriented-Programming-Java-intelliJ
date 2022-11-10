package com.doxalearn.LearnJava;

import java.util.Scanner;

/**
 * Simple program that will calculate the
 * interest that is earned on a dollar amount
 * invested at an interest rate of 0.035% for one year.
 * Both the interest earned and the value of the investment
 * after one year will be printed.
 */


public class Main {

    public static void main(String[] args) {

        //declare variables
        double principal;
        double rate = 0.035;
        double interest;

        Scanner scanner = new Scanner(System.in);

        //prompt user for amount
        System.out.println("Enter the principal: ");
        principal = scanner.nextDouble();

        //perform calculations
        interest = principal * rate;
        principal += interest; // same as principal = principal + rate

        //Output results
        System.out.printf("The interest earned is $%.2f" +
                            " The value of the investment after one year is $%.2f",
                            interest, principal
                );
    }
}