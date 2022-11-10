package com.doxalearn.LearnJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// User Input

        Scanner scanner = new Scanner(System.in);

        // user prompt
        System.out.println("Enter your name: ");

        //store user's input
        String name = scanner.nextLine();

        //prompt for age to see if the user is eligible to vote - voting age is 18yrs
        System.out.println("Enter your age: ");

        //store age
        int age = scanner.nextInt();

        //print user's name
        System.out.println("Hello "+name);

        //conditional check
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }

    }
}