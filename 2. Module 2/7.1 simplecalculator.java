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
        char operation = 'd';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        switch (operation){
            case 'a':
                result = num1 + num2;
                break;
            case 's':
                result = num1 - num2;
                break;
            case 'm':
                result = num1 * num2;
                break;
            case 'd':
                 result = num2 != 0 ? num1 / num2 : 0;
                break;
            default:
                System.out.println("Invalid operation: " + operation);
                break;
        }
        System.out.println(result);
    }
}
