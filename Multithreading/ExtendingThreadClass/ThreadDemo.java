package ExtendingThreadClass;

public class ThreadDemo {
    public static void main(String[] args) {
        //By default, Java has this main thread. Main thread is responsible for execution of main function
        /*It also has Daemon Threads
                A daemon thread is a thread that runs in the background and does not prevent the Java Virtual Machine (JVM) from exiting
                when all non-daemon threads in Java have been completed. These threads are typically used to perform background tasks such
                as garbage collection, monitoring, and other system-level operations.
         */

        MyThread t = new MyThread(); /* Thread Instantiation
                                            main thread creates a child thread object, this is known as thread instantiation. */

        t.start(); /*Starting of a thread(now 2 threads: main & child)
                        Thread class start() method is called & it establishes a new thread*/

        /*t.run(); //No new thread is created, run method will be executed just like a normal method call by main thread.
                    Output will be:    Child Thread x10
                                       Main Thread x10
        */

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }
}