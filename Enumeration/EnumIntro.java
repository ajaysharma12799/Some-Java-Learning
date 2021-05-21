package Enumeration;

enum Fruits {
    Apple, Banana, Mango, Grapes
}

public class EnumIntro {
    public static void main(String[] args) {
        Fruits fruits = null; // It is Important to initialize enum to null
        System.out.println(fruits.Apple);

        /*
        *   values()
        *   valueof(String str)
        */

        Fruits []fruits1 = Fruits.values(); // Values Method
        for(Fruits singleFruit : fruits1) {
            System.out.println("All Value Return Type is Enum Type Only : " + singleFruit);
        }

        Fruits fruits2 = Fruits.valueOf("Mango");
        System.out.println("Value Return Type is Enum Type only ans Fruits Contain : " + fruits2);

    }
}
