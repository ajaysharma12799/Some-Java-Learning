package GenericsDemo.BoundedType;

public class MainClass {
    public static void main(String[] args) {
        Integer []arr1 = {1, 2, 3, 4, 5};
        Double []arr2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        Stats<Integer> obj1 = new Stats<Integer>(arr1);
        Stats<Double> obj2 = new Stats<Double>(arr2);
        System.out.println(obj1.averageSum());
        System.out.println(obj2.averageSum());
    }
}
