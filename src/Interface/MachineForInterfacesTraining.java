package Interface;

// concrete class
public class MachineForInterfacesTraining implements Info {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	} // end method start()

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	} // end showInfo()
	
} // end MachineForInterfacesTraining
