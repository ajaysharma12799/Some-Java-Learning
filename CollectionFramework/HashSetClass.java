package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet();
        /*
            // Different Constructor of HashSet Class
            HashSet<Integer> hashSet1 = new HashSet(); // Empty Constructor
            HashSet<Integer> hashSet2 = new HashSet(5); // With Initial Capacity
            HashSet<Integer> hashSet3 = new HashSet(10, 0.80f); // With Initial Capacity and With Load Factor
            HashSet<Integer> hashSet4 = new HashSet(numbers); // Using Some Collection
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
