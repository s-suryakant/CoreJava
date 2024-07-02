import java.util.ArrayList;
import java.util.Collections;

public class CustomSortDemo {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();

        l.add(new Employee(200,"E1"));
        l.add(new Employee(100,"E2"));
        l.add(new Employee(300,"E3"));
        l.add(new Employee(400,"E4"));
        l.add(new Employee(500,"E5"));

        System.out.println("Before sorting : " + l);

        Collections.sort(l, (e1,e2) -> (e1.eno<e2.eno) ? -1:(e1.eno>e2.eno) ? 1:0);

        System.out.println("After sorting : " + l);
    }
}
