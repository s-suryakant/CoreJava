import java.util.ArrayList;

public class CountDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Surya");
        l.add("Suryakant");
        l.add("Shrikant");

        Long count = l.stream().filter(s -> s.length()>5).count();

        System.out.println("Number of strings whose length is greater than 5: " + count);
    }
}
