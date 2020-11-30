package tutorial1;

import Interface.Science;
import Interface.Sports;
import Interface.Study;
import objects.Human;
import objects.Student;
import objects.Teacher;

public class InterfacesTraining {

	public static void main(String[] args) {
		Student student1 = new Student();
		Teacher teacher1 = new Teacher();
		
		student1.setId(1); 			// set value
		id(student1);				// call method
		
		student1.setAge(18); 		// set value
		age(student1);				// call method
		
		student1.setName("Angel");	// set value
		name(student1);				// call method
		
		projects(student1); 		// call method
		
		student1.setGrades(10);		// set value
		grades(student1);			// call method
		
		exam(student1); 			// call method
		exam(teacher1);				// call method
	} // end main
	
	public static void aral(Study monkey) {
		monkey.study("Science", 3);
	} // end method aral
	
	public static void grades(Study result) {
		result.getGrades(0);
	} // end method grades
	
	public static void exam(Study exams) {
		exams.preliminaryExam("multiple choice");
	} // end method exam()
	
	public static void exercise(Sports activities) {
		activities.Chess();
	} // end method Exercise
	
	public static void id(Human human) {
		System.out.println("Hello, your ID is: " + human.getId());
	} // end method Tao
	
	public static void age(Human human) {
		System.out.println("Hello, your age is: " + human.getAge());
	} // end method age
	
	public static void name(Human human) {
		System.out.println("Hello, your name is: " + human.getName());
	} // end method name
	
	public static void projects(Science science) {
		science.experiment();
	} // end method projects
	
} // end main class InterfacesTraining
