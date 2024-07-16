import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("String - 1");
        list.add("String - 2");
        list.add("String - 3");
        list.add("String - 4");
        list.add("String - 5");

        list.stream()
                .forEach(s -> System.out.println(s));
    }
}
