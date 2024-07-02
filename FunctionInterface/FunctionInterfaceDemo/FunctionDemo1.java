package FunctionInterfaceDemo;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {

        Function<String,Integer> f1 = s -> s.length();
        Function<Integer,Double> f2 = i -> (double)(i*i);

        System.out.println(f1.apply("Surya"));
        System.out.println(f2.apply(5));
    }

}
