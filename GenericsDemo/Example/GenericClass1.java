package GenericsDemo.Example;

public class GenericClass1<T> {
    T obj;
    GenericClass1(T obj) {
        this.obj = obj;
    }

    T returnObj() {
        return obj;
    }

    void showObjType() {
        System.out.println("Type Of Given T is : " + obj.getClass().getName());
    }
}
