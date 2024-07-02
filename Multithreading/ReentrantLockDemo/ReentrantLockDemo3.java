package ReentrantLockDemo;

/*
    Demo program for tryLock() method
 */

public class ReentrantLockDemo3 {

    public static void main(String[] args) {

        MyThread3 t1 = new MyThread3("First Thread");
        MyThread3 t2 = new MyThread3("Second Thread");

        t1.start();
        t2.start();

    }
}
