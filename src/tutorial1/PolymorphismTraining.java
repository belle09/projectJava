package tutorial1;

import Interface.Materialspolymorphism;
import objects.Plantpolymorphism;
import objects.Treepolymorphism;

public class PolymorphismTraining {

	public static void main(String[] args) {
		Plantpolymorphism plant1 = new Plantpolymorphism();		
		Treepolymorphism tree = new Treepolymorphism();
		
		//Plantpolymorphism plant2 = plant1;
		Plantpolymorphism plant2 = tree;
		
		plant2.grow();
		tree.shedLeaves();
		
		//doGrow(tree);
		plant1.setFlower("Santan");		// call the reference object and set the value
		doGrow(plant1);					// call the method and add the reference object
		
		plant1.setFlower("Sunflower"); 	// call the reference object and set the value
		doGrow(plant1); 				// call the method and add the reference object
		
		doesGrow(tree);					// call the method and add the reference object
		
		PlantMaterials(tree);			// call the method and add the reference object
		
		PlantMaterials2(tree);			// call the method and add the reference object
		
		PlantMaterials3(tree); 			// call the method and add the reference object
		
		plant1.setPlantSize(20);		// call the reference object and set value
		doGrow2(plant1);				// call the method and add the reference object
	} // end main

	public static void doGrow(Plantpolymorphism plant) {
		//plant.grow();
		System.out.println("The flower is: " + plant.getFlower());
	} // end method doGrow()
	
	public static void doGrow2(Plantpolymorphism plant2) {
		System.out.println("The size of the plant is " + plant2.getPlantSize());
	} //  end method doGrow2
	
	public static void doesGrow(Treepolymorphism tree) {
		tree.shedLeaves();
	} // end method doesGrow()
	
	public static void PlantMaterials(Treepolymorphism tree1) {
		tree1.pot("large pot");
	} // end method PlantMaterials()
	
	public static void PlantMaterials2(Treepolymorphism tree2) {
		tree2.fertilizer("Nitrogen", 3);
	} // end method PlantMaterials()	
	
	public static void PlantMaterials3(Treepolymorphism tree3) {
		System.out.println(tree3.woodTypes("hardwoods"));
	} // end method PlantMaterials3()
	
	
} // end class PolymorphismTraining
