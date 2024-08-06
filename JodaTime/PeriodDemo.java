/*
    Program to implement Period class. 0
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998,Month.JUNE,11);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday,today);
        System.out.printf("Your age is %d Years, %d Months, %d Days",p.getYears(),p.getMonths(),p.getDays());
    }
}
