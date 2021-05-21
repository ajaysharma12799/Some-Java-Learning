package GenericsDemo.GenericInterfaceDemo;

public class CustomImplementation< T extends Comparable<T> > implements MinMax<T> {
    T []arr;

    CustomImplementation(T []arr) {
        this.arr = arr;
    }

    @Override
    public T Min() {
        T v = arr[0]; // Storing Min Value Initially

        for (int i=0; i<arr.length; i++) {
            if(arr[i].compareTo(v) < 0) v = arr[i];
        }
        return v;
    }

    @Override
    public T Max() {
        T v = arr[0]; // Storing Max Value initially

        for (int i=0; i<arr.length; i++) {
            if(arr[i].compareTo(v) > 0) v = arr[i];
        }
        return v;
    }
}
