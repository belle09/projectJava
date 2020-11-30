package objects;

public class Plantpolymorphism {
	
	private String flower;
	private int plantSize;
	
	// flower instance variable
	public String getFlower() {
		return flower;
	} // end method getFlower()

	public void setFlower(String flower) {
		this.flower = flower;
	} // end method setFlower(String flower)

	// plantSize instance variable
	public int getPlantSize() {
		return plantSize;
	} // end method getPlantSize()

	public void setPlantSize(int plantSize) {
		this.plantSize = plantSize;
	} // end method setPlantSize
	
	// grow() method
	public void grow() {
		System.out.println("Plant growing");
	} // end class grow()
	
} // end class Plantpolymorphism
