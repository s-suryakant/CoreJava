/*
    Program to check if a name starts with K
 */

package PredicateInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo4 {

    public static void main(String[] args) {

        String[] name = {"raj", "rahul", "karan", "Kaiser"};

        Predicate<String> p = s -> s.startsWith("K")||s.startsWith("k");
        System.out.println("The names that start with K/k:");
        for(String n: name){
            if (p.test(n))
                System.out.println(n);
        }
    }

}
