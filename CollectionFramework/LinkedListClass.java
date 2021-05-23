package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> superHeros = new LinkedList();
        superHeros.add("BatMan");
        superHeros.add("SuperMan");
        superHeros.add("AquaMan");
        superHeros.addFirst("IronMan");
        superHeros.addLast("Thor");
        superHeros.add(1, "Hulk");
        superHeros.add(1, "NunuMan");

        String []convertedArray = superHeros.toArray(new String[superHeros.size()]);
        System.out.println(Arrays.toString(convertedArray));

        superHeros.remove("NunuMan");

        System.out.println("SuperHero Names : ");
        for(String element : superHeros) {
            System.out.println(element);
        }
    }
}
