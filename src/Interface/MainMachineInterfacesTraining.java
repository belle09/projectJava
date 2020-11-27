package Interface;

// Main program
public class MainMachineInterfacesTraining {

	public static void main(String[] args) {
		MachineForInterfacesTraining mach1 = new MachineForInterfacesTraining();
		mach1.start();
		
		PersonForInterfacesTraining person1 = new PersonForInterfacesTraining("Angel");		
		person1.greet();
		
		Info info1 = new MachineForInterfacesTraining();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println("\nThis is another example of interfaces:");
		
		outputInfo(mach1);
		outputInfo(person1);
	} // end main program

	private static void outputInfo(Info info) {
	 	info.showInfo();
	} // end method info()
	
} // end main class MainMachineInterfacesTraining
