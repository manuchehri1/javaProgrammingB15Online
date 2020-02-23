package day63_Set_Review_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Practice_My {

    public static void main(String[] args) {

        Map<String,Double> groceryItems = new HashMap<>();
        groceryItems.put("apple", 3.99);
        groceryItems.put("peach", 2.99);
        groceryItems.put("banana", 4.00);
        groceryItems.put("spinach", 1.99);
        groceryItems.put("lime", 2.00);

        System.out.println("groceryItems = " + groceryItems);

        groceryItems.put("lime", 5.00);
        

        System.out.println("groceryItems = " + groceryItems);

        groceryItems.putIfAbsent("grapes",4.00);
        System.out.println("groceryItems = " + groceryItems);

        System.out.println(groceryItems.get("banana"));


    }
}
