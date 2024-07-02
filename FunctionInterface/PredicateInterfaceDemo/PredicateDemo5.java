/*
    Predicate example to remove null values & empty string to avoid NullPointer exception.
 */
package PredicateInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo5 {
    public static void main(String[] args) {

        String[] names = {"Surya", "Test1", "Test2", "Test3", null, "", null, "Test4"};

        Predicate<String> p = s -> s!=null && s.length()!=0;
        ArrayList<String> name = new ArrayList<>();

        System.out.println("List of valid names -");

        for (String n: names){
            if (p.test(n))
                name.add(n);
        }

        System.out.println(name);
    }
}
