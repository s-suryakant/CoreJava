package FunctionInterfaceDemo;
/*
    Remove blanks from a string
    Count the number of blanks
*/

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        Function<String,String> f1 = s -> s.replaceAll(" ", "");
        Function<String,Integer> f2 = s -> s.length() - s.replaceAll(" ", "").length();

        System.out.println(f1.apply("This is a test string"));
        System.out.println(f2.apply("This is a test string"));
    }
}
