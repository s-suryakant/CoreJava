package ConsumerInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PFCDemo {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        populate(l);

        Predicate<Student> p = s -> s.marks >= 60;

        Function<Student,String> f = s ->{
            int marks = s.marks;
            if (marks >= 80)
                return "A [Distinction]";
            else if (marks >= 60)
                return "B [First Class]";
            else if (marks >= 50)
                return "C [Second Class]";
            else if (marks >= 40)
                return "C [Third Class]";
            else
                return "E [Failed]";
        };

        Consumer<Student> c = s ->{
            System.out.println("Student name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Grade: " + f.apply(s));
        };

        for (Student s: l){
            if(p.test(s)){
                c.accept(s);
            }
        };
    }

    public static void populate(ArrayList<Student> l){
        l.add(new Student("Student-1",100));
        l.add(new Student("Student-2",65));
        l.add(new Student("Student-3",55));
        l.add(new Student("Student-4",45));
        l.add(new Student("Student-5",25));
    }

}
