package tutorial1;

class MachineAnonymous {
	
	public void start() {
		System.out.println("Starting machine...");
	} // end method start()
	
} // end class MachineAnonymous’

public class anonymousClassesTraining {

	public static void main(String[] args) {

		MachineAnonymous machine1 = new MachineAnonymous() {
			@Override
			public void start() {
				System.out.println("Camera snapping..");
			} // end method start()
		}; // end machine1 object
		
		machine1.start();
		
	} // end main method

} // end class anonymousClassesTraining
