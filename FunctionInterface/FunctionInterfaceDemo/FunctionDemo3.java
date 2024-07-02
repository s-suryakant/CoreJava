/*
    Program to find Student Grade by using Function
 */

package FunctionInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionDemo3 {

    public static void main(String[] args) {

        ArrayList<Student> l = new ArrayList<>();
        populate(l);

        Function<Student,String> f = s -> {
            int marks = s.marks;
            if(marks >= 80)
                return "A [Distinction]";
            else if (marks >= 60)
                return  "B [First Class]";
            else if (marks >= 50)
                return "C [Second Class]";
            else if (marks >= 35)
                return "D [Third Class]";
            else
                return "E [Failed]";
        };

        for(Student student : l)
        {
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Marks: " + student.marks);
            System.out.println("Student Grade: " + f.apply(student));
        }

    }

    public static void populate(ArrayList<Student> l){
        l.add(new Student("Student 1", 100));
        l.add(new Student("Student 2", 65));
        l.add(new Student("Student 3", 55));
        l.add(new Student("Student 4", 45));
        l.add(new Student("Student 5", 25));
    }

}
