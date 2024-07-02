package ReentrantLockDemo;

public class ReentrantLockDemo2 {

    public static void main(String[] args) {

        Display d = new Display();

        MyThread t1 = new MyThread(d, "thread1");
        MyThread t2 = new MyThread(d, "thread2");

        t1.start();
        t2.start();

    }
}
