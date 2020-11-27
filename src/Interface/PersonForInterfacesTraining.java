package Interface;

// second concrete class
public class PersonForInterfacesTraining implements Info {
	
	private String name;
	
	public PersonForInterfacesTraining(String name) {
		this.name = name;
	} // end constructor PersonForInterfacesTraining

	public void greet() {
		System.out.println("Hello there.");
	} // end method greet()

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
	} // end showInfo()
	
} // end PersonForInterfacesTraining
