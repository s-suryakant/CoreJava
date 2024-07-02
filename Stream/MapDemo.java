import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        List<Integer> square = l.stream().map(i -> i*i).collect(Collectors.toList());

        System.out.println("List: ");
        System.out.println(l);
        System.out.println("Square of collection objects: ");
        System.out.println(square);
    }
}
