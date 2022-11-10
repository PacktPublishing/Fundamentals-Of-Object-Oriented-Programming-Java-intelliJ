package com.doxalearn.LearnJava;

import java.util.Scanner;

/** Logical Operators
 * !	Boolean NOT
 * &&	Boolean AND
 * ||	Boolean OR
 */

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.println(x<5 && x<10);
        System.out.println(x<5 || x<4);
        System.out.println(y>x || y==3);
        System.out.println(y!=x && y>=x);
    }
}