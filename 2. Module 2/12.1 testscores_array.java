package com.doxalearn.LearnJava;

import java.util.Scanner;

/**
 * Create a program that accepts 4 test scores from a user
 * and stores them in an array. The program should calculate
 * and print the sum and the average of the scores entered.
 */

public class Main {

    public static void main(String[] args) {

        //declare array
        int[] scores = new int[4];

        //create variables
        int sum = 0;
        Double average = 0.0;

        //scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        //initialize array with values
        for(int score : scores){

            //user prompt
            System.out.println("Enter test score: ");

            //add test score to array
            score = scanner.nextInt();

            //add all test scores
            sum += score;
        }

        //get the array length
        int arrayLength = scores.length;

        //calculate the average
        average = ((double)sum / (double)arrayLength); // Type Casting

        //print sum and average
        System.out.println("The sum of all the scores is: " + sum);
        System.out.println("The average score is: " + average);
    }
}