package BiFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.ArrayList;

public class BiFunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        BiFunction<String,Integer,Student> f=(name,rollno)->new Student(name,rollno);

        l.add(f.apply("Student-1",100));
        l.add(f.apply("Student-2",200));
        l.add(f.apply("Student-3",300));
        l.add(f.apply("Student-4",400));
        for(Student s : l)
        {
            System.out.println("Student Name:"+s.name);
            System.out.println("Student Rollno:"+s.rollno);
            System.out.println();
        }
    }
}
