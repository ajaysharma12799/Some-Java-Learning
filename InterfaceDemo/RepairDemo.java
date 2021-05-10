package InterfaceDemo;

public class RepairDemo {
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.carConcept();
        obj.accelerate();
        obj.braking();
        obj.print1();

        // Using Static Method With Interface Name
        Car.print2();

    }
}
