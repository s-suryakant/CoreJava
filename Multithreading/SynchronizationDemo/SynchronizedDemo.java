package SynchronizationDemo;

public class SynchronizedDemo {
    public static void main(String[] args) {

        Display d = new Display();
        MyThread t1 = new MyThread(d, "Sync1");
        MyThread t2 = new MyThread(d, "Sync2");

        t1.start();
        t2.start();
    }
}

/*
    If multiple threads are executing on the same java object then synchronization is required.
    It will give regular output.
 */
