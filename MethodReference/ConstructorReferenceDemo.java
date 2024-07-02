public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        DemoInterf i = Sample :: new;
        Sample s = i.get();
    }
}
