/*
    Program to print current system Local Date & Time
 */

import java.time.LocalDate;
import java.time.LocalTime;

class LocalDemo{

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}