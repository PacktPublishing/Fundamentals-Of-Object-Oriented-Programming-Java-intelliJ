package com.doxalearn.LearnJava;

import java.util.Scanner;

/**
 *  Using if-then-else statements, allow a user to input a numerical
 *  grade and print the corresponding letter grade
 */

public class Main {

    public static void main(String[] args) {

        int testScore;
        char grade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a test score: ");
        testScore = scanner.nextInt();

        if(testScore >= 90){
            grade = 'A';
        }else if(testScore >= 80){
            grade = 'B';
        }else if(testScore >= 70){
            grade = 'C';
        }else if(testScore >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
    }
}