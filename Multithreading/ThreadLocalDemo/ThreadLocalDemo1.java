package ThreadLocalDemo;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        System.out.println(tl.get()); //null
        tl.set("Test Value");
        System.out.println(tl.get()); //Test Value
        tl.remove();
        System.out.println(tl.get()); //null
    }
}
