/*
    Program to check if given number is greater than 10.
 */
package PredicateInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo1 {

    public static void main(String[] args) {
        Predicate<Integer> p = I -> I>10;
        System.out.println(p.test(100));
        System.out.println(p.test(5));
    }
}
