package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {

	public static void main(String[] args) {

		File file = new File("test.txt"); 
		
		try {
			FileReader fr = new FileReader(file);
			
			// This will not be executed when an exception is thrown
			System.out.println("Continuing...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found: " + file.toString());
		} // end FileReader try catch
		
	} // end main method

} // end class HandlingExceptions
