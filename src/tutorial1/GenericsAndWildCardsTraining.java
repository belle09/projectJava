package tutorial1;

import java.util.ArrayList;

class MachineGenerics {

	@Override
	public String toString() {
		return " this is a Machine";
	} // end method toString()
	
} // end class MachineGenerics

class CameraGenerics extends MachineGenerics {

	@Override
	public String toString() {
		return " this is a Camera";
	}
	
} // end class CameraGenerics

public class GenericsAndWildCardsTraining {

	public static void main(String[] args) {

		ArrayList<MachineGenerics> list = new ArrayList<MachineGenerics>();
	
		list.add(new MachineGenerics());
		list.add(new MachineGenerics());
		
		// Child class
		ArrayList<CameraGenerics> list2 = new ArrayList<CameraGenerics>();
		
		list2.add(new CameraGenerics());
		list2.add(new CameraGenerics());
		
		showList(list2);
	} // end main program
	
	// Parameterized Parent Class Method
	public static void showList(ArrayList<?> list) {
		for(Object value: list) {
			System.out.println("The array list value is: " + value);
		} // end for-loop
	} // end method showList()

	
} // end class GenericsAndWildCardsTraining
