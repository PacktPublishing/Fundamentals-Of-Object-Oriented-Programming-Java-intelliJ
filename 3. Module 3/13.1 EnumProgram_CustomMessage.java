package com.doxalearn.LearnJava;

import java.util.Locale;
import java.util.Scanner;

/** Enum Exercise
 *
 *  Prompt a user to enter a day of the week which should
 *  output a different message for each day.
 *  - Create an Enum class to store the days of the week.
 *  - Create a DayChecker class containing the enum as a data member,
 *  - The DayChecker constructor should accept the value entered
 *    by the user and output a different message for each day. **hint - use switch statement
 */

public class Main {

    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a day of the week: ");
        input = scanner.nextLine().toUpperCase();

        DayChecker day = new DayChecker(DayOfWeek.valueOf(input));
        day.CustomMessage();
    }
}
package com.doxalearn.LearnJava;

public enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
package com.doxalearn.LearnJava;

public class DayChecker {
    DayOfWeek day;

    public DayChecker(DayOfWeek day){
        this.day = day;
    }

    // method to print custom message based on day of week
    public void CustomMessage(){

        switch (day){
            case SUNDAY:
                System.out.println("Easy like a Sunday morning");
                break;
            case MONDAY:
                System.out.println("Seize the day!");
                break;
            case TUESDAY:
                System.out.println("It's time for taco Tuesdays!!");
                break;
            case WEDNESDAY:
                System.out.println("Happy hump day!");
                break;
            case THURSDAY:
                System.out.println("One more day till Friday...");
                break;
            case FRIDAY:
                System.out.println("TGIF!!");
                break;
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Well that doesn't seem to be a day of the week.");
                break;
        }
    }
}