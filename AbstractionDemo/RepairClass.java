// Main Class

public class RepairClass {
	
	public static void Repair(Car car) {
		System.out.println("Car is Repaired");
	}

	public static void main(String[] args) {

		Audi obj1 = new Audi();
		BMW obj2 = new BMW();

		Repair(obj1);
		Repair(obj2);

	}

}