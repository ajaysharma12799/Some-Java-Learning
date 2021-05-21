package GenericsDemo.Example;

public class MainClass {
    public static void main(String[] args) {
        GenericClass1<String> obj = new GenericClass1<String>("Ajay Sharma");
        obj.showObjType();
        String value = obj.returnObj();
        System.out.println(value);
    }
}
