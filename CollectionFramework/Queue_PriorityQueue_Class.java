package CollectionFramework;

import java.util.Arrays;
import java.util.PriorityQueue;
public class Queue_PriorityQueue_Class {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(6);

        priorityQueue.offer(10);

        Integer []convertedArray = priorityQueue.toArray(new Integer[priorityQueue.size()]);
        System.out.println("Converted Array : " + Arrays.toString(convertedArray));

        /*
        * Will Return Head of Queue, but Will Not Remove
        */
        System.out.println("Head of Queue : " + priorityQueue.element()); // Will Not Return Null
        System.out.println("Head of Queue : " + priorityQueue.peek()); // Will Return Null if Queue is Empty
    }
}
