package tutorial1;

// Scanner 
import java.util.Scanner;

class Registration{
	Scanner inputHere = new Scanner(System.in);	
	String name;
	
	void newForm() {
		System.out.println("Enter your name: ");
	} // end newForm
	
	void formData() {
		System.out.println("Firstname: " + name);
	} // end formData
	
	
} // end class Registration

public class classesObjectsMethodsScannerTraining {

	public static void main(String[] args) {

		Registration personOne = new Registration();
		
		for(int i=0; i<3; i++) {
			personOne.newForm();
			personOne.name = personOne.inputHere.nextLine();
			personOne.formData();			
		} // outer for
		
	} // end main method

} // end main method class
