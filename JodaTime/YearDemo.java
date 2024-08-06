import java.time.Year;
import java.util.Scanner;

public class YearDemo {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter year:");
        int n = sc.nextInt();
        Year y = Year.of(n);
        if(y.isLeap()){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
