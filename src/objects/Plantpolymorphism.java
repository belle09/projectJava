package objects;

public class Plantpolymorphism {
	
	private String flower;
	private int plantSize;
	protected String plantTypes;
	
	// flower instance variable
	public String getFlower() {					// Return type is String; get method
		return flower;
	} // end method getFlower()

	public void setFlower(String flower) {		// Return type is void; set method
		this.flower = flower;
	} // end method setFlower(String flower)

	// plantSize instance variable
	public int getPlantSize() {					// Return type is int; get method
		return plantSize;
	} // end method getPlantSize()

	public void setPlantSize(int plantSize) {	// Return type is void; set method
		this.plantSize = plantSize;
	} // end method setPlantSize
	
	// grow() method
	public void grow() {
		System.out.println("Plant growing");
	} // end class grow()
	
	// plantTypes instance variable
	public String getPlantTypes() {				// Return type is String; get method
		return plantTypes;
	} // end getPlantTypes()
	
	public void setPlantTypes(String plantTypes) {	// Return type is void; set method
		this.plantTypes = plantTypes;
	}
	
} // end class Plantpolymorphism
