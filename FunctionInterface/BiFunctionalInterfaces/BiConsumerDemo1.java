package BiFunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {

    public static void main(String[] args) {
        BiConsumer<String, String> bc = (s1, s2) -> System.out.println(s1 + s2);
        bc.accept("String1", "String2");
    }
}
