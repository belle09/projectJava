package objects;

import Interface.Materialspolymorphism;

public class Treepolymorphism extends Plantpolymorphism implements Materialspolymorphism{

	@Override
	public void grow() {
		System.out.println("Tree growing");
	} // end method grow()
	
	public void shedLeaves() {
		System.out.println("Leaves shedding");
	} // end method shedLeaves()

	@Override
	public void pot(String title) {
		System.out.println("The material is: " + title);
	} // end method String pot

	@Override
	public void fertilizer(String type, int size) {
		System.out.println("The fertilizer type is: " + type + " and the size is " + size);
	} // end method fertilizer()

	@Override
	public String woodTypes(String woodType) {
		return "The type of wood is " + woodType;
	} // end method woodTypes()
	
	public void treePlantTypes() {
		System.out.println("The type of plant is " + plantTypes);
	} // end method treePlantTypes()
	
	
} // end class Treepolymorphism
