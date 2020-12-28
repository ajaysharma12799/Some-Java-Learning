/* 

	https://medium.com/edureka/pattern-programs-in-java-f33186c711c8
	
	Different Type of Pattern

*/
import java.util.Scanner; // Normal Import Statement
import static java.lang.System.out; // Static Import Statement

public class CharacterPattern {

	public static void Pattern1(int n) {
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}

	public static void Pattern2(int n) {
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=i; j++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}

	public static void Pattern3(int n) {
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				out.print(ch + " ");
			}
			ch++;
			out.println();
		}
	}

	public static void Pattern4(int n) {
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=i; j++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
		for(int i=2; i<=n; i++) {
			char ch = 'A';
			for(int j=n; j>=i; j--) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}	
	}

	public static void Pattern5(int n) {
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=n; j>=i; j--) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}

	public static void Pattern6(int n) {
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=n; j>=i; j--) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=i; j++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}

	public static void Pattern7(int n) {
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=n; j>=i; j--) {
				out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}

	public static void Pattern8(int n) {
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				out.print(ch + " ");
				ch++;
			}
			out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.print("Enter N : ");
		int n = sc.nextInt();

		// Pattern1(n);
		// Pattern2(n);
		// Pattern3(n);
		// Pattern4(n);
		// Pattern5(n);
		// Pattern6(n);
		// Pattern7(n);
		// Pattern8(n);
	}

}