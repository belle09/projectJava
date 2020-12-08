package tutorial1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingTextFiles {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "exampletextfile.txt";
		
		File textfile = new File(fileName);
		
		Scanner in = new Scanner(textfile);		// Scanner for reading the file
		
		int value = in.nextInt();				// Reading the integer value of the file
		System.out.println("Read value: " + value);
		
		in.nextLine();		// used to read the Carriage Return and Line Feed character, the newline character
		
		int count = 2;
		while (in.hasNextLine()) {				// reads the file line-by-line
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		} // end while loop
		
		in.close();
	} // end main method

} // end class ReadingTextFiles
