package ThreadPriority;

import ThreadNaming.MyThread;

public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
        MyThread t = new MyThread();
        t.setPriority(7);
        System.out.println(t.getPriority());
    }
}

/*
    > Only for main thread the default priority is 5.
    > For all other threads default priority is inherited from parent thread i.e. whatever priority for parent thread has the same priority
    will be for the child thread.
 */