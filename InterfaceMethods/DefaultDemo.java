interface Interface1{
    default void m1(){
        System.out.println("Default Method");
    }
}

public class DefaultDemo implements Interface1{

    /* To override default methods with our own methods.

    public void m1()
    {
        System.out.println("My Own Implementation");
    }

     */

    public static void main(String[] args) {
        DefaultDemo d = new DefaultDemo();
        d.m1();
    }

}
