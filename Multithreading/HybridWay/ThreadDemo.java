package HybridWay;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        Thread t1 = new Thread(t);

        t1.start();
        System.out.println("Main Thread");
    }
}
