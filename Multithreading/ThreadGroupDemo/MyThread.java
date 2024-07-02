package ThreadGroupDemo;

public class MyThread extends Thread{

    MyThread(ThreadGroup g, String name){
        super(g, name);
    }/* Constructor job is to associate thread group & name of the thread.
        This constructor is calling the super class i.e. Thread class constructor to get the job done.
    */

    @Override
    public void run(){
        System.out.println("Child thread executing");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){}
    }
}
