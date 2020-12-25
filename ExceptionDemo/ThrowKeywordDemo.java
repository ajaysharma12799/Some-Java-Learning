import java.util.Scanner;

public class ThrowKeywordDemo {
	
	static void validateAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Not Valid Age to Vote");
		}
		else {
			System.out.println("You are able to Vote");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		validateAge(age);

	}

}