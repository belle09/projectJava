package tutorial1;

class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes contain
	// 1. Data
	// 2. Subroutines (methods)
	
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old");	
		} // end outer loop
		
	} // end speak method

	void sayHello() {
		System.out.println("Hello there");
	} // end sayHello method
	
} // end Person class

public class subroutinesMethodTraining {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "Reuben Singe";
		person1.age = 30; 
		person1.speak();
		person1.sayHello();
		
		//System.out.println(person1.name);
		
		Person person2 = new Person();
		person2.name = "Angel Chat";
		person2.age = 20;
		person2.speak();
		person2.sayHello();
		//System.out.println(person2.name);
		
	} // end main

} // end class
