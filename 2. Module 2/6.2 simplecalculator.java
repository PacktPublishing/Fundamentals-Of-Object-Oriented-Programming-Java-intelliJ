package com.doxalearn.LearnJava;

import java.util.Scanner;

/**
 *  Calculator
 *  If/else, switch, ternary
 */

public class Main {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char operation = 's';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(operation == 'a')
            result = num1 + num2;
        else if(operation == 's')
            result = num1 - num2;
        else if(operation == 'm')
            result = num1 * num2;
        else if(operation == 'd'){
            if(num2 != 0)
                result = num1 / num2;
            else System.out.println("Cannot divide by zero.");
        }
        else{
            System.out.println("Invalid operation: " + operation);
            result = 0;
        }
        System.out.println(result);
    }
}