package javaprogrammeweek9;

import java.util.ArrayList;

public class Programme_4_ArrayListPrint {

    public static void main(String[] args){
        //creating arraylist of colours
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");
      // for each loop getting values and assigning to colour object and printing it
      for (Object colour : colours){
          System.out.println(colour);
      }
    }
}
