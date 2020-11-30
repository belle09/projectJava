package objects;

import Interface.Sports;
import Interface.Study;

public class Teacher extends Human implements Study, Sports {

	@Override
	public void study(String title, int repetition) {
		System.out.println("Teacher is studying " + title);
	}

	@Override
	public void getGrades(int grades) {
		System.out.println("The teacher's grade is: " + grades);
	} // end method getGrades

	@Override
	public void Chess() {
		System.out.println("Teacher is playing Chess");
	} // end method Chess()

	@Override
	public void preliminaryExam(String questionType) {
		System.out.println("The teacher's exam is " + questionType);
	} // end method preliminaryExam()

	
} // end class Teacher
