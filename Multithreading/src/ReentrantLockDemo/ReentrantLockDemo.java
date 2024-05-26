package ReentrantLockDemo;
import java.util.concurrent.locks.*;

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ReentrantLock l = new ReentrantLock();

        l.lock();
        l.lock();

        System.out.println(l.isLocked());
        System.out.println(l.isHeldByCurrentThread());
        System.out.println(l.is);
    }
}
