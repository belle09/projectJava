package tutorial1;

class Froggy {
	
	private int id;
	private String name;
	
	public Froggy(int id, String name) {
		this.id = id;
		this.name = name;
	} // Frog constructor
	
	public String toString() {
		
		return String.format("%-4d: %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		
	} // end toString() method
	
} // end class Frog

public class toStringAndObjectClassTraining {

	public static void main(String[] args) {
		Froggy frog1 = new Froggy(1, "Wil");
		Froggy frog2 = new Froggy(3, "Bob");
		
		System.out.println(frog1);
		System.out.println(frog2);
	} // end main

} // end main class
