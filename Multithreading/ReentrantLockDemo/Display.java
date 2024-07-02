package ReentrantLockDemo;

import java.util.concurrent.locks.*;

public class Display {

    ReentrantLock lock = new ReentrantLock();

    public void wish(String name){

        lock.lock();

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }

        lock.unlock();

    }
}
