package com.doxalearn.LearnJava;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Text - Strings - Add trim and upper/lower

        String movieQuote = "Winter is coming.";
        String movieQuote2 = " \"Brace yourself...\"";
        int stringLength = movieQuote.length();
        boolean result1 = movieQuote.equals(movieQuote2);

        // declare string using new keyword
        String text = new String("The little dog laughed to see such fun.");

        System.out.printf("The length of our quote is: %d" +
                            " The second movie quote is: %s" +
                            " The value of our boolean is: %b",
                            stringLength, movieQuote2, result1
                );


       System.out.println(text);
       System.out.println("The first quote and second quote are equal: " + result1);
       System.out.println(movieQuote.concat(movieQuote2));
       System.out.println("The length of the quote is: " + stringLength);

    }
}