package DaemonDemo;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}