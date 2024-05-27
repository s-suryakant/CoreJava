package ReentrantLockDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 extends Thread{
    
    static ReentrantLock l = new ReentrantLock();

    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run(){
        do {
            try {
                if (l.tryLock(5000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName() + " got the lock");
                    Thread.sleep(15000);
                    System.out.println(Thread.currentThread().getName()+ " releases the lock");
                    l.unlock();
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName()+" unable to get the lock & will try again");
                }
            }catch (InterruptedException e){}
        }while(true);
    }
    
}
