public class MainClass {
	
	public static void main(String[] args) {

		SingeltonClass SingleObj = SingeltonClass.getInstance();
		System.out.println(SingleObj.toString());

	}

}