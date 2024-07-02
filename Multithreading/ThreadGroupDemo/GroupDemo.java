package ThreadGroupDemo;

public class GroupDemo {

    public static void main(String[] args) throws InterruptedException{
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg, "Child Group");

        MyThread t1 = new MyThread(pg, "CT1");
        MyThread t2 = new MyThread(pg, "CT2");
        t1.start();
        t2.start();

        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());

        pg.list();
        Thread.sleep(10000);

        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }
}

/*
    System -- main -- ParentGroup -- CT1
                                  -- CT2
                                  -- ChildGroup
 */