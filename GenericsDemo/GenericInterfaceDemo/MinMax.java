package GenericsDemo.GenericInterfaceDemo;

public interface MinMax< T extends Comparable<T> > {
    T Min();
    T Max();
}
