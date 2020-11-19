package tutorial1;

import java.util.Scanner;

class regForm {
	
	String name;
	int age;
	
	public String regName() {
		return name;
	} // end regName method
	
	public int regAge() {
		return age;
	} // end regAge method
	
} // end class

public class settersandthisSampleActivity {

	public static void main(String[] args) {

		regForm sampleRegForm = new regForm(); // store new regForm data
		Scanner inputScanner = new Scanner(System.in); // store data from input
		
		System.out.println("Enter your name: "); // label to ask data
		
		String inputRegName = inputScanner.nextLine(); // to get data
					
		System.out.println("Name is: " + inputRegName); // output data
		
		inputRegName = sampleRegForm.regName(); // get data from inputScanner
		
	} // end main

} // end class
