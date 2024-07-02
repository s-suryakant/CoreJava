import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,String> m = new TreeMap<>((I1,I2) -> (I1>I2) ? -1:(I1<I2) ? 1:0);

        m.put(100 , "V1");
        m.put(500 , "V2");
        m.put(200 , "V3");
        m.put(300 , "V4");
        m.put(700 , "V5");

        System.out.println(m);
    }
}
