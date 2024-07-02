package JoinDemo;

public class ThreadJoinDemo2 {

    public static void main(String[] args) throws InterruptedException {

        MyThread2.mt =  Thread.currentThread();

        MyThread2 t = new MyThread2();
        t.start();

        // t.join(); //if this line is used  then both child & main thread will wait forever & o output is

        for(int i=0; i<10; i++){
            System.out.println("Currently executing: " + Thread.currentThread().getName());
            Thread.sleep(2000);
        }

    }
}
