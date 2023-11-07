package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.List;

public class Programme_6_RetrieveElementArrayList {

    public static void main(String[] args) {

        //Creating Arraylist of colours
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");

        String element = colours.get(1);
        System.out.println("Second element stored in Array is: " + element);
        element = colours.get(3);
        System.out.println("Fourth element stored in Array is: " + element);
    }
}
