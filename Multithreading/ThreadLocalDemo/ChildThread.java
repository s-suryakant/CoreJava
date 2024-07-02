package ThreadLocalDemo;

public class ChildThread extends Thread{

    @Override
    public void run(){
        System.out.println("Child value: " + ParentThread.tl.get());
    }
}
