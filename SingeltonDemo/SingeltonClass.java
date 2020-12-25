public class SingeltonClass {

	private static SingeltonClass obj = null;

	private SingeltonClass() {
		System.out.println("Private Constructor of Singelton class");
	}

	public static SingeltonClass getInstance() {
		if(obj == null) {
			obj = new SingeltonClass();
		}
		return obj;
	}

}