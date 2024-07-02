package ThreadGroupDemo;

public class Test  {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g1 = new ThreadGroup("First Group"); // creates new thread group with specified name
        System.out.println(g1.getParent().getName()); // parent of new thread group is the currently executing thread's group

        ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
        System.out.println(g2.getParent().getName()); // parent of new thread group is g1(First Group)
    }
}
