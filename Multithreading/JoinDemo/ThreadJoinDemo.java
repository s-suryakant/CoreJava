package JoinDemo;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();

        t.join(); //waiting of main thread until completing child thread

        for(int i=0; i<10; i++){
            System.out.println("Currently executing: " + Thread.currentThread().getName());
        }

    }
}
