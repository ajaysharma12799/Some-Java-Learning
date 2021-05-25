package CollectionFramework;

import java.util.Arrays;
import java.util.ArrayDeque;
public class Dequeue_ArrayDequeue_Class {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(3);
        arrayDeque.add(2);
        arrayDeque.add(6);
        arrayDeque.add(5);
        arrayDeque.add(9);

        arrayDeque.offerFirst(21); // Inserting Element at First of Queue
        arrayDeque.offerLast(51); // Inserting Element at Last of Queue

        Integer []convertedArray = arrayDeque.toArray(new Integer[arrayDeque.size()]);
        System.out.println("Converted Array : " + Arrays.toString(convertedArray));

        /*
         * Will Return Head of Queue, but Will Not Remove
         */
        System.out.println("Head of Queue : " + arrayDeque.element()); // Will Not Return Null
        System.out.println("Head of Queue : " + arrayDeque.peek()); // Will Return Null if Queue is Empty
    }
}
