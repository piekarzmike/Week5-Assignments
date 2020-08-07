//*********************************************************************************************
//
//	Box.java					Author: Mike Piekarz
//
//	Lab: # 5					Exercise: #1
//
//  Read from a file and print the highest integer in each row and identify the row count 
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 1
//	a) Create a text file called "input.csv" which contains the following three lines of numbers,
//	separated by commas:
//	1,4,6,7,8
//	2,3,1,5,6
//	3,2,1,4,5
//	
//	b) Write a program that reads the file you created (make sure it's in the right folder) and
//	outputs to the screen the largest number in each row. The output should looks like this:
//	Maximum values
//	ROW 1: 8
//	ROW 2: 6
//	ROW 3: 5 
//-----------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadCSV {

	public static void main(String[] args) {
		// Set file path, create file object, and initiate row count to zero
		String filePath = "C:\\Users\\mc36047\\eclipse-workspace\\Week5 Assignments\\input.csv";
		File file = new File(filePath);
		int rowCount = 0;

		try {
			Scanner csvFile = new Scanner(file);
			// Loop through each row within the file and print the row count and highest integer in the row
			while (csvFile.hasNext()) {
				String line = csvFile.next(); // get row of data 
				String[] values = line.split(","); // Separate data 
				Arrays.sort(values); // Sort array (acceding order)
				int maxIndex = values.length - 1; // identify array length
				rowCount++; // Track file row count
				System.out.println("Row" + rowCount + ": " + values[maxIndex]); // Print out
			}
			csvFile.close();// Close file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
