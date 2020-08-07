//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 5					Exercise: #2
//
// 	Create program that write user input into a file
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 2
//	Write a program that reads strings from the user and writes them to an output file called
//	userStrings.txt. Terminate processing when the user enters the string "DONE". Do not
//	write the sentinel string to the output file. 
//-----------------------------------------------------------------------------------------

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		// Set file path and create file object, 
		String filePath = "C:\\Users\\mc36047\\eclipse-workspace\\Week5 Assignments\\userstrings.txt";
		File file = new File(filePath);

		// Create scanner object and declare a String variable. 
		Scanner scan = new Scanner(System.in);
		String userInput;

		FileWriter fw = new FileWriter(file); // Used to open the file per the above stated file path
		BufferedWriter bw = new BufferedWriter(fw); // Allows program to run faster (stores data in memory instead of disk)
		PrintWriter outFile = new PrintWriter(bw); // Print user input into the file

		// Prompt user to enter in text.
		System.out.print("Enter some text here (Type DONE to exist): ");
		userInput = scan.nextLine();
		
		// Print string entered by user into the file until user inputs "DONE"
		while (!(userInput.equals("DONE"))) {
			outFile.println(userInput);
			System.out.print("Enter some text here (Type DONE to exist): ");
			userInput = scan.nextLine();
		}

		// Close PrintWriter and scanner object.
		outFile.close();
		scan.close();
	}
}
