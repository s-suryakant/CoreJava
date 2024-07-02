/*
    Code to avoid ambiguity problems in case of multiple inheritance for default methods.
 */

interface Left{
    default void m1(){
        System.out.println("Left Default Method");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right Default Method");
    }
}

public class MultipleInheritanceDemo implements Left,Right {

    @Override
    public void m1() {
        System.out.println("My own implementation");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo mi = new MultipleInheritanceDemo();
        mi.m1();
    }

}
