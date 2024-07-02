package SleepDemo;

public class SlideRotator {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Current Thread: " + Thread.currentThread().getName());

        for(int i=1; i<=10; i++){
            System.out.println("Slide - " + i);
            Thread.sleep(1000);
        }
    }
}
