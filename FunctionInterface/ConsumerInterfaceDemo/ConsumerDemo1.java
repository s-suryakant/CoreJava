/*
    Display Movie Information by using Consumer
 */

package ConsumerInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo1 {

    public static void main(String[] args) {

        ArrayList<Movie> l = new ArrayList<>();
        populate(l);

        Consumer<Movie> c = movie -> {
            System.out.println("Movie name: " + movie.name);
            System.out.println("Hero name: " + movie.hero);
            System.out.println("Rating: " + movie.rating);
        };

        for (Movie m: l){
            c.accept(m);
            System.out.println();
        }
    }

    public static void populate(ArrayList<Movie> l){
        l.add(new Movie("Movie-1","Hero-1",5.6));
        l.add(new Movie("Movie-2","Hero-2",4.6));
        l.add(new Movie("Movie-3","Hero-3",5.5));
        l.add(new Movie("Movie-4","Hero-4",5.0));
        l.add(new Movie("Movie-5","Hero-5",7.0));
    }

}
