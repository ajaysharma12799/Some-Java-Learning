package GenericsDemo;

public class GenericMethod {
    public static <T extends Comparable<T>, K extends T> boolean isNum(T x, K []arr) {
        for(int i=0; i<arr.length; i++)
            if(x.equals(arr[i])) return true;
        return false;
    }
    public static void main(String[] args) {
        Integer []nums = {1, 2, 3, 4, 5};
        String []strs = {"one", "two", "three", "four", "five"};

        // Checking Whether 1 is Number of Not
        if(isNum(1, nums)) {
            System.out.println("1 is Number");
        }
        else {
            System.out.println("1 is Not Number");
        }

        // Checking Whether One is String or Not
        if(isNum("One", strs)) {
            System.out.println("One is String");
        }
        else {
            System.out.println("One is Not String");
        }
    }
}
