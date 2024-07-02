/*
    Program to check if a collection is empty or not.
 */

package PredicateInterfaceDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;


public class PredicateDemo3 {
    public static void main(String[] args) {

        Predicate<Collection> p = c -> c.isEmpty();

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("a");

        ArrayList<String> l2 = new ArrayList<>();

        System.out.println(p.test(l1));
        System.out.println(p.test(l2));
    }
}
