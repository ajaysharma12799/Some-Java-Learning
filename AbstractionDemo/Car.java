package AbstractionDemo;

public abstract class Car {
	
	public abstract void Accelerate(); // Abstract Method

	public abstract void Brake(); // Abstract Method

	public void CarConcept() { // Concrete Method
		System.out.println("Car Concept");
	}

}