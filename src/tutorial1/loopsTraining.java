package tutorial1;

public class loopsTraining {

	public static void main(String[] args) {

		int sum = 0;
		int n = 1000;
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("\n The value of i is: " + i);
			
			sum = sum + i;
			System.out.println("i + sum is: " + sum);
		}

		System.out.println("\n Overall, the sum of natural number is: " + sum);		
		
	} // main method
} // class


