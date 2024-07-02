package Deadlock;

public class MyThread extends Thread{
    TestA a = new TestA();
    TestB b = new TestB();

    public void test(){
        this.start(); // child thread is created. Now two threads: main & child

        a.test1(b); // main thread executes this line
    }

    @Override
    public void run(){
        b.test2(a); // child thread executes this line
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.test(); // we have to call functions using objects that are non-static
    }

}

/*
    If sleep method is not used there is chance deadlock won't happen.
    In the above program if we remove at least one synchronized keyword then the program won't enter into deadlock.
 */
