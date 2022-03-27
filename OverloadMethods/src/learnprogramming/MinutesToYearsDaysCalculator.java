package learnprogramming;

import java.sql.SQLOutput;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600; // minutes divide by minutes in a year
            long days = minutes % (1440 * 365) / (1440);  // calc min in days with remainder min * days in year divide by minutes
            System.out.println(minutes + " min = " + years + " years and " + days + " days");
        }
    }
}
