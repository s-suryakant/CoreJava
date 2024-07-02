import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        List<Integer> l1 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

        System.out.println("Even objects in list: ");
        System.out.println(l1);
    }
}
