interface  Interface2{
    public static void m1(){
        System.out.println("Static Method");
    }
}

public class StaticMethodDemo implements Interface2{

    public static void main(String[] args) {
        StaticMethodDemo sm = new StaticMethodDemo();
        //m1(); //
        //sm.m1(); //
        //StaticMethodDemo.m1();
        Interface2.m1();
    }
}
