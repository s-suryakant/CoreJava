package InterruptDemo;

public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Lazy Thread");
                Thread.sleep(5000);
            }
        }catch(InterruptedException e){
                System.out.println("Lazy Thread interrupted");
        }
    }
}
