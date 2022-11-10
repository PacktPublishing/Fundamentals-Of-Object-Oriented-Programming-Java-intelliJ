package com.doxalearn.LearnJava;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/** Write a program that calculates the age difference
 *  between two siblings born March 3rd, 1999 and
 *  September 20th, 2003.
*/

public class Main {

    public static void main(String[] args) {

        //  create dates
        LocalDate firstDate = LocalDate.of(1999, Month.MARCH, 3);
        LocalDate secondDate = LocalDate.of(2003, Month.SEPTEMBER, 20);

        //  calculate time between dates
        Period periodOfTime = Period.between(firstDate, secondDate);

        //  print result
        System.out.println("The difference in years is: ");
        System.out.println(periodOfTime.getYears() + " years,");
        System.out.println(periodOfTime.getMonths() + " months,");
        System.out.println(periodOfTime.getDays() + " days");
    }
}