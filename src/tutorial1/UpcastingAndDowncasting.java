package tutorial1;

class MachineUpDown {
	
	public void start() {
		System.out.println("Machine started.");
	} // end method start()
	
} // end class MachineUpDown

class Camera extends MachineUpDown {

	@Override
	public void start() {
		System.out.println("Camera started.");
	} // end method start()
	
	public void snap() {
		System.out.println("Photo taken.");
	} // end method snap()
	
} // end class Camera

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		MachineUpDown machine1 = new MachineUpDown();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting 
		MachineUpDown machine2 = camera1;		
		machine2.start();

		// Downcasting
		MachineUpDown machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		camera2.start();
	} //   end man

} // end class UpcastingAndDowncasting
