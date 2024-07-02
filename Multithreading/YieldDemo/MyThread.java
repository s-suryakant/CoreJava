package YieldDemo;

public class MyThread extends Thread{

    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Currently running: " + Thread.currentThread().getName());
            Thread.yield(); /* if this line is commented then both the thread will be executed simultaneously & we can't expect
                                which thread will complete first. Because of yield main thread will get chance more number of times & the chance
                                of completing main thread first is high*/
        }
    }
}