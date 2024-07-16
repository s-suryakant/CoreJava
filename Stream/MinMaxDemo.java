import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,1,21,13,41,15,61,17,81,19);

        Optional<Integer> min = list.stream().min((o1, o2) -> o1.compareTo(o2));
        Optional<Integer> max = list.stream().max((o1, o2) -> o1.compareTo(o2));

        if(min.isPresent()){
            System.out.println("Minimum element: " + min.get());
        }
        else{
            System.out.println("NULL");
        }

        if (max.isPresent()){
            System.out.println("Maximum element: " + max.get());
        }
        else
            System.out.println("Null");
    }
}
