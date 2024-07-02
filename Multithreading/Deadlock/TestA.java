package Deadlock;

public class TestA {

    public synchronized void test1(TestB b){
        System.out.println("Thread1 starts execution of test1() method");

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e) {
        }
        System.out.println("Thread1 trying to call TestB's last() method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside A's last method");
    }

}
