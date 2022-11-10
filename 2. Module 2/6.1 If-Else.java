package com.doxalearn.LearnJava;

import java.util.Scanner;

/** Conditional Statements
 * Less than: a < b
 * Less than or equal to: a <= b
 * Greater than: a > b
 * Greater than or equal to: a >= b
 * Equal to a == b
 * Not Equal to: a != b
 *
 *  if (condition) {
 *      //code to execute based on condition
 *  }
 */

public class Main {

    public static void main(String[] args) {
        int grade;
        int passmark = 70;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        grade = scanner.nextInt();

        if(grade < passmark){
            System.out.println("You'll need to resit the course.");
        }else{
            System.out.println("You passed the course!!");
        }

        if(grade != 100){
            System.out.println("You didn't receive full marks");
        }
    }
}