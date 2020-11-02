package tutorial1;

class NewPerson {
	
	// Instance Variable
	String name;	
	int age;
	String address;
	int phonenumber;
	
} // end class

public class classesAndObjectsTraining {

	public static void main(String[] args) {
		
		NewPerson person1 = new NewPerson();
		
		//person1.name = "James Reeves";
		person1.address = "Marikina";
		person1.phonenumber = 9119191;
		person1.age = 37; 
		
		//System.out.println(person1.name);
		
		NewPerson person2 = new NewPerson();
	
		//person2.name = "Angel Reeves";
		person2.address = "Antipolo";
		person2.age = 20;
		person2.phonenumber = 9991919;
		
		//System.out.println(person2.name);
		

	} // end main

}