package ThreadLocalDemo;

public class CustomerThread extends Thread{
    static Integer custId = 0;

    private static ThreadLocal tl = ThreadLocal.withInitial(() -> ++custId);
    /*
        > Overriding initial value.
     */
    CustomerThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " executing with customer id: " + tl.get());
    }
}
