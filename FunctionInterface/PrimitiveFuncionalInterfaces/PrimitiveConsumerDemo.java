package PrimitiveFuncionalInterfaces;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        populate(l);

        ObjDoubleConsumer<Employee> pc = (e,d) -> e.salary += d;

        for (Employee e : l)
            pc.accept(e,500);

        for (Employee e : l){
            System.out.println("Name of employee: " + e.name);
            System.out.println("Salary of employee: " + e.salary);
            System.out.println();
        }
    }

    public static void populate(ArrayList<Employee> l){
        l.add(new Employee("Employee-1",1000));
        l.add(new Employee("Employee-2",2000));
        l.add(new Employee("Employee-3",3000));
        l.add(new Employee("Employee-4",4000));
        l.add(new Employee("Employee-5",5000));
    }

}
