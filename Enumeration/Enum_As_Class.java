package Enumeration;

enum Numerical {
    One(10), Two(20), Three(30);
    private int price; // Instance Member
    Numerical() { // Default Constructur
        price = -1;
    }

    Numerical(int price) { // Parametrize Constructor
        this.price = price;
    }

    public int getPrice() { // Method
        return price;
    }
}

public class Enum_As_Class {
    public static void main(String[] args) {
        Numerical numerical = Numerical.Two;
        System.out.println(numerical.getPrice());
    }
}
