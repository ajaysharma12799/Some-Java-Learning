package CollectionFramework;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class MapInterface_HashMap_Class {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        /*
        *
        *   Some Important Method That Work With Map
        *
        */
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.putIfAbsent("Four", 4);
        map.putIfAbsent("Five", 5);

        System.out.println(map.get("Five")); // Get Value that is associated with Given Key
        System.out.println(map.remove("Three")); // Remove and Retrieve Value associated with key
        System.out.println(map.containsKey("Six")); // Return True if Key is Present
        System.out.println(map.containsValue(3)); // Return True if Value is Present
        System.out.println(map.isEmpty()); // Return True if Map is Empty
        System.out.println(map.size()); // Return Size of Map
        // map.clear(); // Remove all Elements From Map

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry + " ");
        }
        System.out.println();

        /*
        *
        *   Some Important Method That Will Work With Key-Value Pair Of Map
        *
        */
        Set keySet = map.keySet(); // Will Return Set of Keys
        System.out.println(keySet);

        map.values(); // Will Return Collection of Value, Because Value can be Duplicated

        Set entrySet = map.entrySet(); // Will Return Set of Each Entry From Map
        System.out.println(entrySet);

    }
}
