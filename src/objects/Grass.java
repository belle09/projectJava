package objects;

import Nature.Plant;

public class Grass extends Plant {
	
	public Grass() {
		// this won't work; Grass is not in same package as plant, even though its a subclass
		//System.out.println(this.height);
	} // end constructor Grass()
	
} // end class Grass
