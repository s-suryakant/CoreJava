package ThreadLocalDemo;

/*
    Code to override initialValue() method for ThreadLocal
 */
public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal()
        {
            /*
                > Creating child class
                > Anonymous inner class for ThreadLocal
                > Overriding initialValue() method in this child class
             */
            @Override
            public Object initialValue()
            {
                return "Override Value";
            }
        };
        System.out.println(tl.get()); //null
        tl.set("Test Value");
        System.out.println(tl.get()); //Test Value
        tl.remove();
        System.out.println(tl.get()); //null
    }
}
