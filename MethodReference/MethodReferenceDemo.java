public class MethodReferenceDemo {

    public static void m1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread - Static Method");
        }
    }

    public void m2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread - Instance Method");
        }
    }

    public static void main(String[] args) {

        Runnable r1 = MethodReferenceDemo::m1;
        Thread t1 = new Thread(r1);

        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

        MethodReferenceDemo obj = new MethodReferenceDemo();
        Runnable r2 = obj :: m2;
        Thread t2 = new Thread(r2);

        t2.start();
    }
}
