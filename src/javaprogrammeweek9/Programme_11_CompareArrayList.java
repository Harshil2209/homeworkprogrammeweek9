package javaprogrammeweek9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>(); // First ArrayList declaration
        a1.add("Pink");
        a1.add("Rose");
        a1.add("Red");
        a1.add("Black");
        a1.add("White");

        ArrayList<String> a2 = new ArrayList<>(); //Second ArrayList Declaration
        a2.add("Pink");
        a2.add("Rose");
        a2.add("Red");
        a2.add("White");

        System.out.println(a1);//Printing ArrayList a1 for user
        System.out.println(a2);//Printing ArrayList a2 for user
        boolean compare = a1.equals(a2); // Comparing the two ArrayList and returning boolean value
        System.out.println(compare); // Printing true or false depending on boolean value
    }
}
