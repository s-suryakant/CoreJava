package ThreadLocalDemo;

public class ParentThread extends Thread{

    //static ThreadLocal tl = new ThreadLocal();
    /*
        When above line is used we are not able to access Parent ThreadLocal value when called in Child Thread.
     */

    //static InheritableThreadLocal tl = new InheritableThreadLocal();
    /*
        > When InheritableThreadLocal class is used by default child thread value is exactly the same as parent thread.
        > Child class of ThreadLocal & hence all methods present in ThreadLocal by default available to InheritableThreadLocal.
          The only extra function it has is childValue() method.
     */

    static InheritableThreadLocal tl = new InheritableThreadLocal()
    {

        @Override
        public Object childValue(Object p){
            return "CV";
        }

    };

    @Override
    public void run()
    {
        tl.set("PV");
        System.out.println(tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
