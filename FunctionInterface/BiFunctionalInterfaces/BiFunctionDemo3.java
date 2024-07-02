package BiFunctionalInterfaces;

import PredicateInterfaceDemo.Employee;

import java.util.function.BiFunction;

public class BiFunctionDemo3 {
    public static void main(String[] args) {

        BiFunction<Employee1,Timesheet,Double> bf = (e,t) -> e.dailyWage*t.days;

        Employee1 e = new Employee1(101,"Employee-1",1500);
        Timesheet t = new Timesheet(101,20);

        System.out.println("Employee monthly salary: " + bf.apply(e,t));
    }
}
