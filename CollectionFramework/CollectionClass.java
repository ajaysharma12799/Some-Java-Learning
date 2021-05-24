package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList<Integer> numbers = new ArrayList(5);

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(4);

        numbers.add(9);
        numbers.add(2);
        numbers.add(0);
        numbers.add(1);
        numbers.add(7);

        Collections.sort(arrayList); // Sorting Collection in Ascending Order
        Collections.sort(arrayList, Collections.reverseOrder()); // Sorting Collection in Descending Order
        Collections.fill(numbers, 5); // Filling Array With Specific Element


        Integer []convertedArray = arrayList.toArray(new Integer[arrayList.size()]);
        System.out.println("Converted Array : " + Arrays.toString(convertedArray));
        System.out.println("Min Element : " + Collections.min(arrayList));
        System.out.println("Max Element : " + Collections.max(arrayList));
        System.out.println("Binary Search Result Position : " + Collections.binarySearch(arrayList, 5));

        Integer []convertedNumbersArray = numbers.toArray(new Integer[numbers.size()]);
        System.out.println("Converted Numbers Array : " + Arrays.toString(convertedNumbersArray));
        System.out.println("Frequency of Element : "  + Collections.frequency(numbers, 5));
    }
}
