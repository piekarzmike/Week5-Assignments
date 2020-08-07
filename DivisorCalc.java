//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 5					Exercise: #3
//
// 	Create a program that identify the greatest common denominator between two integers
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 3
//	Design and implement a program that implements Euclid's algorithm for finding the greatest
//	common divisor of two positive integers. The greatest common divisor is the largest integer
//	that divides both values without producing a remainder. In a class called DivisorCalc,
//	define a static method called gcd that accepts two integers, num1 and num2. Create a driver
//	program inside the main method to test your implementation. The recursive algorithm is
//	defined as follows:
//	gcd(num1, num2) is num2 if num2 <= num1 and num2 divides num1
//	gcd(num1, num2) is gcd(num2, num1) if num1 < num2
//	gcd(num1, num2) is gcd(num2, num1%num2) otherwise
//-----------------------------------------------------------------------------------------

public class DivisorCalc {

	public static void main(String[] args) {
		// Declare and initialize variables
		int num1 = 4;
		int num2 = 12;

		// Call the gcd method
		gcd(num1, num2);

		// Print the greatest common denominator from gcd method
		System.out.println(gcd(num1, num2));
	}

	// gcd method is used to identify the greatest common denominator through
	// recursion
	public static int gcd(int num1, int num2) {

		if (num2 <= num1 && (num1 % num2 == 0)) {
			return num2;
		} else if (num1 < num2) {
			return gcd(num2, num1);
		} else {
			return gcd(num2, num1 % num2);
		}
	}

}
