package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet();
        /*
            // Different Constructor of HashSet Class
            LinkedHashSet<Integer> hashSet1 = new LinkedHashSet(); // Empty Constructor
            LinkedHashSet<Integer> hashSet2 = new LinkedHashSet(5); // With Initial Capacity
            LinkedHashSet<Integer> hashSet3 = new LinkedHashSet(10, 0.80f); // With Initial Capacity and With Load Factor
            LinkedHashSet<Integer> hashSet4 = new LinkedHashSet(numbers); // Using Some Collection
        */

        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);

//        numbers.clear(); // Remove All Elements of Set
//        System.out.println(numbers.contains(8)); // Check if Given Object is Present or Not
//        System.out.println(numbers.isEmpty()); // Check If Given Set is Empty or Not
//        System.out.println(numbers.remove(5)); // Remove Given Object From Present Set
//        System.out.println(numbers.size()); // Return Length of Set

        Integer []convertedArray = numbers.toArray(new Integer[numbers.size()]);
        System.out.println("Converted Array : " + Arrays.toString(convertedArray));
    }
}
