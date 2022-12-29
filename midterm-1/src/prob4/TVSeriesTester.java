package prob4;

import java.util.ArrayList;
import java.util.Collections;

public class TVSeriesTester {
    public static void main(String[] args) {
        ArrayList<TVSeries> series = new ArrayList<>();
        series.add(new TVSeries("Firefly", 2002));
        series.add(new TVSeries("The Expanse", 2015));
        series.add(new TVSeries("Doctor Who", 2005));
        series.add(new TVSeries("Mr. Robot", 2005));

        Collections.sort(series);
        for (TVSeries s : series) {
            System.out.println(s);
        }
        // alternative way to iterate over arraylist:
        //series.forEach(x -> System.out.println(x));
    }
}