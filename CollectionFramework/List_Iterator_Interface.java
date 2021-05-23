package CollectionFramework;

import java.util.*;

public class List_Iterator_Interface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);

        Iterator<Integer> integerIterator = list.listIterator();

        while(integerIterator.hasNext()) { // Forward Direction of Iteration
            System.out.println(integerIterator.next() + " Index is : " + ( (ListIterator<Integer>) integerIterator).nextIndex());
        }
        System.out.println();
        System.out.println();
        while(((ListIterator<Integer>) integerIterator).hasPrevious()) { // Backward Direction of Iteration
            System.out.println(((ListIterator<Integer>) integerIterator).previous() + " Index is : " + ((ListIterator<Integer>) integerIterator).previousIndex());
        }
    }
}
