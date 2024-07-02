package ReentrantLockDemo;

public class ReentrantLockDemo4 {

    public static void main(String[] args) {

        MyThread4 t1 = new MyThread4("First Thread");
        MyThread4 t2 = new MyThread4("Second Thread");

        t1.start();
        t2.start();

    }
}
