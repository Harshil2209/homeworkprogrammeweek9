package javaprogrammeweek9;

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {

        //Hashmap declaration storing String keys and Integer values
        Map<String, Integer> people = new HashMap<>();
        people.put("Harry Patel", 1);
        people.put("Shrey Patel", 2);
        people.put("Hiren Patel", 3);
        people.put("Sanny Patel", 4);
        people.put("Sam Patel", 5);

        //Enhanced for loop setting the values and printing them
        for (Map.Entry<String, Integer> list : people.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey());
        }
    }
}
