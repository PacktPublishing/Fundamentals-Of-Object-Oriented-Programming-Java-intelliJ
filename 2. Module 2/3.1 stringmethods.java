package com.doxalearn.LearnJava;

import java.util.Locale;

/** Strings
 *
 */

public class Main {

    public static void main(String[] args) {

        String course1 = new String("Java"); // using new keyword
        String course2 = "C++"; // using string literal
        String myCourses = course1 + " " + course2;
        String s = "     I'm learning how to program at doxalearn!";
		String s = "     I'm learning, how to, program at, doxalearn!";
        String[] arrayString = s.split(",");

        // String methods
        //System.out.println(myCourses);

        System.out.println("The output of s.length(): " + s.length());
        System.out.println("The output of s.charAt(5): " + s.charAt(5));
        System.out.println("The output of s.substring(4): " + s.substring(4));
        System.out.println("The output of s.substring(6, 11): " + s.substring(6, 11));
        System.out.println("The output of s.trim(): " + s.trim());
        System.out.println("The index of program is: " + s.indexOf("program"));
        System.out.println("The output of s.toUpperCase: " + s.toUpperCase());
        System.out.println("The output of s.toLowerCase: " + s.toLowerCase());
        System.out.println("The output of course1.concat(course2) is: " + course1.concat(course2));
        System.out.println("The output of course1.equals(course2) is: " + course1.equals(course2));
		
		for(int i = 0; i < arrayString.length; i++){
			System.out.println(arrayString[i]);
        }

    }
}