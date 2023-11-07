package javaprogrammeweek9;

import java.util.ArrayList;
import java.util.List;

public class Programme_7_IsArrayListEmpty {

    public static void main(String[] args) {
        //Creating ArrayList of Colours
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");

        //Creating Blank ArrayList
        List<Integer> numbers = new ArrayList<>();

        if (numbers.isEmpty()) {       //Checking colours ArrayList and returning message
            System.out.println("Numbers ArrayList is not Empty.");
        } else {
            System.out.println("Numbers ArrayList is not Empty.");
        }
        if (colours.isEmpty()) {      //Checking numbers ArrayList and returning message
            System.out.println("Colours ArrayList is Empty.");
        } else {
            System.out.println("Colours ArrayList is not Empty.");
        }
    }
}
