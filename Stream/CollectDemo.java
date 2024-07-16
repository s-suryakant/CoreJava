import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }

        List<Integer> result = l.stream().filter(s -> s%2 == 0).collect(Collectors.toList());

        System.out.println(result);
    }
}
