/*
    Program to print current date & time using LocalDateTime class.
 */
import java.time.LocalDateTime;

public class LocalDemo3 {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yyyy = dt.getYear();

        System.out.printf("Date: %d-%d-%d",dd,mm,yyyy);

        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();

        System.out.printf("\nTime: %d:%d:%d",h,m,s);

    }
}
