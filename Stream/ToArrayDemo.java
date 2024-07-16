import java.util.ArrayList;

public class ToArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer[] result = list.stream().sorted((o1,o2) -> o2.compareTo(o1)).toArray(Integer[]::new);
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}
