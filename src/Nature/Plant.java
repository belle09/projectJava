package Nature;

public class Plant {
	public String name;		// bad practice

	public final static int ID = 8;	// acceptable practice - it's final
	
	private String type;	// only within the class
	
	protected String size;	// within the class and its subclass
	
	int height;
	
	public Plant() {
		this.name = "Marigold";		
		this.type = "Flowering Plant";
		
		this.size = "medium";
		this.height = 8;
	} // end constructor Plan
	
} // end Plant
