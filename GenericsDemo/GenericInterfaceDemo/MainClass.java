package GenericsDemo.GenericInterfaceDemo;

public class MainClass {
    public static void main(String[] args) {
        // Integer Implementation
        Integer []obj1 = {1, 2, 3, 4, 5};
        CustomImplementation customImplementation1 = new CustomImplementation(obj1);
        System.out.println(customImplementation1.Min());
        System.out.println(customImplementation1.Max());

        // Integer Implementation
        Character []obj2 = {'A', 'B', 'C', 'D', 'E'};
        CustomImplementation customImplementation2 = new CustomImplementation(obj2);
        System.out.println(customImplementation2.Min());
        System.out.println(customImplementation2.Max());
    }
}
