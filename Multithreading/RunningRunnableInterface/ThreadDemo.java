package RunningRunnableInterface;

public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread();
        Thread t2 = new Thread(r); /*r is Target Runnable
                                    if r is not passed Thread class run method is called */

        /*
        t1.start(); // new thread is created which is responsible for run method execution of Thread class.
        t1.run(); // no new thread is called & run method of Thread class is executed just like a normal method call.
         */

        t2.start(); // new thread is created which is responsible for execution of run method of MyRunnable class
        t2.run(); // no new thread is created & run function of MyRunnable class is executed just like a normal method call

        /* r.start();  compilation error is thrown as MyRunnable class doesn't have start capability
        java: cannot find symbol
        symbol:   method start()
        location: variable r of type RunningRunnableInterface.MyRunnable
        */

        //r.run(); // no new thread is created & MyRunnable run method is executed just like a normal method call

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}
