package solutions.session2.functions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class WeekDay {

    /*
    Write a function to calculate date of the month and print.
     */
    public static void main(String[] args) {
        String dayOfWeek = dayOfTheWeek();
        System.out.println("Today is " + dayOfWeek + ".");
    }

    private static String dayOfTheWeek() {
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.UK);
    }

}
