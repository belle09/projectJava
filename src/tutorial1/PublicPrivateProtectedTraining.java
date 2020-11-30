package tutorial1;

import Nature.Plant;

/*
	Private – works only within the same class.
	Public – works from anywhere
	Protected – works same class, subclass, and same package
	No Modifier – works on same package only
*/
class ExampleOfNoAccessSpecifier {
	
} // end class ExampleOfNoAccessSpecifier

public class PublicPrivateProtectedTraining {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		// public instance variable
		System.out.println(plant.name);
		
		// public final static constant variable
		System.out.println(plant.ID);
		
		// this won't work; size is protected; the main program is not the same package as Plant
		//System.out.println(plant.size);
		
		// this won't work; App and Plan are in different packages; height has package-level visibility
		//System.out.println(plant.height);
		
	} // end main

} // end main class
