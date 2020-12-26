/* 

	https://medium.com/edureka/pattern-programs-in-java-f33186c711c8
	
	Different Type of Pattern

*/
import java.util.Scanner; // Normal Import Statement
import static java.lang.System.out; // Static Import Statement

public class StarPattern {

	public static void SquareStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				out.print("* ");
			}
			out.println();
		}
	}

	public static void RightTriangleStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				out.print("* ");
			}
			out.println();
		}
	}

	public static void MirroredRightTriangleStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*(n-i); j++) {
				out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				out.print(" *");
			}
			out.println();
		}
	}

	public static void InvertedRightTriangleStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i)+1; j++) {
				out.print("* ");
			}
			out.println();
		}
	}

	public static void InvertedMirroredRightTriangleStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				out.print("  ");
			}
			for(int k=1; k<=(n-i)+1; k++) {
				out.print("* ");
			}
			out.println();
		}
	}

	public static void HollowSquarePattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if( i == 1 || i == n || j == 1 || j == n ) {
					out.print("*");
				}
				else {
					out.print(" ");
				}
			}
			out.println();
		}
	}

	public static void PyramidStarPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				out.print(" *");
			}
			out.println();
		}
 	}

 	public static void LeftArrowStarPattern(int n) {
 		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i)+1; j++) {
				out.print("* ");
			}
			out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				out.print("* ");
			}
			out.println();
		}
 	}

 	public static void RightArrowStarPattern(int n) {
 		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				out.print("  ");
			}
			for(int k=1; k<=(n-i)+1; k++) {
				out.print("* ");
			}
			out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*(n-i); j++) {
				out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				out.print(" *");
			}
			out.println();
		}	
 	}

 	public static void OddPyramidStarPattern(int n) {
 		for(int i=1; i<=n; i++) {
 			for(int j=n; j>=i; j--) {
 				out.print(" ");
 			}
 			for(int k=1; k<=i; k++) {
 				out.print("*");
 			}
 			for(int l=2; l<=i; l++) {
 				out.print("*");
 			}
 			out.println();
 		}
 	}

 	public static void ReversePyramidPattern(int n) {
 		for(int i=1; i<=n; i++) {
 			for(int j=1; j<=i; j++) {
 				out.print(" ");
 			}
 			for(int k=n; k>=i; k--) {
 				out.print("*");
 			}
 			for(int l=n-1; l>=i; l--) {
 				out.print("*");
 			}
 			out.println();
 		}
 	}

 	public static void LeftDiagonalPattern(int n) {
 		for(int i=1; i<=n; i++) {
 			for(int j=1; j<=i; j++) {
 				out.print(" ");
 			}
 			out.println("*");
 		}
 	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.print("Enter N : ");
		int n = sc.nextInt();

		// SquareStarPattern(n);
		// RightTriangleStarPattern(n);
		// MirroredRightTriangleStarPattern(n);
		// InvertedRightTriangleStarPattern(n);
		// InvertedMirroredRightTriangleStarPattern(n);
		// HollowSquarePattern(n);
		// PyramidStarPattern(n);
		// LeftArrowStarPattern(n);
		// RightArrowStarPattern(n);
		// OddPyramidStarPattern(n);
		// ReversePyramidPattern(n);
		// LeftDiagonalPattern(n);

	}

}