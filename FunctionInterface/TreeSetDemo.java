import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        //TreeSet<Integer> t = new TreeSet<>();
        /*
            TreeSet<Integer> t = new TreeSet<>(Comparator c);
         */

        TreeSet<Integer> t = new TreeSet<>((I1,I2) -> (I1>I2) ? -1:(I1<I2) ? 1:0);

        t.add(10);
        t.add(5);
        t.add(0);
        t.add(20);
        t.add(15);

        System.out.println(t);
    }
}
