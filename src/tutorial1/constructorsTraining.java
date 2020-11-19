package tutorial1;

class Machine {
	private String name;
	private int code;

	public Machine() { // a constructor with no parameters
		this("Arnie", 0); // calls another constructor

		System.out.println("Constructor running!");
	} // end Machine method

	public Machine(String name) { // a constructor with String parameter
		this(name, 0);
		
		System.out.println("Second constructor running");
		// this.name = name;
	} // end Machine() method

	public Machine(String name, int code) {

		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	} // end Machine method

} // end Machine class

public class constructorsTraining {

	public static void main(String[] args) {
		Machine machine1 = new Machine(); // calls the 1st constructor

		Machine machine2 = new Machine("Nick"); // calls the 2nd constructor
		
		Machine machine3 = new Machine("Reuben", 9); // calls the 3rd constructor
		// new Machine();
	} // end main

} // end class
