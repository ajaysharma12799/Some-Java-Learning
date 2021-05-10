package InterfaceDemo;

public interface Car {
    // Fields of Interface
    public static final int wheels = 4;

    // Abstract Methods of Interface
    public abstract void accelerate();
    public abstract void braking();
    public abstract void carConcept();

    // Default Method in Interface
    default void print1() {
        System.out.println("This is Default Interface Method");
    }

    // Static Method in Interface
    static void print2() {
        System.out.println("This is Static Interface Method");
    }

    // Private Method in Interface
    private void print3() {
        System.out.println("This is Private Interface Method");
    }
}
