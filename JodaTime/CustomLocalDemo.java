/*
    Program to create a custom LocalDataTime object
 */
import java.time.LocalDateTime;
import java.time.Month;

public class CustomLocalDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1998, Month.JUNE,11,5,45);

        System.out.println(dt);

        System.out.println("After six months: "+ dt.plusMonths(6));
        System.out.println("Before six months: "+ dt.minusMonths(6));
    }
}
