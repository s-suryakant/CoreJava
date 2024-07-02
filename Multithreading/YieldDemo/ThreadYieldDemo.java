package YieldDemo;

public class ThreadYieldDemo {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Currently running: " + Thread.currentThread().getName());
            //Thread.yield();
        }
    }
}

/* Some platforms or OS won't provide proper support for yield method.
Preemptive Scheduling vs Non-preemptive Scheduling
 */
