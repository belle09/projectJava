package Nature;

// subclass of Plant
public class Oak extends Plant {

	public Oak() {
		// This works; size is protected, Oak is a subclass of Plant.
		this.size = "large";	
		
		// no access specifier; works because Oak and Plant are in the same package.
		this.height = 10;
	} // end constructor Oak()
	
} // end class Oak