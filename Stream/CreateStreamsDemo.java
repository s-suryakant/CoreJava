import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamsDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");
        Stream<String> s1 = list.stream();
        s1.forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(1,11,111,1111,11111);
        s2.forEach(System.out::println);

        Employee[] arrayOfEmps = {
                new Employee(1, "A"),
                new Employee(2, "B"),
                new Employee(3, "C")
        };
        Stream<Employee> employees = Stream.of(arrayOfEmps);
        employees.forEach(System.out::println);
    }
}
