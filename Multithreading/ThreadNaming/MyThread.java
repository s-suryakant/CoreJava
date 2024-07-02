package ThreadNaming;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Child Thread");
    }
}
