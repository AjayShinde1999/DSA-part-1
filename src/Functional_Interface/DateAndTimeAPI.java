package Functional_Interface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // year-month-date
        System.out.println(date);

        LocalTime time = LocalTime.now(); // hours, minutes, seconds.nanoseconds
        System.out.println(time);

        LocalDateTime dateAndTime = LocalDateTime.now(); // combination of date and time
        System.out.println(dateAndTime);

        // formatting the pattern
        LocalDate date1 = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format = date1.format(dateTimeFormatter);
        System.out.println(format);
    }
}
