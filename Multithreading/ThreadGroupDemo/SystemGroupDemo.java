package ThreadGroupDemo;

/*
    Q. Program to get all the threads from system thread group & all its sub thread groups?
 */

public class SystemGroupDemo {
    public static void main(String[] args) {

        //Thread.currentThread().getThreadGroup().list();

        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[system.activeCount()];

        system.enumerate(t);

        for(Thread t1 : t){
            System.out.println(t1.getName() +"\n Is Daemon or not? " + t1.isDaemon());
        }

    }
}
