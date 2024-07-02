package InterruptDemo;

public class ThreadInterruptDemo2 {
    public static void main(String[] args) {

        MyThread2 t = new MyThread2();
        t.start();

        t.interrupt();

        System.out.println("Main thread executed");
    }
}
