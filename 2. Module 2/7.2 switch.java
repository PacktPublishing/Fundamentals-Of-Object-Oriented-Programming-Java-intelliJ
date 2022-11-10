package com.doxalearn.LearnJava;

import java.util.Scanner;

/** Switch Statement
 * switch(expression) {
 *   case x:
 *     // code block
 *     break;
 *   case y:
 *     // code block
 *     break;
 *   default:
 *     // code block
 * }
 * Create program which prints the day of the week based on numbers 1 - 7.
 */

public class Main {

    public static void main(String[] args) {

        int day;

        //while loop to run program until ready to quit - Stop video at 2.22
        while (true){
            //prompt user for a day
            System.out.println("Enter a day of the week: ");
            Scanner scanner = new Scanner(System.in);

            day = scanner.nextInt();

            switch (day){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Selected day was out of range.");
            }//end switch
        }
    }
}