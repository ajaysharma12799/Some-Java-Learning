import java.util.Scanner;
import static java.lang.System.out;

public class StringExample {
	public static void main(String []args) {

		char[] ch = { 'a', 'b', 'c', 'd', 'e' }; // Creating String using Character Array
		
		String s = new String(ch); // This String will be created in Heap Area
		out.println(s);

		String Name = "Ajay Sharma"; // This String will be created in String Pool Area
		out.println(Name);

		// String Concatation
		String str1 = "Hello";
		str1 += " World!";
		/*
			Using Above 2 Line We Replace the str Refrence to new Object
		*/
		out.println(str1);

		String str2 = "Welcome";
		str2.concat(" To My Home");

		out.println(str2);

	}
}

/*
	Why String is Immutable :-
	
	=> Because String provide security, Because java uses the concept of string literal.
	Suppose there are 5 reference variables,all referes to one object "sachin".
	If one reference variable changes the value of the object, 
	It will be affected to all the reference variables. 
	That is why string objects are immutable in java.
*/