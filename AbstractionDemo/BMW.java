package AbstractionDemo;

public class BMW extends Car{

	@Override
	public void Accelerate() {
		System.out.println("BMW is Accelerating");
	}

	@Override
	public void Brake() {
		System.out.println("BMW is Applying Brake");
	}

}