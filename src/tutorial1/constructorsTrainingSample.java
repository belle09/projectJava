package tutorial1;

import objects.Animal;

public class constructorsTrainingSample {

	public static void main(String[] args) {
		Animal zoolandia = new Animal();
		
		zoolandia.setName("James");
		zoolandia.setAge(45);
		zoolandia.setHeight(150.50);
		zoolandia.setAddress("Subic");
		zoolandia.setId(0);
		
		System.out.println(zoolandia.toString());
		System.out.println(zoolandia.isValid());
	} // end main program

} // end class
