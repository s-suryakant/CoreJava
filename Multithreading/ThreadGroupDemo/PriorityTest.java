package ThreadGroupDemo;

public class PriorityTest {

    public static void main(String[] args) {

        ThreadGroup g1 = new ThreadGroup("First Group");
        Thread t1 = new Thread(g1, "Thread1");
        Thread t2 = new Thread(g1, "Thread2");

        g1.setMaxPriority(3); // this takes effect for all the threads added to group after this.

        Thread t3 = new Thread(g1, "Thread3");

        System.out.println(t1.getPriority()); // priority remains same i.e. 5
        System.out.println(t2.getPriority()); // priority remains 5
        System.out.println(t3.getPriority()); // priority is 3 as Groups MaxPriority was set to 3

        t1.setPriority(10); // can only set the priority to max allowed group priority i.e. 3 in this case
        System.out.println(t1.getPriority());

        t3.setPriority(10); // can only set the priority to max allowed group priority i.e. 3 in this case
        System.out.println(t3.getPriority());

    }
}