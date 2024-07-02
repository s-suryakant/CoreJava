package ThreadPriority;

public class ThreadPriorityTest {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.setPriority(10);
        t.start();
        System.out.println("Main Thread");
    }
}

/*
NOTE: Some platforms won't provide proper support for thread priorities which may result in unexpected results like in our case.
 */