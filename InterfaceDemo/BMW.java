package InterfaceDemo;

public class BMW implements Car {

    @Override
    public void accelerate() {
        System.out.println("Car is Accelerating");
    }

    @Override
    public void braking() {
        System.out.println("Car is Braking");
    }

    @Override
    public void carConcept() {
        System.out.println("Car Concept");
    }

    // Override Default Method
    @Override
    public void print1() {
        System.out.println("Overrided Default Method of Interface");
    }

}
