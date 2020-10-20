package tutorial1;

public class ifLoopsTraining {

	public static void main(String[] args) {

		int loop = 0;
		
		while(loop < 5) {
			System.out.println("Looping: " + loop);
			
			if(loop == 5) {
				break;
			} // end if
			
			loop++;
			System.out.println("Running");
		} // end while
		
	} // end main

} // end class
