package CollectionFramework;

import java.util.*;
public class ListInterface {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // List of ArrayList Type
        List<String> fruits = new LinkedList<>(); // List of LinkedList Type

        // Adding Element into List
        names.add("Ajay");
        names.add("Sharma");
        names.add(2, "Tanu");
        names.add(3, "Sharma");
        //names.add(null); // We Can Add Null But While iterating it will give null pointer exception
        names.add("Ajay");

        // Converting List into Array
        String []convertedNamesArray = names.toArray(new String[names.size()]);
        System.out.println(Arrays.toString(convertedNamesArray));

        fruits.addAll(names); // inserting element into Collection via Collection
        fruits.set(0, "Dates"); // Updating Element
        System.out.println(fruits.get(1)); // Getting Element at Specific Index

        // Converting List into Array
        String []convertedFruitsArray = fruits.toArray(new String[fruits.size()]);
        System.out.println(Arrays.toString(convertedFruitsArray));

        Collections.sort(names); // Sorted List
        System.out.println("Sorted List : ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

/*
* Inherit Collection Interface
* Maintain Ordered Collection
* Contain Indexed Based Method to insert, delete, search and update Elements
* Can have duplicate Elements and Can also Store null Elements
* Present in java.util Package, Complete Import is [ import java.util.List ]
*/
