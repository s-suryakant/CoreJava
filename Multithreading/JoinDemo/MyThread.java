package JoinDemo;

public class MyThread extends Thread{

    @Override
    public void run(){

        for(int i=0; i<10; i++){
            System.out.println("Currently Executing: " + Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){};
        }
    }
}
