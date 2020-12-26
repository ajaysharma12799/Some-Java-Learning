/* 

	https://medium.com/edureka/pattern-programs-in-java-f33186c711c8
	
	Different Type of Pattern

*/
import java.util.Scanner; // Normal Import Statement
import static java.lang.System.out; // Static Import Statement

public class NumberPattern {

	public static void Pattern1(int n) {
		for(int i=1; i<=n; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				count++;
				out.print(count + " ");
			}
			out.println();
		}
	}

	public static void Pattern2(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				count++;
				out.print(count + " ");
			}
			out.println();
		}
	}

	public static void Pattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				out.print(i + " ");
			}
			out.println();
		}
	}

	public static void Pattern4(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				count++;
				out.print(count + "  ");
			}
			out.println();
		}
	}

	public static void Pattern5(int n) {
		for (int i=1; i<=n ; i++) {
			int count = i;
			for(int j=1; j<=i; j++) {
				out.print(count + " ");
				count--;
			}
			out.println();
		}
	}

	public static void Pattern6(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				out.print(j + " ");
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
	}

}