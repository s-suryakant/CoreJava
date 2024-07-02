package DaemonDemo;

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true); // throws RuntimeError IllegalThreadStateException

        MyThread t = new MyThread();

        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}

/*
    >> Prototypes:
        public boolean isDaemon()
        public void setDaemon(boolean b)
    > Changing daemon nature is possible only before starting of a thread. After starting a thread if we attempt to change
      its Daemon nature we get RuntimeError IllegalThreadStateException.
    > By default, main thread is always non-daemon & it is impossible to change its daemon nature because it is already started
      by JVM at beginning.
    > For all remaining threads daemon nature is inherited from parent to child.
 */