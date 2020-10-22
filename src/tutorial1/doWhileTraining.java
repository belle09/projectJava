package tutorial1;

import java.util.Scanner;

public class doWhileTraining {

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);

		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scannerObject.nextInt();
		} 
		while (value != 5); 			
		
		System.out.println("Got 5");
	} // main end

} // class end
