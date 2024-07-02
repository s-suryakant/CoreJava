package Deadlock;

public class TestB {

    public synchronized void test2(TestA a){
        System.out.println("Thread2 starts execution of test2() method");

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e) {
        }
        System.out.println("Thread2 trying to call TestA's last() method");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Inside B's last method");
    }

}
