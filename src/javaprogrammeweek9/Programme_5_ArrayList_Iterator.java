package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programme_5_ArrayList_Iterator {
    public static void main(String[] args) {
        //Creating ArrayList of Colours
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");
        //Iterating and printing the array by Iterator
        Iterator<String> colourIterator = colours.iterator();
        while (colourIterator.hasNext()) {
            System.out.println(colourIterator.next());
        }
    }
}
