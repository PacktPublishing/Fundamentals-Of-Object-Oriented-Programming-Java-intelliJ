package com.doxalearn.LearnJava;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Boolean

        boolean isItRaining = true;
        boolean isVegetable = false;

    //Boolean Expressions
        int x = 7;
        int y = 3;

        String str1 = String.valueOf(isItRaining);
        String str2 = Boolean.toString(isVegetable);

        System.out.println(str1);
        System.out.println(str2);

       System.out.println(x>y);
       System.out.println(y==x);
       System.out.println(y>x);
       System.out.println(isItRaining);
       System.out.println(isVegetable);

    }
}