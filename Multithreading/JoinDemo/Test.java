package JoinDemo;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}

/*
    Whenever a thread calls join function on itself the thread enters waiting state forever
 */