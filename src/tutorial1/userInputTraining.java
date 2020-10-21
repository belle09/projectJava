package tutorial1;

import java.util.Scanner;

public class userInputTraining {

	public static void main(String[] args) {

		for(int f=0; f<4; f++) {
			
			Scanner input = new Scanner(System.in);
			
			// First name
			System.out.println("Enter your First name: ");
			String name = input.nextLine();
			
			System.out.println("First name: " + name);
			
			// Last name
			System.out.println("\nEnter your last name: ");
			String lname = input.nextLine();
			
			System.out.println("last name: " + lname);			
			
			System.out.println("\nFull name is: " + name + " " + lname + "\n");
		} // end for
		
	} // main end

} // class end
