package com.doxalearn.LearnJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/** DateTime
*/

public class Main {

    public static void main(String[] args) {

        //  current time
        LocalTime time = LocalTime.now();
        //  current date
        LocalDate date = LocalDate.now();
        //  datetime
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy:MM:dd :: HH:mm:ss"); // formatting for datetime
        String dateTimeFormat = dateTime.format(format);
        // time zone
        ZonedDateTime timeZoneNow = ZonedDateTime.now();

        System.out.println("Local time: " + time);
        System.out.println("\nCurrent date: " + date);
        System.out.println("\nDate time: " + dateTime);
        System.out.println("\nDate time after formatting: " + dateTimeFormat);
        System.out.println("\nTime in time zone: " + timeZoneNow);
        System.out.println("\nTime in time zone: " + timeZoneNow.getOffset());
    }
}