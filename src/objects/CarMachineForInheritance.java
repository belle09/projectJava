package objects;

// Child
// All instance methods and variables from parent class will be inherited by the child class, 
// provided that the child class uses the extends command
// Methods from a parent class can be called by the child class on the main program

public class CarMachineForInheritance extends MachineForInheritance {

	public void start() {
		System.out.println("Car started.");
	} // end method start()

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	} // end method wipeWindShield()

	public int carGas(int x, int y) {
		return x + y;
	} // end method carGas

	public void showInfo() {
		System.out.println("Car name: " + name);
	} // end method showInfo()

} // end CarMachineForInheritance
