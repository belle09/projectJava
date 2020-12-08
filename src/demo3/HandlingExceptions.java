package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// this message is too vague
			System.out.println("Couldn't open file");
		}
		
	} // end main method

	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);
	} // end method openFile()
} // end class HandlingExceptions
