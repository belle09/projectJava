package tutorial1;

public class arraySampleTraining {

	public static void main(String[] args) {

		// iterating through an array: integer
		/*int[] numbers = {0,1,3,5,7,9,11,13,15};
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
				System.out.println("\ni: " + i);
				
				sum = i + sum;
				
				System.out.println("Total: " + sum);
		} // end for  
		
		
		// another iteration of array: String
		String[] phones = {"Apple","Samsung","Sony","Nokia"};
		
		for(String phone: phones) {
			System.out.println("\nMobile Unit: " + phone);
		} // end for */
		
		
		// Two arrays, one has data while another has none
		int[] id = {100,101,102,103};
		int[] grades = new int[3];
		
		for(int i=0; i<id.length; i++) {
			
			System.out.println("Grades: " + grades);
			
		}
			
	} // end main

} // end class
