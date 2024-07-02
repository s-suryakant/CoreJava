package InterruptDemo;

public class MyThread2 extends Thread{

    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Lazy Thread - " + i);
        }
        try {
            System.out.println("I want to sleep");
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Lazy Thread interrupted");
        }
    }
}
