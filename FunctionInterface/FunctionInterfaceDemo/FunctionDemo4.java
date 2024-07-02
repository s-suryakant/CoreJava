/*
    Program to find Total Monthly Salary of All Employees by using Function
    Program to perform Salary Increment for Employees by using Predicate & Function
 */
package FunctionInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo4 {

    public static void main(String[] args) {

        ArrayList<Employee> l1 = new ArrayList<>();
        populate(l1);

        Function<ArrayList<Employee>,Double> f1 = employees ->{
            double total = 0;
            for (Employee s : employees){
                total += s.salary;
            }
            return total;
        };

        System.out.println("List of employees: ");
        System.out.println(l1);
        System.out.println("Total salary of all employees: " + f1.apply(l1));

        Predicate<Employee> p = employees -> employees.salary>3500;
        Function<Employee,Employee> f2 = employee -> {
            employee.salary += 500;
            return employee;
        };

        System.out.println("List of employees before salary increase: ");
        System.out.println(l1);

        ArrayList<Employee> l2 = new ArrayList<>();
        for (Employee employee: l1){
            if (p.test(employee)){
                l2.add(f2.apply(employee));
            }
        }
        System.out.println("List of employees with increased salary: ");
        System.out.println(l2);

    }

    public static void populate(ArrayList<Employee> l){
        l.add(new Employee("Employee-1",1000));
        l.add(new Employee("Employee-2",2000));
        l.add(new Employee("Employee-3",3000));
        l.add(new Employee("Employee-4",4000));
        l.add(new Employee("Employee-5",5000));
        l.add(new Employee("Employee-6",10000));
    }

}
