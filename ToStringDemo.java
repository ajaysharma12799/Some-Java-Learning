import static java.lang.System.out;

class Customer {
	private String Name = "Ajay Sharma";
	private int age = 22;

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	public String toString() { // Default Implementation of toString Method of Object Class
		return getClass().getName() + "@" + Integer.toHexString(hashCode()) + " <= Object Class Default Implementation";
	}
}

class Custom_ToString extends Customer {
	
	@Override
	public String toString() {
		return ( "Customer Name : " + getName() + " Customer Age : " + getAge() );
	}

}

public class ToStringDemo {
	public static void main(String[] args) {
		
		Customer obj = new Customer();
		out.println(obj); // Currently Customer is Calling toString of Object class

		Custom_ToString CustomObj = new Custom_ToString();
		out.println(CustomObj); // Overriding Default toString of Object Class

	}
}