package tutorial1;

class Plant {
	
	public static final int ID = 7;	// constant variable
	private String name;

	public String getData() {
		String data = "nine" + calculateGrowthForecast();
		
		return data;
	} // end method getData()

	private int calculateGrowthForecast() {
		return 9;
	} // end method calculateGrowthForecast()
	
	public String getName() {
		return name;
	} // end method getName()

	public void setName(String name) {
		this.name = name;
	} // end method setName()
	
} // end class Plant

public class EncapsulationAndAPITrainings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // end main

} // end class EncapsulationAndAPITrainings
