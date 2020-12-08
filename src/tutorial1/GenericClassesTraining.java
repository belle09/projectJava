package tutorial1;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
} // end class Animal

public class GenericClassesTraining {

	public static void main(String[] args) {
		// Modern style of ArrayList //
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Cat");
		strings.add("Dog");
		strings.add("Hamster");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		System.out.println(strings.get(2));
		
		// There can be more than one type of argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Java 7 Style //
		ArrayList<Animal> somelist = new ArrayList<>();
		
	} // end main

} // end class GenericClassesTraining
