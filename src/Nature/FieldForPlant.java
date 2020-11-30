package Nature;

public class FieldForPlant {
	private Plant plant = new Plant();
	
	public FieldForPlant() {
		// this is a protected instance variable of Plant class
		// FieldForPlant is in the same package as Plant class
		System.out.println(plant.size);	
	} // end constructor FieldForPlant()
	
} // end class FieldForPlant
