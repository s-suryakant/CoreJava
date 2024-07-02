package PredicateInterfaceDemo;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthDemo {

    public static void main(String[] args) {
        Predicate<User> userPredicate= user -> user.username.equals("User") && user.password.equals("Test@password");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter password:");
        String password = sc.next();

        User user = new User(username, password);

        if (userPredicate.test(user))
            System.out.println("Valid User");
        else
            System.out.println("Invalid user");
    }

}
