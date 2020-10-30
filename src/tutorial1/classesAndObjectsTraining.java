package tutorial1;

class Person {
	
	// Instance Variable
	String name;
	int age;
	
	
} // end class

public class classesAndObjectsTraining {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "James Reeves";
		person1.age = 37;
		
		Person person2 = new Person();
	
		person2.name = "Angel Reeves";
		person2.age = 20;

		System.out.println(person1.name);
	}

}
