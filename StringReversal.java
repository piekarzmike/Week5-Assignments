//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 5					Exercise: #4
//
// 	Create a program that reverses the string inputed by the user
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 4
//	Create a class called StringReversal. Inside of it, create a recursive method called
//  reverseString that accepts a String s and returns a new String which is s in reverse
//  order. Create a driver program inside the main method to test your implementation.
//-----------------------------------------------------------------------------------------

// Import the Scanner class from the Java.util package
import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter in a string
		System.out.print("Enter in some text: ");
		String userInput;
		
		// Store user input into variable
		userInput = scan.nextLine();
		// Close scanner
		scan.close();
		
		// Call the reverseString method
		reverseString(userInput);

		// Print out user input in reverse
		System.out.println(reverseString(userInput));
	}
	
	// reverseString method is used to reverse the user's input through recursion 
	public static String reverseString (String str) {
		if (str.isEmpty()) {
			return str;
		}	
		else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
	
}
