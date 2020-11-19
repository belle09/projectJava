package tutorial1;

import java.util.Scanner;

class registrationForm {
	
	int age;
	
	static void names (String fname, String lname, String suffix) {

		System.out.println("Firstname: " + fname);
		System.out.println("Lastname: " + lname);
		System.out.println("Suffix: " + suffix);
		
	} // end names method
	
	int total(int x, int y) {
		return x + y;
	} // end total method
	
	int eligible() {
		int free = 90 - age;

		return free;
	} // end eligible method
	
	int getAge() {
		return age;
	} // end getAge method

	
} // end myClass

public class declaringParametersTraining {

	public static void main(String[] args) {
		registrationForm newFname = new registrationForm(); // storing value
		
		newFname.names("James", "Ayala", "Jr");
		
		newFname.age = 20;
		
		int theAge = newFname.getAge();		
		System.out.println("Age is: " + theAge);
		
		
		int z = newFname.total(1,2);
		System.out.println("Total of goods: " + z);
		
		
		//int eligible = newFname.eligible();
		
		System.out.println("Eligible: " + newFname.eligible());
		
		
	} // end main
	
} // end class
