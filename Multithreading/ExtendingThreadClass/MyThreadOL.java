package ExtendingThreadClass;

public class MyThreadOL extends Thread{
    public void run(){
        System.out.println("no arg run");
    }
    public void run(int num){
        System.out.println("int arg run");
    }
}
