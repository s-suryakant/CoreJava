import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(1);
        System.out.println("Before sorting :" + list);

        //Collections.sort(list);
        /*
            Collections.sort(list, ComparatorObject);
            If ComparatorObject is not used default sorting is implemented that is ascending order in case of integer values.
            >> public class MyComparator{
                public int compare(Integer I1, Integer I2){
                    return (I1>I2) ? -1:(I1<I2) ? 1:0;
                }
               }
            > pass the ComparatorObject of MyComparator class to get list sorted in descending order.
         */

        Collections.sort(list, (I1 , I2) -> (I1>I2) ? -1:(I1<I2) ? 1:0);

        System.out.println("After sorting :" + list);
    }
}
