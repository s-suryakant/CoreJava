package ReentrantLockDemo;

import java.util.concurrent.locks.*;

public class MyThread3 extends Thread{

    public MyThread3(String name) {
        super(name);
    }

    static ReentrantLock l = new ReentrantLock();

    @Override
    public void run(){
        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+ " got lock & is performing safe operations");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            l.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " did not get lock & is performing alternate operations");
        }
    }
}
