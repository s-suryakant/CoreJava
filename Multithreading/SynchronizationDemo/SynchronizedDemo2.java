package SynchronizationDemo;

public class SynchronizedDemo2 {
    public static void main(String[] args) {

        Display d1 = new Display();
        Display d2 = new Display();

        MyThread t1 = new MyThread(d1, "Sync1");
        MyThread t2 = new MyThread(d2, "Sync2");

        t1.start();
        t2.start();
    }
}

/*
    If multiple threads are operating on multiple java objects then synchronization is not required.
    It will give irregular output.

    This can be resolved by using class level lock by declaring the function being executed as "static synchronized", in our case we
    declare the display method as static synchronized.

    Learn: class level lock VS object level lock.

    ** While a thread is executing static synchronized method the remaining threads are not allowed to use any static synchronized method
       of that class. Remaining threads are allowed to use the following methods simultaneously -
           >> static methods
           >> synchronized instance methods
           >> normal instance classes
 */
