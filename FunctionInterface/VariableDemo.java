public class VariableDemo {

    int x = 10;

    public void m2(){
        int y = 20;
        Interf i = () ->{
            System.out.println(x);
            System.out.println(y);

            //y = 100;
            //System.out.println(y);
            /*
                CE: local variables referenced from a lambda expression must be final or effectively final
             */
        };

        i.m1();
    }

    public static void main(String[] args) {
        VariableDemo vd = new VariableDemo();
        vd.m2();
    }
}
