/*
    To check if length of given string is >5.
 */
package PredicateInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String[] args) {
        Predicate<String> p = s -> s.length()>5;
        System.out.println(p.test("abc"));
        System.out.println(p.test("abcdef"));
    }
}
