package tutorial1;

public class arraySampleTraining {

	public static void main(String[] args) {

		int[] numbers = {0,1,3,5,7,9,11,13,15};
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
				System.out.println("\ni: " + i);
				
				sum = i + sum;
				
				System.out.println("Total: " + sum);
		} // end for
		
	} // end main

} // end class
