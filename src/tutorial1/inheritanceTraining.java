package tutorial1;

import objects.CarMachineForInheritance;
import objects.MachineForInheritance;

public class inheritanceTraining {

	public static void main(String[] args) {
		MachineForInheritance machine1 = new MachineForInheritance();

		machine1.start();
		machine1.stop();

		CarMachineForInheritance car1 = new CarMachineForInheritance();

		car1.start(); // the car specific version
		car1.wipeWindShield();
		car1.stop();
		System.out.println("Remaining Gas: " + car1.carGas(10, 20) + " Liter");
		car1.start();
		car1.setPassword("password");
		System.out.println(car1.getPassword());
		car1.showInfo();

	} // end main

} // end class
