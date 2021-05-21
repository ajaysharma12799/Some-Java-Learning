package GenericsDemo.BoundedType;

public class Stats<T extends Number> {
    T []nums; // Array of Numbers

    Stats(T []obj) {
        nums = obj;
    }

    double averageSum() {
        double sum = 0.0;
        for(int i=0; i< nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/ nums.length;
    }
}
