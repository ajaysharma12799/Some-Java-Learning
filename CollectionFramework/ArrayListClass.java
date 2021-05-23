package CollectionFramework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> superHeros = new ArrayList<>();
        arrayList.add("Ajay");
        arrayList.add("Chikku");
        arrayList.add("Poplu");

        arrayList.add(3, "Wonder Women");

        superHeros.add("Batman");
        superHeros.add("SpiderMan");
        superHeros.add("SuperMan");
        superHeros.add("Flash");
        superHeros.add("AquaMan");

        arrayList.addAll(superHeros);

        String []convertedArray = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("Converted Array : " + Arrays.toString(convertedArray));

        System.out.println("ArrayList Element : ");
        for(String element : arrayList) {
            System.out.println(element);
        }
    }
}
