package BiFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo2 {

    public static void main(String[] args) {
        ArrayList<Employee2> l = new ArrayList<>();
        populate(l);

        BiConsumer<Employee2,Double> bc = (e,d) -> e.salary += d;

        for (Employee2 e : l){
            bc.accept(e,500.0);
        }

        for (Employee2 e : l){
            System.out.println("Employee name: " + e.name);
            System.out.println("Salary: " + e.salary);
            System.out.println();
        }
    }

    public static void populate(ArrayList<Employee2> l){
        l.add(new Employee2("Employee-1",1000));
        l.add(new Employee2("Employee-2",2000));
        l.add(new Employee2("Employee-3",3000));
        l.add(new Employee2("Employee-4",4000));
        l.add(new Employee2("Employee-5",5000));
    }

}
