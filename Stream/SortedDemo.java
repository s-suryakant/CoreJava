import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("The custom sorted stream is : ");
        list.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);
    }
}
